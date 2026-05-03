package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 27 - VALOR ABAIXO DA MEDIA");
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        int quantN = 0;
        double media = 0;
        double soma = 0;
    
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            quantN ++;
            soma += vetor[i];
        }

        media = soma / quantN;

        System.out.printf("MEDIA: %.2f %n", media);
        System.out.println("VALORES ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.2f\n", vetor[i]);
            }
        }
        sc.close();
    }
}
