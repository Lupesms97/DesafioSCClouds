
;
import linear.PrimeNumberLinear;
import recursive.PrimeNumberRecursive;
import validation.ValidationNumber;
import linear.FibonnaciLinear;
import recursive.FibonnaciRecursive;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("""
                Qual operação você deseja realizar:
                1 - Fibonacci Recursiva
                2 - Fibonacci Linear
                3 - Números primos Recursiva
                4 - Números primos Linear
                """);

        int resposta = input.nextInt();
        input.nextLine();

        switch (resposta){
            case 1:
                System.out.println("Qual numero você desja saber?  ");
                String entradaFiboRecursive = input.nextLine();

                if(ValidationNumber.isNumber(entradaFiboRecursive)){

                    int x = parseInt(entradaFiboRecursive);

                    FibonnaciRecursive.fiboRecursiveComplex(x);
                    FibonnaciRecursive.fiboRecursiveSimple(x);
                    FibonnaciRecursive.showFiboRecursive(x);

                }else System.out.println("O valor digitado não foi um número");
                break;

            case 2:
                System.out.println("Qual numero você desja saber?  ");
                String entradaFiboLinear = input.nextLine();

                if(ValidationNumber.isNumber(entradaFiboLinear)){

                    int x = parseInt(entradaFiboLinear);

                    FibonnaciLinear.fiboLinear(x);
                    FibonnaciLinear.showFiboLinear(x);

                }else System.out.println("O valor digitado não foi um número");
                break;

            case 3 :
                System.out.println("Qual numero você desja saber?  ");
                String entradaPrimeRecursive = input.nextLine();

                if(ValidationNumber.isNumber(entradaPrimeRecursive)){

                    int x = parseInt(entradaPrimeRecursive);

                    PrimeNumberRecursive.primeNumber(x);
                    PrimeNumberRecursive.showPrimeList();



                }else System.out.println("O valor digitado não foi um número");
                break;

            case 4:
                System.out.println("Qual numero você desja saber?  ");
                String entradaPrimeLinear = input.nextLine();

                if(ValidationNumber.isNumber(entradaPrimeLinear)){

                    int x = parseInt(entradaPrimeLinear);

                    PrimeNumberLinear.primeLinear(x);
                    PrimeNumberLinear.showLinearPrimeList();



                }else System.out.println("O valor digitado não foi um número");
                break;


        }




    }
}