package projetosBasicos.matematicaJava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LABORATORIO DO MATH EM JAVA ===");

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("\n--- RESULTADOS ---");

        // Potência
        System.out.println("Potência (a^b): " + Math.pow(a, b));

        // Raiz quadrada
        System.out.println("Raiz quadrada de a: " + Math.sqrt(a));

        // Valor absoluto
        System.out.println("Valor absoluto de a: " + Math.abs(a));

        // Maior e menor
        System.out.println("Maior entre a e b: " + Math.max(a, b));
        System.out.println("Menor entre a e b: " + Math.min(a, b));

        // Arredondamentos
        System.out.println("Arredondado (round) de a: " + Math.round(a));
        System.out.println("Arredondado para baixo (floor) de a: " + Math.floor(a));
        System.out.println("Arredondado para cima (ceil) de a: " + Math.ceil(a));

        // PI
        System.out.println("Valor de PI: " + Math.PI);

        // Trigonometria (usa radianos)
        System.out.println("Seno de a: " + Math.sin(a));
        System.out.println("Cosseno de a: " + Math.cos(a));
        System.out.println("Tangente de a: " + Math.tan(a));

        // Número aleatório
        System.out.println("Número aleatório entre 0 e 1: " + Math.random());

        sc.close();

    }
}
