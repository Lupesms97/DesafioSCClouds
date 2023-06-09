package Validador;

public class ValidationNumber {
    public static boolean isNumero(String entrada) {
        try {
            double numero = Double.parseDouble(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
