package exercicios;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 19 - QUADRADO E CUBO DE UM NUMERO");
        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();
        for (int i = 0; i < valor; i++) {
            System.out.println("Número " +(i+1)+": ");
            int quadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.println("O quadrado de " + i + " é: " + quadrado);
            System.out.println("O cubo de " + i + " é: " + cubo);
            System.out.println("---".repeat(20));
        }

        sc.close();

    }
}