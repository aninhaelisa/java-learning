package exercicios;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 24 - NUMEROS PARES COM VETOR");
        System.out.print("Informe quantos numeros deseja comparar: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o numero " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Numeros pares: ");
        int soma = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " - ");
                soma +=1;
            }
        }

        System.out.println("Quantidade de numeros pares: " + soma);
        sc.close();
    }
}
