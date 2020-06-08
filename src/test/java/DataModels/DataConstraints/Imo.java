package DataModels.DataConstraints;

public class Imo extends CommonConstraints {

    private static int _maxLength = 7;

    public static String generateTestValue() {
        return generateTestValue(_prefix, _maxLength, _useLetters, _useNumbers);
    }
}
