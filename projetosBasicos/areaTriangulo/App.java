package projetosBasicos.areaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Calculadora de área de triângulo");
        Scanner sc = new Scanner(System.in);
        System.out.print("As três medidas do triangulo 1: ");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double area1 = area(a1, a2, a3);

        System.out.print("As três medidas do triangulo 2: ");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double b3 = sc.nextDouble();
        double area2 = area(b1, b2, b3);

        System.out.printf("a area do triangulo 1 é: %.2f \n", area1);
        System.out.printf("a area do triangulo 2 é: %.2f \n", area2);

        maior(area1, area2);
        sc.close();
    }

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void maior(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("O maior triângulo é o Triângulo 1");
        } else if (area2 > area1) {
            System.out.println("O maior triângulo é o Triângulo 2");
        } else {
            System.out.println("Os triângulos têm a mesma área");
        }
    }

}
