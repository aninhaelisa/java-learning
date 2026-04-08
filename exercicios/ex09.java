package exercicios;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 09 - MULTIPLO OU NÃO");

        String opcao = "s";

            while(opcao.equalsIgnoreCase("s")){
                System.out.print("Informe um valor A: ");
                double valorA = sc.nextDouble();
                while(valorA != (int)valorA){
                    System.out.print("Valor A deve ser inteiro. Informe um valor A: ");
                    valorA = sc.nextDouble();
                }
                
                System.out.print("Informe um valor B: ");
                double valorB = sc.nextDouble();
                while(valorB != (int)valorB){
                    System.out.print("Valor B deve ser inteiro. Informe um valor B: ");
                    valorB = sc.nextDouble();
                }

                if (valorA % valorB == 0 || valorB % valorA == 0) {
                    System.out.println("Os valores são múltiplos.");
                } else {
                    System.out.println("Os valores não são múltiplos.");
                }

                System.out.print("Deseja continuar? (s/n): ");
                opcao = sc.next();

                while(!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")){
                    System.out.println("OPÇÃO INVÁLIDA! Digite 's' para sim ou 'n' para não.");
                    opcao = sc.next();
                }
            }

        sc.close();
    }
}
