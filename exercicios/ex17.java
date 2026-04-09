package exercicios;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 17 - IN OUT [10,20]");

        System.out.println("Digite a quantidade de numeros: ");
        int n1 = sc.nextInt();
        int[] n2 = new int[n1];
        
        for (int i = 0; i < n1; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            n2[i] = sc.nextInt();
        }

        int in = 0;
        int out = 0;

        for (int i = 0; i < n1; i++) {
            if (n2[i] >= 10 && n2[i] <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println("IN: " + in);
        System.out.println("OUT: " + out);

        sc.close();
    }
}
