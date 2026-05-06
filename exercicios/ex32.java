package exercicios;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 32 - LAÇO FOR EACH");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n=== LAÇO FOR EACH ===");
            System.out.printf("O que deseja aprender? %n1 - Laço For Each %n0 - Sair%n");
            System.out.print("> ");
            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.next(); 
                continue;
            }

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("FOR EACH");
                    System.out.println("Um laço for each é usado para iterar sobre elementos de uma coleção ou array de forma simplificada.");
                 
                    System.out.println("---------".repeat(10));
                    System.out.println("Exemplo: ");
                    String[] frutas = {"Maçã", "Banana", "Laranja"};
                    System.out.println("> String[] frutas = {\"Maçã\", \"Banana\", \"Laranja\"};");
                    System.out.println("Frutas disponíveis:");
                    for (String fruta : frutas) {
                        System.out.println("- " + fruta);
                    }
                    System.out.println("Explicação: O laço for each percorre cada elemento do array 'frutas' e o armazena na variável 'fruta' a cada iteração, permitindo acessar diretamente o valor sem precisar de um índice.");
                    System.out.println("");

                    System.out.println("---------".repeat(10));
                    System.out.println("Exemplo com coleção:");
                    java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5);
                    System.out.println("> java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5);");
                    System.out.println("Números disponíveis:");
                    for (Integer numero : numeros) {
                        System.out.println("- " + numero);
                    }

                    System.out.println("for (Integer numero : numeros) {");
                    System.out.println("System.out.println(numero);");
                    System.out.println("}");
                    System.out.println("---------".repeat(10));
                    System.out.println("");

                    System.out.println("Explicação: O laço for each também pode ser usado com coleções, como List, Set, etc. Ele percorre cada elemento da coleção 'numeros' e o armazena na variável 'numero' a cada iteração.");

                    System.out.println("Vantagens do for each:");
                    System.out.println("- Código mais limpo e legível.");
                    System.out.println("- Menos propenso a erros, como esquecer de incrementar o índice ou acessar um índice fora do limite.");

                    System.out.println("");
                    System.out.println("---------".repeat(10));
                    System.out.println("Explicação simplificada:");
                    System.out.println("for(TIPO VARIAVEL : COLEÇÃO) {");
                    System.out.println("comando1;");
                    System.out.println("comando2;");
                    System.out.println("}");

                    System.out.println("");
                    System.out.println("---------".repeat(10));
                    System.out.println("limitações do for each:");
                    System.out.println("- Não é possível modificar a coleção durante a iteração.");
                    System.out.println("- Não é possível acessar o índice dos elementos diretamente.");
                    break;
            
                default:
                    break;
            }

        } while (opcao != 0);
    
        System.out.println("você aprendeu sobre LAÇO FOR EACH, parabéns!");

        sc.close();

    }
}
