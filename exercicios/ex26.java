package exercicios;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 26 - SOMA DE 2 VETORES");
        System.out.println("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];

        System.out.println("Digite os elementos do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os elementos do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Soma dos vetores A e B: ");
        int[] vetorC = new int[n];
        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}
