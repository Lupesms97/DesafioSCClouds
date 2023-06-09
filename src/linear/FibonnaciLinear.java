package linear;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciLinear {
    public static List<Integer> fiboList = new ArrayList<>();

    public static void showFiboLinear(int x) {
        System.out.printf("Complex: O valor correspondente ao item na posição %d é o %d", x, fiboList.get(x-1));

    }

    public static List<Integer> fiboLinear(int x) {
        if (x <= 0) {
            return fiboList;
        }

        if (x == 1) {
            fiboList.add(0);
            return fiboList;
        }

        fiboList.add(0);
        fiboList.add(1);


        for (int i = 2; i < x; i++) {
            int fiboNum = fiboList.get(i - 1) + fiboList.get(i - 2);
            fiboList.add(fiboNum);
        }

        return fiboList;
    }
}
