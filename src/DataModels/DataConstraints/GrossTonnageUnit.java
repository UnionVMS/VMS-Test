package DataModels.DataConstraints;

import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

public class GrossTonnageUnit extends CommonConstraints {

    private static int maxLength = 7;

    public static String generateTestValue() {
        return generateTestValue(maxLength);
    }
}
