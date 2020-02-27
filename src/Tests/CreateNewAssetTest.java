package Tests;

import DataModels.AssetData;
import Database.DBUtils;
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


import static Utilities.Constants.*;
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
        assetData.randomizeData();

        //AssetsPage assetsPage = (AssetsPage) testPage;
        //assetsPage.createNewAsset(assetData);
        //assertTrue(true) ;

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, assetData.toString());


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", username);
        jsonObject.put("password", password);

        RequestBody usmBody = RequestBody.create(mediaType, jsonObject.toString());

        Request tokenRequest = new Request.Builder()
                .url(usmURL)
                .post(usmBody)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("authorization", "Basic " + Base64Utility.encode("vms_admin_se:password".getBytes()))
                .build();

        Response usmResponse = client.newCall(tokenRequest).execute();

        String token = new JSONObject(usmResponse.body().string()).getString("jwtoken");

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

        DBUtils.DeleteAssetBasedOnCFR(assetData.cfr);



// TODO Hur hantera testdata? Slumpa in värden? Radera efter test? Nollställ efter suite? Kunna testa mot skarp data? Läsa upp data att testa med? DBUnit?
// Lägg till generering av randomnummer baserat på längd. Ha hantering av krockar på ett fint sätt.
// När testsuiten startar om så nollställs databasen.
// Hur göra med test av delad miljö/kopia på proddata? Flagga för att radera data efter test med SQL/API


        }
    }

