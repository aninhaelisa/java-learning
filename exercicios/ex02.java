package exercicios;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 02 - AREA DO CÍRCULO");

        String opcao = "S";
        while(opcao.equalsIgnoreCase("s")){
            System.out.println("Qual o raio do círculo?");
            double raio = sc.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.printf("A área do círculo é: %.2f\n", area);
            System.out.println("Deseja calcular a área de outro círculo? (S/N)");
            opcao = sc.next();
            if(!opcao.equalsIgnoreCase("S")&&!opcao.equalsIgnoreCase("N")){
                System.out.println("Opção inválida. Encerrando o programa.");
                break;
            }
        }

        System.out.println("Encerrando o programa. Obrigado por usar!");

        sc.close();
        }
}
