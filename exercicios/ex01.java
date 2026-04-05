package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("EXERCICIO 01 - SOMA");
        char opcao = "S".charAt(0);
        double soma = 0;

        while (opcao == 'S' || opcao == 's') {
            System.out.print("Quantos numeros deseja somar: ");
            int quantidade = sc.nextInt();
            for (int i = 0; i < quantidade; i++) {
                System.out.print((i + 1) + "º numero: ");
                double numero = sc.nextDouble();
                if (numero == (int) numero) {
                    if ((int) soma % 2 == 0) {
                        System.out.println((int) numero + " é par");
                    } else {
                        System.out.println((int) numero + " é impar");
                    }
                } else {
                    System.out.println(" ... ");
                }

                soma += numero;
            }

            System.out.println("------------".repeat(50));
            System.err.println("A soma dos numeros é: " + soma);
            if (soma == (int) soma) {
                System.out.println("A soma " + (int) soma + " é inteira");
            } else {
                System.out.println("A soma " + soma + " é decimal");
            }

            if (soma == (int) soma) {
                if ((int) soma % 2 == 0) {
                    System.out.println((int) soma + " é par");
                } else {
                    System.out.println((int) soma + " é impar");
                }
            } else {
                System.out.println(" ... ");
            }
            System.out.println("------------".repeat(50));

            System.out.print("Deseja continuar? (S/N): ");
            opcao = sc.next().charAt(0);
            System.out.println("------------".repeat(50));

        }

        System.out.println("PROGRAMA ENCERRADO.");

    }
}
