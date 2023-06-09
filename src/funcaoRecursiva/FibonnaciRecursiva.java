package funcaoRecursiva;


import java.util.ArrayList;
import java.util.List;

public class FibonnaciRecursiva {

    public static List<Integer> fiboList = new ArrayList<>();

    public static void showFiboList(int x) {
        System.out.println(fiboList);
        System.out.printf("Complex: O valor correspondente ao item na posição %d é o %d", x, fiboList.get(x-1));
        System.out.println();
        System.out.printf("Simple: O valor correspondente ao item na posição %d é o %d", x, fiboFunctionSimple(x-1));
    }

    public static List<Integer> fiboFunctionComplex(int x) {
        if (x <= 0) {
            return fiboList;
        }

        if (x == 1) {
            fiboList.add(0);
            return fiboList;
        }

        if (x == 2) {
            fiboList.add(0);
            fiboList.add(1);
            return fiboList;
        }

        fiboFunctionComplex(x - 1);
        int fiboNum = fiboList.get(x - 2) + fiboList.get(x - 3);
        fiboList.add(fiboNum);

        return fiboList;
    }

    public static int fiboFunctionSimple(int x){
        if(x <= 1 )return x;

        return  fiboFunctionSimple(x-1) + fiboFunctionSimple(x-2);

    }



}
