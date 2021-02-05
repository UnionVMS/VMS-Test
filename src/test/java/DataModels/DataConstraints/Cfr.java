package DataModels.DataConstraints;

public class Cfr extends CommonConstraints {

    private static int _maxLength = 12;
    protected static String _prefix = "SWET_";

    public static String generateTestValue() {
        return generateTestValue(_prefix, _maxLength, _useLetters, _useNumbers);
    }
}
