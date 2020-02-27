package DataModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

public class GrossTonnageUnit {

    private String grossTonnageUnit;
    private static String prefix = "T_";
    private static int maxLength = 7;
    private static boolean useLetters = true;
    private static boolean useNumbers = true;

    public GrossTonnageUnit(String grossTonnageUnit) {
        this.grossTonnageUnit = grossTonnageUnit;
    }

    public String getGrossTonnageUnit() {
         return grossTonnageUnit;
    }

    public void setGrossTonnageUnit(String grossTonnageUnit) {
        this.grossTonnageUnit = grossTonnageUnit;
    }

    @Override
    public String toString() {
        return grossTonnageUnit;
    }

    public String generateTestValue() {
        return (prefix + RandomStringUtils.random((maxLength-prefix.length()), useLetters, useNumbers));
    }
}