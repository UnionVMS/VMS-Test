package API.AssetModule;

import API.BaseAPIService;
import API.APISecurity;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static Utilities.Constants.*;

import java.io.IOException;

public class AssetService extends BaseAPIService {

    private enum InvocationType { GET, PUT, DELETE, POST };
    private String createAssetPath = "/asset";
    private InvocationType createAssetPathInvocation = InvocationType.GET;
    private static String CreateAssetURL = "http://liaswf05u:28080/unionvms/asset/rest/asset";

    private static Request GetCreateAssetRequest(RequestBody requestBody) {
        Request request = new Request.Builder()
                .url(CreateAssetURL)
                .post(requestBody)
                .addHeader("content-type", inputContentType.toString())
                .addHeader("cache-control", cacheControl)
                .addHeader("authorization", APISecurity.getTokenString())
                .addHeader("accept", outputContentType.toString())
                .build();
        return request;
    }

    private static Response getCreateAssetResponse(Request request) {
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static String CreateAsset(String assetData)  throws IOException {

        RequestBody body = RequestBody.create(inputContentType, assetData);
        Request request = GetCreateAssetRequest(body);
        Response response = getCreateAssetResponse(request);

        String responseBody = null;
        try {
            responseBody = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseBody;
//        System.out.println(responseBody);

//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(responseBody, AssetData.class);
    }

}
