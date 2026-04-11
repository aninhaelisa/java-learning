package exercicios;

import java.util.Scanner;

public class ex20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXERCICIO 20 - OPERADORES BITWISE");

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("\n=== RESULTADOS ===");

        System.out.println("AND (&): " + (a & b));
        System.out.println("OR (|): " + (a | b));
        System.out.println("XOR (^): " + (a ^ b));

        System.out.println("NOT (~a): " + (~a));
        System.out.println("NOT (~b): " + (~b));

        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));

        System.out.println("b << 1: " + (b << 1));
        System.out.println("b >> 1: " + (b >> 1));

        sc.close();

    }
}
