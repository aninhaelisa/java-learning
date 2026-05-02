package exercicios;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("EXERCICIO 25 - POSICAO DO MAIOR VALOR");
        System.out.print("Informe a quantidade de elementos do vetor:");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        int posicaoValor = 0;
        for (int i = 1; i < n; i++) {
            if (vetor[i] > posicaoValor) {
                posicaoValor = i;
            }
        }

        System.out.println("O maior valor do vetor é da posicao: " + posicaoValor);
        System.out.println("O maior valor do vetor é: " + vetor[posicaoValor]);
        sc.close();
    }
}
