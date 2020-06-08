package DataModels.DataConstraints;

public class Ircs extends CommonConstraints {

    private static int _maxLength = 8;

    public static String generateTestValue() {
        return generateTestValue(_prefix, _maxLength, _useLetters, _useNumbers);
    }
}
