package linear;

import validation.ValidationPrime;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberLinear {
    static List<Integer> primeList = new ArrayList<>();

    public static void primeLinear(int x){

        for(int j = 2; j <= x; j++){
            if(ValidationPrime.isPrime(x)) primeList.add(x);
        }
    }

    public static void showLinearPrimeList() {
        System.out.println(primeList);
    }
}
