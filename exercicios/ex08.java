package exercicios;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXERCICIO 08 - IMPAR OU PAR");

        String opcao = "s";
        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Informe um valor numerico: ");
            double valor = sc.nextDouble();
            while (valor != (int) valor) {
                System.out.println("VALOR INVÁLIDO! Informe um valor numerico inteiro: ");
                valor = sc.nextDouble();
            }
            if (valor % 2 == 0) {
                System.out.println("O valor " + (int) valor + " é par.");
            } else {
                System.out.println("O valor " + (int) valor + " é impar.");
            }
            System.out.print("Deseja continuar? (s/n): ");
            opcao = sc.next();
            while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                System.out.println("OPÇÃO INVÁLIDA! Digite 's' para sim ou 'n' para não.");
                opcao = sc.next();
            }
        }

        sc.close();
    }
}
