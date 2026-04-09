package exercicios;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 18 - TABUADA");

        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();
        System.out.println("Tabuada do " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        sc.close();
    }
}
