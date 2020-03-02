package API;

import okhttp3.*;

import java.io.IOException;

import static Utilities.Constants.*;

public class BaseAPIService {

    protected static OkHttpClient client = new OkHttpClient();

    protected static Request Create(String URL, RequestBody requestBody, InvocationType invocationType) {

        switch(invocationType) {
            case POST:
                return PostRequest(URL,
                        requestBody,
                        inputContentType.toString(),
                        cacheControl, APISecurity.getTokenString(),
                        outputContentType.toString());
            case PUT:
            case GET:
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

    private static Request PostRequest(String URL,
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


