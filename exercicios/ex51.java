package exercicios;

import java.util.Scanner;
import java.util.Random;

public class ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("EXERCICIO 51 - ADVINHA O NUMERO");

        int random = r.nextInt(10);

        int n = 0;

        System.out.print("Digite um numero de 0 a 10: ");
        n = sc.nextInt();

        while (n != random) {

            if (n > random) {
                System.out.print("O numero que voce digitou e maior que o numero sorteado, tente novamente: ");
                n = sc.nextInt();
            } else if (n < 0 || n > 100) {
                System.out.print("Numero invalido, digite um numero de 0 a 10: ");
                n = sc.nextInt();
            } else if (n < random) {
                System.out.print("O numero que voce digitou e menor que o numero sorteado, tente novamente: ");
                n = sc.nextInt();
            }

        }

        System.out.print("Parabens, voce acertou!");

        sc.close();
    }
}
