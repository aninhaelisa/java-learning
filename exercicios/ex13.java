package exercicios;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 13 - PLANO CARTESIANO");

        System.out.print("Digite o valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } 
        else if (y == 0) {
            System.out.println("Eixo X");
        } 
        else if (x == 0) {
            System.out.println("Eixo Y");
        } 
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
}
