package exercicios;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 28 - MEDIA PARES");
        System.out.print("Quantos elementos possui o vetor?");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        int soma = 0;
        int quantN =0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                quantN++;
            }
        }

        double media = (double) soma / quantN;

        if (soma == 0) {
            System.out.println("Não há números pares no vetor.");
        } else {
            System.out.printf("A média dos números pares é: %.2f", media);
        }

        sc.close();
    }
}
