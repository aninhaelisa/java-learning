package projetosBasicos.calculosLambda;

import java.util.Arrays;

public class App {

    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[] { 3, 4, 5 };
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));

    }

    public static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}

// Uma função é transparente se, para os mesmos argumentos, ela sempre produz o
// mesmo resultado e não depende de estado externo.