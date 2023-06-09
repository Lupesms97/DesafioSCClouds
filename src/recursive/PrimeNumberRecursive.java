package recursive;


import validation.ValidationPrime;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberRecursive {

    static List<Integer> primeList = new ArrayList<>();
    public static void showPrimeList(){
        System.out.println(primeList);
    }


    public static List<Integer> primeNumber(int x){

        if(x < 2){
            return primeList;
        }

        primeNumber(x - 1);

        if (ValidationPrime.isPrime(x)){
            primeList.add(x);
        }


        return primeList;
    }
}
