package Utilities;

import okhttp3.*;
import org.apache.cxf.common.util.Base64Utility;
import org.json.JSONObject;

import static Utilities.Constants.*;

public class Security {

/*    OkHttpClient client = new OkHttpClient();

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

    String token = new JSONObject(usmResponse.body().string()).getString("jwtoken");*/
}
