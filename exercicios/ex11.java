package exercicios;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 11 - CARDAPIO");

        String opcao = "s";
        int lanche, bebida;
        double valorLanche = 0;
        double valorBebida = 0;
        double totalPedido = 0;
        double totalGeral = 0;

        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Quantos pedidos deseja fazer? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("----".repeat(20));
                System.out.print("PEDIDO N" + (i + 1) + "° : ");
                System.out.println("----".repeat(20));
                System.out.println("CARDAPIO - LANCHES:");
                System.out.println("1 - Cachorro Quente");
                System.out.println("2 - X-Salada");
                System.out.println("3 - X-Bacon");
                System.out.println("4 - Torrada Simples");
                System.out.println("5 - Batata Frita");
                System.out.println("6 - Não desejo lache");

                lanche = sc.nextInt();
                while (lanche < 1 || lanche > 6) {
                    System.out.println("Opção inválida. Por favor, escolha um lanche entre 1 e 6.");
                    lanche = sc.nextInt();
                }

                switch (lanche) {
                    case 1:
                        valorLanche = 10.00;

                        break;
                    case 2:
                        valorLanche = 15.00;

                        break;
                    case 3:
                        valorLanche = 18.00;

                        break;
                    case 4:
                        valorLanche = 8.00;

                        break;
                    case 5:
                        valorLanche = 12.00;

                        break;
                    case 6:
                        valorLanche = 0.00;
                        break;

                    default:
                        break;
                }

                System.out.println("----".repeat(20));
                System.out.println("CARDAPIO - BEBIDAS:");
                System.out.println("1 - Refrigerante");
                System.out.println("2 - Suco Natural");
                System.out.println("3 - MilkShake");
                System.out.println("4 - Água Mineral");
                System.out.println("5 - Café");
                System.out.println("6 - Não desejo bebida");
                bebida = sc.nextInt();
                while (bebida < 1 || bebida > 6) {
                    System.out.println("Opção inválida. Por favor, escolha uma bebida entre 1 e 6.");
                    bebida = sc.nextInt();
                }

                switch (bebida) {
                    case 1:
                        valorBebida = 5.00;

                        break;
                    case 2:
                        valorBebida = 7.00;

                        break;
                    case 3:
                        valorBebida = 10.00;

                        break;
                    case 4:
                        valorBebida = 3.00;

                        break;
                    case 5:
                        valorBebida = 4.00;

                        break;
                    case 6:
                        valorBebida = 0.00;
                        break;

                    default:
                        break;
                }

                totalPedido = valorLanche + valorBebida;
                totalGeral += totalPedido;

                System.out.println("PEDIDO N" + (i + 1) + "° : ");
                System.out.println("LANCHE: R$ " + valorLanche);
                System.out.println("BEBIDA: R$ " + valorBebida);
                System.out.println("TOTAL PEDIDO: R$ " + totalPedido);

            }

            System.out.print("Deseja fazer mais pedidos? (s/n): ");
            opcao = sc.next();
            while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                System.out.println("Opção inválida. Por favor, digite 's' para sim ou 'n' para não.");
                opcao = sc.next();
            }

            System.out.println("total geral: R$ " + totalGeral);
        }
        sc.close();
    }
}
