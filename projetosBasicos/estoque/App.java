package projetosBasicos.estoque;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import projetosBasicos.estoque.entities.Produto;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------".repeat(10) + "CADASTRO DE PRODUTOS" + "------".repeat(10));
        System.out.println("1 - cadastrar/adcionar/remover");
        System.out.println("2 - ver estoque");
        int op = sc.nextInt();

        int op1 = 1; // Variável para controlar o loop de cadastro/adicionar/remover produtos
        int op2 = 1; // Variável para controlar o loop de ver estoque

        // código não esta organizado...

        if (op == 1) {
            System.out.println("VOCÊ ESCOLHEU CADASTRAR/ADICIONAR/REMOVER PRODUTOS");
            while (op1 == 1) {
                Produto produto = new Produto();
                sc.nextLine(); // Limpar o buffer
                System.out.println("Digite os dados do produto:");
                System.out.print("Nome: ");
                produto.nome = sc.nextLine();
                System.out.print("Preço: ");
                produto.preco = sc.nextDouble();
                System.out.print("Quantidade no estoque: ");
                produto.quantidade = sc.nextInt();

                System.out.println("Deseja adicionar ou remover este produto do estoque? (A/R)");
                String opcao = sc.next();
                if (opcao.equalsIgnoreCase("a")) {
                    System.out.print("Digite a quantidade a ser adicionada: ");
                    int quantAdd = sc.nextInt();
                    produto.addProduto(quantAdd);
                    System.out.println("Quantidade atualizada: " + produto.quantidade);
                } else if (opcao.equalsIgnoreCase("r")) {
                    System.out.println("Digite a quantidade a ser removida: ");
                    int quantR = sc.nextInt();
                    produto.removeProduto(quantR);
                    System.out.println("Quantidade atualizada: " + produto.quantidade);
                } else {
                    System.out.println(":D");
                }

                try {
                    FileWriter writer = new FileWriter("estoque.txt", true); // O segundo parâmetro "true" indica que o
                                                                             // conteúdo será adicionado ao final do
                                                                             // arquivo, em vez de sobrescrevê-lo.
                    writer.write("NOME: " + produto.nome + " - R$" + produto.preco + " - QUANTIDADE: " + produto.quantidade + "\n");
                    writer.close(); // IMPORTANTE para garantir que os dados sejam gravados no arquivo
                } catch (IOException e) { // IOException é uma classe de exceção que lida com erros relacionados a
                                          // operações de entrada/saída, como leitura e escrita de arquivos.
                    System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
                }

                System.out.println("Deseja cadastrar outro produto? (sim - 1 / não - 2)");
                op1 = sc.nextInt();
            }

        } else if (op == 2) {
            System.out.println("VOCÊ ESCOLHEU VER O ESTOQUE");

            while (op2 == 1) {
                Produto produto = new Produto();
                System.out.println("BUSCAR EM ESTOQUE: ");

                try {
                    File produtoFile = new File("estoque.txt"); // A classe File é usada para representar um arquivo ou
                                                                // diretório no sistema de arquivos. Ela fornece métodos
                                                                // para criar, excluir, renomear e verificar a
                                                                // existência de arquivos e diretórios.
                    Scanner fileScanner = new Scanner(produtoFile); // A classe Scanner é usada para ler dados de uma
                                                                    // fonte, como um arquivo. Ela fornece métodos para
                                                                    // ler diferentes tipos de dados, como strings,
                                                                    // números e linhas inteiras. Neste caso, estamos
                                                                    // usando o Scanner para ler o conteúdo do arquivo
                                                                    // "estoque.txt".

                    boolean busca = false;

                    System.out.print("Digite o nome do produto que deseja buscar: ");
                    sc.nextLine();
                    String buscaNome = sc.nextLine();

                    while (fileScanner.hasNextLine()) {
                        String linha = fileScanner.nextLine();
                    
                        String[] partes = linha.split(" - ");
                        String nome = partes[0].replace("NOME: ", "").trim();
                    
                        if (nome.toLowerCase().contains(buscaNome.toLowerCase().trim())) {
                            System.out.println("Encontrado: " + linha);
                            busca = true;
                        }
                    }
                    if (!busca) {
                        System.out.println("Produto não encontrado no estoque.");
                    }
                    fileScanner.close();
                } catch (IOException e) {
                    System.out.println("Ocorreu um erro ao ler o arquivo.");
                }

                System.out.println("Deseja buscar outro produto? (sim - 1 / não - 2)");
                op2 = sc.nextInt();
            }

        }

        System.out.println("------".repeat(10) + "PROGRAMA ENCERRADO" + "------".repeat(10));

        sc.close();
    }
}
