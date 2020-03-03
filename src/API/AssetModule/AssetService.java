package API.AssetModule;

import API.APIUtils;
import API.BaseAPIService;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static Utilities.Constants.*;

import java.io.IOException;

public class AssetService extends BaseAPIService {

    public static String CreateAsset(String assetData)  throws IOException {

        RequestBody body = RequestBody.create(inputContentType, assetData);
        Request request = Create(createAssetURL, body, createAssetInvocationType);
        Response response = Execute(request);

        String responseBody = null;
        try {
            responseBody = response.body().string();
            return responseBody;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
    public static String CreateContact(String assetID, String contactData)  throws IOException {

        String updatedContactData = APIUtils.SetNodeValue(contactData, "assetId", assetID);
        RequestBody body = RequestBody.create(inputContentType, updatedContactData);
        Request request = Create(createContactURL, body, createContactInvocationType);
        Response response = Execute(request);
            return response.message();

    }
}
