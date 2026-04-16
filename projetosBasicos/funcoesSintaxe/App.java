package projetosBasicos.funcoesSintaxe;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Funcoes e Sintaxe em Java");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("------SOMA DE DOIS NÚMEROS------");
        somar(num1, num2);
        System.out.println("------MAIOR ENTRE DOIS NÚMEROS------");
        max(num1, num2);
        System.out.println("------MENOR ENTRE DOIS NÚMEROS------");
        min(num1, num2);

        sc.close();

    }

    public static void somar(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }

    public static void max(int a, int b) {
        int resultado = Math.max(a, b);
        System.out.println("O maior número entre " + a + " e " + b + " é: " + resultado);
    }

    public static void min(int a, int b) {
        int resultado = Math.min(a, b);
        System.out.println("O menor número entre " + a + " e " + b + " é: " + resultado);
    }
}
