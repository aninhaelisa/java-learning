package exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("EXERCICIO O3 - DIFERENÇA");

        System.out.print("\nDigite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        int d = sc.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("A diferença é: " + diferenca);

        sc.close();
    }
}
