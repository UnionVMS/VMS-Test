package DataModels;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ContactData extends DataModelBase{

    @JsonProperty("assetId")
    String assetId;

    @JsonProperty("name")
    String name;

    @JsonProperty("email")
    String email;

    @JsonProperty("phoneNumber")
    String phoneNumber;

    @JsonProperty("country")
    String country;

    @JsonProperty("cityName")
    String cityName;

    @JsonProperty("zipCode")
    String zipCode;

    @JsonProperty("type")
    String type;

    public static ContactData get(String filename) throws IOException {
        String fullFileName = "src/test/resources/" + filename + ".json";
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fullFileName), ContactData.class);
    }


}
