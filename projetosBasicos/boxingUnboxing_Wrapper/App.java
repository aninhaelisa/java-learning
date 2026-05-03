package projetosBasicos.boxingUnboxing_Wrapper;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        do {
            System.out.println("\n=== Boxing - Unboxing - Wrapper ===");
            System.out.printf("Qual deseja aprender? %n1 - Boxing %n2 - Unboxing %n3 - Wrapper %n0 - Sair%n");
            System.out.print("> ");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.next(); // limpa entrada inválida
                continue;
            }

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nBOXING");
                    System.out.println("Boxing é converter um tipo primitivo em um objeto wrapper.");

                    int x = 10;
                    System.out.println("Valor primitivo: " + x);

                    // Autoboxing (forma mais comum)
                    Integer autoBox = x;
                    System.out.println("Autoboxing: " + autoBox);

                    // Boxing explícito
                    Integer boxedX = Integer.valueOf(x);
                    System.out.println("Boxing explícito: " + boxedX);
                    break;

                case 2:
                    System.out.println("\nUNBOXING");
                    System.out.println("Unboxing é converter um objeto wrapper em tipo primitivo.");

                    Integer y = 20;
                    System.out.println("Valor wrapper: " + y);

                    // Auto-unboxing
                    int autoUnbox = y;
                    System.out.println("Auto-unboxing: " + autoUnbox);

                    // Unboxing explícito
                    int unboxedY = y.intValue();
                    System.out.println("Unboxing explícito: " + unboxedY);
                    break;

                case 3:
                    System.out.println("\nWRAPPERS");
                    System.out.println("Wrappers são classes que representam tipos primitivos como objetos.");
                    System.out.println("Exemplos: Integer, Double, Boolean, Character");

                    // Exemplo prático
                    Integer a = 100;
                    Integer b = 200;

                    System.out.println("Exemplo de soma com wrappers:");
                    Integer soma = a + b; // unboxing + operação + boxing
                    System.out.println("Resultado: " + soma);

                    System.out.println("\nCuidados importantes:");

                    // NullPointerException
                    Integer nulo = null;
                    System.out.println("- Wrappers podem ser null (primitivos não).");
                    System.out.println("  Evite fazer unboxing de valores nulos.");

                    // Comparação
                    Integer i1 = 200, i2 = 200;
                    System.out.println("- Use equals() para comparar valores:");
                    System.out.println("  i1.equals(i2) = " + i1.equals(i2));

                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        System.out.println("Obrigado por aprender :)");

        sc.close();
    }
}