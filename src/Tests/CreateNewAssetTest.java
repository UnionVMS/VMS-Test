package Tests;

import DataModels.AssetData;
import PageObjects.AssetsPage;
import Utilities.Constants;
import okhttp3.*;
import org.apache.cxf.common.util.Base64Utility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.json.JSONObject;
import org.testcontainers.containers.PostgreSQLContainer;

import org.postgresql.Driver;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertEquals;

//@RunWith(Parameterized.class)
//@ExtendWith(SpringExtension.class)
public class CreateNewAssetTest extends AssetTest {

    private AssetData assetData;

    public CreateNewAssetTest() {
       // super.setUpBeforeTestClass();
    }

/*    @Parameters
    public static String[] assetFiles() {
        return new String[] { "Asset_01", "Asset_02", "Asset_03" };
    }*/

/*    @BeforeEach
    public void setUpBeforeTestMethod() {
        System.out.println("CNAT BeforeEach");
        // initialize testPage
        // login to the app, if necessary
        super.setUpBeforeTestMethod();

    }*/

    @ParameterizedTest
    @ValueSource(strings = { "Asset_01", "Asset_02" })
    public void CreateNewAsset (String dataFile) throws IOException {

        assetData = AssetData.get(dataFile);

        //AssetsPage assetsPage = (AssetsPage) testPage;
        //assetsPage.createNewAsset(assetData);
        //assertTrue(true) ;

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, assetData.toString());

        String USMurl = "http:liaswf05u:28080/unionvms/usm-administration/rest/authenticate";


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", "vms_admin_se");
        jsonObject.put("password", "password");

        RequestBody usmBody = RequestBody.create(mediaType, jsonObject.toString());
//        RequestBody usmBody = jsonObject.toString().toRequestBody("application/json; charset=utf-8".toMediaTypeOrNull());
        //RequestBody usmBody = RequestBody.create(mediaType, "\"userName\": " +  "vms_admin_se" + ", \"password\": " + "password");

        Request tokenRequest = new Request.Builder()
                .url(USMurl)
                .post(usmBody)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
//                .addHeader("Authorization", "Basic Base64_encoded_clientId:clientSecret")
                .addHeader("authorization", "Basic " + Base64Utility.encode("vms_admin_se:password".getBytes()))

//                .addHeader("Accept", "application/x-www-form-urlencoded")
                .build();

/*        String username = "" // your username
        String password = "" // your password
        String userAndPass = username + ":" + password;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Basic " +
                Base64Utility.encode(userAndPass.getBytes()));
        HttpEntity<?> entity = new HttpEntity<>(headers);

        String authUri = "" // uri to service which you get the token from
        ResponseEntity<AuthenticationToken> response =
                restTemplate.exchange(authUri, HttpMethod.POST, entity,
                        AuthenticationToken.class);
        String token = response.getBody().getToken();
  */

        Response usmResponse = client.newCall(tokenRequest).execute();

        String token = new JSONObject(usmResponse.body().string()).getString("jwtoken");



/*        String token = given()
                .contentType("application/json")
                .body(new User("someuser" , "123"))
                .when()
                .post(RestConfig.baseUrl+"/authentication-url")
                .then().extract().response().as(TokenResponse.class).getToken();

        given()
                .contentType("application/json")
                .header("Authorization", token)
                .get(RestConfig.baseUrl+"/some-path")
                .then()
                .statusCode(200)...       */

        Request request = new Request.Builder()
                .url("http://liaswf05u:28080/unionvms/asset/rest/asset")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Authorization", token)
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();

        // Grab id and add contact
        System.out.println(response.body().string());


        try {

        String url = "jdbc:postgresql://lipsql02u/unionvmsdev?user=postgres&password=password&ssl=false";
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url);
        int foovalue = 500;
            PreparedStatement st = conn.prepareStatement("select * from asset.asset where cfr = 'SWE0000F9999'");  // WHERE columnfoo = ?");
//            st.setInt(1, foovalue);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                System.out.print("Got it! ");
                System.out.println(rs.getString("cfr"));
            }
            rs.close();
            st.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
/*

        PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:11.1")
                .withDatabaseName("unionvmsdev")
                .withUsername("postgres")
                .withPassword("");
        postgreSQLContainer.start();

        Statement statement = ds.getConnection().createStatement();
        statement.execute("SELECT 1");

        ResultSet resultSet = performQuery(postgreSQLContainer, "SELECT 1");
        int resultSetInt = 0;
        try {
            resultSetInt = resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals("A basic SELECT query succeeds", 1, resultSetInt);
*/

// TODO Hur hantera testdata? Slumpa in värden? Radera efter test? Nollställ efter suite? Kunna testa mot skarp data? Läsa upp data att testa med? DBUnit?
// Lägg till generering av randomnummer baserat på längd. Ha hantering av krockar på ett fint sätt.
// När testsuiten startar om så nollställs databasen.
// Hur göra med test av delad miljö/kopia på proddata? Flagga för att radera data efter test med SQL/API


        }
    }

