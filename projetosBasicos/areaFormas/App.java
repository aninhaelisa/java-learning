package projetosBasicos.areaFormas;

import java.util.Scanner;

import projetosBasicos.areaFormas.entities.Circulo;
import projetosBasicos.areaFormas.entities.Quadrado;
import projetosBasicos.areaFormas.entities.Retangulo;
import projetosBasicos.areaFormas.entities.Triangulo;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // este projeto calcula a área de formas geométricas básicas: triângulo,
        // quadrado, retângulo e círculo. O usuário é solicitado a inserir as medidas
        // necessárias para cada forma, e o programa calcula e exibe a área
        // correspondente.
        // Mas foi produzido para compreender mais facilmente o conceito de classes e
        // objetos, onde cada forma geométrica é representada por uma classe com seus
        // atributos e métodos específicos para calcular a área.
        System.out.println("------".repeat(10) + "GEOMETRIA BASICA" + "------".repeat(10));

        Triangulo triangulo = new Triangulo();
        System.out.println("Entre com os dados do triângulo:");
        System.out.print("Lado A: ");
        triangulo.a = sc.nextDouble();
        System.out.print("Lado B: ");
        triangulo.b = sc.nextDouble();
        System.out.print("Lado C: ");
        triangulo.c = sc.nextDouble();
        System.out.println("Área do triângulo: " + String.format("%.2f", triangulo.area())); // String.format("%.2f",
                                                                                             // triangulo.area())
                                                                                             // formata a área para
                                                                                             // exibir com 2 casas
                                                                                             // decimais

        Quadrado quadrado = new Quadrado();
        System.out.println("Entre com os dados do quadrado:");
        System.out.print("Lado: ");
        quadrado.lado = sc.nextDouble();
        System.out.println("Área do quadrado: " + String.format("%.2f", quadrado.area()));

        Retangulo retangulo = new Retangulo();
        System.out.println("Entre com os dados do retângulo:");
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.println("Área do retângulo: " + String.format("%.2f", retangulo.area()));

        Circulo circulo = new Circulo();
        System.out.println("Entre com os dados do círculo:");
        System.out.print("Raio: ");
        circulo.raio = sc.nextDouble();
        System.out.println("Área do círculo: " + String.format("%.2f", circulo.area()));

        System.out.println("------".repeat(10) + "FIM" + "------".repeat(10));

        sc.close();
    }
}
