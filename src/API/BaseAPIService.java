package API;

import API.AssetModule.AssetService.AssetService;
import okhttp3.*;
import org.apache.cxf.common.util.Base64Utility;
import org.json.JSONObject;

import java.io.IOException;

import static Utilities.Constants.*;

public class BaseAPIService {

    protected static OkHttpClient client = new OkHttpClient();
//    private enum InvocationType { GET, PUT, DELETE, POST };
//    private String createAssetPath = "/asset";
//    private AssetService.InvocationType createAssetPathInvocation = AssetService.InvocationType.GET;


    protected static Response Get(Request request) {
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    protected static Request GetRequest(String URL,
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

    protected static Request GetRequest(String URL, RequestBody requestBody) {
         return GetRequest(URL,
                            requestBody,
                            inputContentType.toString(),
                            cacheControl, APISecurity.getTokenString(),
                            outputContentType.toString());
    }

    protected static Response GetResponse(Request request) {
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}


