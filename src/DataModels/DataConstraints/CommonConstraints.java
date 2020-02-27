package DataModels.DataConstraints;

import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

public class CommonConstraints {
    protected static String _prefix = "T_";
    protected static boolean _useLetters = true;
    protected static boolean _useNumbers = true;

    protected static String generateTestValue(String prefix, int maxLength, boolean useLetters, boolean useNumbers) {
        return (prefix + RandomStringUtils.random((maxLength-prefix.length()), useLetters, useNumbers));
    }
}
