package DataModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AssetData {

    @JsonProperty("grossTonnageUnit")
    //GrossTonnageUnit grossTonnageUnit;
    String grossTonnageUnit;

    @JsonProperty("flagStateCode")
    String flagStateCode;

    @JsonProperty("ircs")
    String ircs;

    @JsonProperty("name")
    String name;

    @JsonProperty("externalMarking")
    String externalMarking;

    @JsonProperty("cfr")
    String cfr;

    @JsonProperty("imo")
    String imo;

    @JsonProperty("portOfRegistration")
    String portOfRegistration;

    @JsonProperty("mmsi")
    String mmsi;

    @JsonProperty("lengthOverAll")
    String lengthOverAll;

    @JsonProperty("lengthBetweenPerpendiculars")
    String lengthBetweenPerpendiculars;

    @JsonProperty("grossTonnage")
    String grossTonnage;

    @JsonProperty("powerOfMainEngine")
    String powerOfMainEngine;

    @JsonProperty("prodOrgName")
    String prodOrgName;

    @JsonProperty("prodOrgCode")
    String prodOrgCode;

    @JsonProperty("vesselType")
    String vesselType;

/*    @JsonProperty("firstname")
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
    }*/

    public static AssetData get(String filename) throws IOException {
        String fullFileName = "src/Data/" + filename + ".json";
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fullFileName), AssetData.class);
    }

    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
