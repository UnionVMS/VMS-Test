package API;

import API.AssetModule.AssetService.AssetService;
import okhttp3.*;
import org.apache.cxf.common.util.Base64Utility;
import org.json.JSONObject;

import java.io.IOException;

import static Utilities.Constants.*;

public class BaseAPIService {

    protected static OkHttpClient client = new OkHttpClient();

    protected static Request Create(String URL, RequestBody requestBody, InvocationType invocationType) {

        switch(invocationType) {
            case GET:
                return GetRequest(URL,
                        requestBody,
                        inputContentType.toString(),
                        cacheControl, APISecurity.getTokenString(),
                        outputContentType.toString());
            case PUT:
            case POST:
            case DELETE:
            default:
                return null;
        }
    }

    protected static Response Execute(Request request) {
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static Request GetRequest(String URL,
                                        RequestBody requestBody,
                                        String contentType ,
                                        String cacheControl,
                                        String authorization,
                                        String accept) {

        Request request = new Request.Builder()
                .url(URL)
                .post(requestBody)
                .addHeader("content-type", contentType)
                .addHeader("cache-control", cacheControl)
                .addHeader("authorization", authorization)
                .addHeader("accept", accept)
                .build();
        return request;
    }

}


