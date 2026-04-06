package exercicios;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXERCICIO 06 - Calculadora de Areas");

        char opcao = 's';

        while (opcao == 's' || opcao == 'S'){
            System.out.println("Escolha a forma geometrica: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Circulo");

            int escolha = sc.nextInt();

            switch(escolha) {
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = sc.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("Area do quadrado: " + areaQuadrado);
                    break;
                case 2:
                    System.out.println("Digite a base do retangulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Digite a altura do retangulo: ");
                    double altura = sc.nextDouble();
                    double areaRetangulo = base * altura;
                    System.out.println("Area do retangulo: " + areaRetangulo);
                    break;
                case 3:
                    System.out.println("Digite a base do triangulo: ");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Digite a altura do triangulo: ");
                    double alturaTriangulo = sc.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.println("Area do triangulo: " + areaTriangulo);
                    break;
                case 4:
                    System.out.println("Digite o raio do circulo: ");
                    double raio = sc.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(raio, 2);
                    System.out.println("Area do circulo: " + areaCirculo);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            System.out.println("Deseja calcular outra area? (s/n)");
            opcao = sc.next().charAt(0);
        }

        sc.close();
    }
}
