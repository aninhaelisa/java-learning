package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 23 - SOMA E MEDIA");
        System.out.print("Quantos numeros dejesa somar e tirar média? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }
        double media = soma / n;
        System.out.printf("A soma dos numeros é: %.2f %n", soma);
        System.out.printf("A média dos numeros é: %.2f", media);

        sc.close();
    }
}
