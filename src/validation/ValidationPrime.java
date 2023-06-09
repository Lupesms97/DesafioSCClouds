package validation;

public class ValidationPrime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        // a ideia aqui é fazer a verificação com base nos numeros 2 3 5
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
