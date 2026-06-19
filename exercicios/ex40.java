package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("EXERCICIO 40 - Calculando compra");
        Scanner sc = new Scanner(System.in);

        int n = 1;
        int quantProd = 0;
        double total = 0.0;
        double totalUnidade = 0.0;
        String[] line = null;

        try {
            while (n > 0) {
                System.out.print("Digite a quantidade de produtos: ");
                quantProd = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < quantProd; i++) {
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    totalUnidade = preco * quantidade;
                    total += totalUnidade;

                    line = new String[] {
                            (i + 1) + "° Produto: " + nome,
                            "Preço: " + preco,
                            "Quantidade: " + quantidade,
                            "Total: " + totalUnidade
                    };

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Produtos.txt", true))) {
                        bw.write(line[0] + " - " + line[1] + " - " + line[2] + " - " + line[3]);
                        bw.newLine();
                    } catch (Exception e) {
                        System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
                    }
                }

                System.out.println("------------------TOTAL------------------");

                try (BufferedReader br = new BufferedReader(new FileReader("Produtos.txt"))) {
                    String linha;

                    System.out.print("Total da compra completa: ");
                    System.out.printf("%.2f%n", total);

                    System.out.println("Total por produto:");

                    while ((linha = br.readLine()) != null) {
                        String[] parts = linha.split(" - ");

                        if (parts.length >= 3) {
                            try {
                                double v1 = Double.parseDouble(parts[1].replace("Preço: ", ""));
                                double v2 = Double.parseDouble(parts[2].replace("Quantidade: ", ""));

                                double totalProduto = v1 * v2;

                                System.out.printf("%s - Total: %.2f%n",
                                        parts[0],
                                        totalProduto);

                            } catch (Exception e) {
                                System.out.println("Erro ao processar a linha: " + e.getMessage());
                            }
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }

                System.out.println();
                System.out.println("---------------".repeat(10));
                System.out.println("Deseja adicionar outro produto? (0 para sair)");
                n = sc.nextInt();
            }

            System.out.println();
            System.out.println("Compra finalizada. Obrigado por comprar conosco!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
