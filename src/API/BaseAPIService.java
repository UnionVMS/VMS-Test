package API;

import okhttp3.*;
import org.apache.cxf.common.util.Base64Utility;
import org.json.JSONObject;

import java.io.IOException;

import static Utilities.Constants.*;

public class BaseAPIService {

    public static MediaType inputContentType = MediaType.parse("application/json");
    public static MediaType outputContentType = MediaType.parse("application/json");
    public static String cacheControl = "no-cache";
    public static OkHttpClient client = new OkHttpClient();

    public static RequestBody getTokenRequestBody(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", username);
        jsonObject.put("password", password);

        return RequestBody.create(inputContentType, jsonObject.toString());
    }

    protected static String getBase64EncodedUsernamePassword(String username, String password){
        return ("Basic " + Base64Utility.encode((username + ":" + password).getBytes()));
    }

    private static Request getTokenRequest(RequestBody requestBody) {

        Request tokenRequest = new Request.Builder()
                .url(usmURL)
                .post(requestBody)
                .addHeader("content-type", inputContentType.toString())
                .addHeader("cache-control", cacheControl)
                .addHeader("authorization", getBase64EncodedUsernamePassword(username, password))
                .build();
        return tokenRequest;
    }

    private static Response getTokenResponse(Request request) {
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    protected static String getTokenString() {
        Response response = getTokenResponse(getTokenRequest(getTokenRequestBody()));
        String token = null;
        try {
            token = new JSONObject(response.body().string()).getString("jwtoken");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return token;
    }
}
