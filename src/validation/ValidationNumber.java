package validation;

public class ValidationNumber {
    public static boolean isNumber(String entrada) {
        try {
            double numero = Double.parseDouble(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
