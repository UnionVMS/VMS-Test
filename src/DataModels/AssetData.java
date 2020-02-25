package DataModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class AssetData {
    @JsonProperty("firstname")
    String firstname;

    @JsonProperty("lastname")
    String lastname;

    @JsonProperty("dob")
    String DOB;

    @JsonProperty("email")
    String email;

    @JsonProperty("address")
    String address;

    @JsonProperty("cc")
    CC cc;

    @JsonProperty("product")
    Product product;

    static class CC {
        @JsonProperty("number")
        String number;

        @JsonProperty("billing")
        String billingAddress;
    }

    static class Product {
        @JsonProperty("searchCriteria")
        String criteria;
    }

    public static AssetData get(String filename) throws IOException {
        //resourcesloader.class.getClassLoader().getResource("package1/resources/repository/SSL-Key/cert.jks").toString();
        String fullFileName = "src/Data/" + filename + ".json";
//        URL url = AssetData.class.getResource(filename);
//        File file = new File(url.getPath());
        ObjectMapper mapper = new ObjectMapper();
           return mapper.readValue(new File(fullFileName), AssetData.class);
    }
}
