package linear;

import validation.ValidationPrime;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberLinear {
    static List<Integer> primeList = new ArrayList<>();

    public static void primeLinear(int x){

        for(int j = 2; j <= x; j++){
            if(ValidationPrime.isPrime(j)) primeList.add(j);
        }
    }

    public static void showLinearPrimeList() {
        System.out.println(primeList);
    }
}
