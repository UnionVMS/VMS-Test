package DataModels;

import DataModels.DataConstraints.Cfr;
import DataModels.DataConstraints.Imo;
import DataModels.DataConstraints.Ircs;
import DataModels.DataConstraints.Mmsi;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AssetData extends DataModelBase{


    @JsonProperty("grossTonnageUnit")
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
    public String cfr;

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

    public void randomizeData() {
        cfr = Cfr.generateTestValue();
        ircs = Ircs.generateTestValue();
        mmsi = Mmsi.generateTestValue();
        imo = Imo.generateTestValue();
    }

    public static AssetData get(String filename) throws IOException {
        String fullFileName = "src/test/resources/" + filename + ".json";
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fullFileName), AssetData.class);
    }

}
