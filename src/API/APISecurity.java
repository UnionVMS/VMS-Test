package API;

import okhttp3.*;
import org.apache.cxf.common.util.Base64Utility;
import org.json.JSONObject;

import java.io.IOException;

import static Utilities.Constants.*;

public class APISecurity {

    private static OkHttpClient client = new OkHttpClient();

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

    public static String getTokenString() {
        Response response;
        String token = null;
        try {
        response = getTokenResponse(getTokenRequest(getTokenRequestBody()));
            token = new JSONObject(response.body().string()).getString(tokenKey);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return token;
    }

}
