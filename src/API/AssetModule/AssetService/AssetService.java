package API.AssetModule.AssetService;

import API.BaseAPIService;
import API.APISecurity;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static Utilities.Constants.*;

import java.io.IOException;

public class AssetService extends BaseAPIService {

    public enum InvocationType { GET, PUT, DELETE, POST };
    private String createAssetPath = "/asset";
    private InvocationType createAssetPathInvocation = InvocationType.GET;
    private static String CreateAssetURL = "http://liaswf05u:28080/unionvms/asset/rest/asset";


    public static String CreateAsset(String assetData)  throws IOException {

        RequestBody body = RequestBody.create(inputContentType, assetData);
        Request request = GetRequest(CreateAssetURL, body);
        Response response = GetResponse(request);

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
