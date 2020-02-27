package DataModels.DataConstraints;

public class Mmsi extends CommonConstraints {

    private static int _maxLength = 9;

    public static String generateTestValue() {
        return generateTestValue(_prefix, _maxLength, _useLetters, _useNumbers);
    }
}
