package exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = "S";

        System.out.println("EXERCICO 07 - NÚMERO POSITIVO OU NEGATIVO");

        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();
            if (num != (int) num) {
                System.out.println("Número inválido. Por favor, digite um número inteiro.");
            } else {
                if (num >= 0) {
                    System.out.println("O número " + (int) num + " é positivo.");
                } else {
                    System.out.println("O número " + (int) num + " é negativo.");
                }
            }

            System.out.println("Deseja continuar? (S/N)");
            opcao = sc.next();
            if(!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                System.out.println("Opção inválida. Encerrando o programa.");
                break;
            }
        }
        
        System.out.println("Programa encerrado. Obrigado por usar!");

        sc.close();
    }
}
