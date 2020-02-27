package DataModels.DataConstraints;

import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

public class CommonConstraints {
    protected static String prefix = "T_";
    protected static boolean useLetters = true;
    protected static boolean useNumbers = true;

    protected static String generateTestValue(int maxLength) {
        return (prefix + RandomStringUtils.random((maxLength-prefix.length()), useLetters, useNumbers));
    }
}
