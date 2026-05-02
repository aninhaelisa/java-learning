package exercicios;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 22 - NUMEROS NEGATIVOS");
        System.out.println("Informe a quantidade de numeros: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}
