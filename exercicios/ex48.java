package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) throws IOException {
        System.out.println("EXERCICIO 48 - BIBLIOTECA");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op = -1;
        String path_csv = "txt\\ex48_Biblioteca.csv";
        String split = ";";
        String path_txt = "txt\\ex48_Biblioteca.txt";
        String path_txt_emprestimo = "txt\\ex48_emprestimos.txt";

        while (op != 0) {
            System.out.println();
            System.out.println("SISTEMA DA BIBLIOTECA");
            System.out.println("1 - Cadastrar Livro   |   2 - Buscar Livro");
            System.out.println("3 - Listar Livros     |   4 - Listar emprestimos");
            System.out.println("5 - Remover Livro     |   6 - Emprestar livro");
            System.out.println("7 - Remover emprestimo|   0 - SAIR");
            System.out.print("> ");
            op = sc.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("CADASTRO LIVRO");
                    System.out.print("Nome livro: ");
                    String nomeLivro = sc.nextLine();
                    System.out.print("Nome Autor: ");
                    String nomeAutor = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int quantLivro = sc.nextInt();

                    // .csv
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path_csv, true))) {
                        if (new File(path_csv).length() > 0) {
                            bw.newLine();
                        }
                        bw.write(nomeLivro + split + nomeAutor + split + quantLivro);
                    } catch (Exception e) {
                        System.out
                                .println("Erro ao escrever o arquivo .csv: " + e.getMessage() + "||| TENTE NOVAMENTE");
                    }
                    // .txt
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path_txt, true))) {
                        if (new File(path_txt).length() > 0) {
                            bw.newLine();
                        }
                        bw.write("LIVRO: " + nomeLivro + " AUTOR/A: " + nomeAutor + " QUANTIDADE: " + quantLivro);
                    } catch (Exception e) {
                        System.out.println("Erro ao escrever o arquivo .txt: " + e.getMessage() + "||| TENTE NOVAMENTE");
                    }

                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("BUSCAR LIVRO");
                    System.out.print("NOME LIVRO: ");
                    String nomeBuscar = sc.nextLine();

                    List<String> livro = null;
                    List<String> lineBuscar = Files.readAllLines(Paths.get(path_txt));
                    boolean livroEncontrado = false;

                    for (int i = 0; i < lineBuscar.size(); i++) {
                        String linha = lineBuscar.get(i);
                        if (linha.startsWith("LIVRO: " + nomeBuscar)) {
                            livroEncontrado = true;
                            livro = Arrays.asList(linha.split(split));
                            break;
                        }
                    }

                    if (livroEncontrado) {
                        System.out.print("LIVRO ENCONTRADO: ");
                        System.out.println(livro);

                    } else {
                        System.out.println("Livro não encontrado! Confira se o nome esta escrito corretamente");
                    }

                    break;
                case 3:
                    System.out.println("LISTA DE LIVROS");
                    List<String> lineLivros = Files.readAllLines(Paths.get(path_txt));
                    try (BufferedReader br = new BufferedReader(new FileReader(path_txt))) {
                        for (String linha : lineLivros) {
                            if (new File(path_txt).length() > 0) {
                                System.out.println(linha);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo txt" + e.getMessage());
                    }

                    break;

                case 4:
                    System.out.println("LISTA DE EMPRESTIMOS");
                    List<String> lineEmprestimos = Files.readAllLines(Paths.get(path_txt_emprestimo));
                    try (BufferedReader br = new BufferedReader(new FileReader(path_txt_emprestimo))) {
                        for (String linha : lineEmprestimos) {
                            if (new File(path_txt).length() > 0) {
                                System.out.println(linha);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo txt" + e.getMessage());
                    }

                    break;

                case 5:
                    System.out.println("REMOVER LIVRO");
                    sc.nextLine();
                    System.out.print("Nome do aluno que deseja remover: ");
                    String nomeRemover = sc.nextLine();

                    List<String> lineRemover = Files.readAllLines(Paths.get(path_txt));
                    livroEncontrado = false;

                    int remover = 0;

                    for (int i = 0; i < lineRemover.size(); i++) {
                        String linha = lineRemover.get(i);
                        if (linha.startsWith("LIVRO: "+nomeRemover) || linha.equals(nomeRemover)) {
                            remover++;
                            livroEncontrado = true;
                            break;
                        }
                    }

                    if (livroEncontrado) {
                        Files.write(Paths.get(path_txt), lineRemover);

                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado!");
                    }

                    System.out.println();
                    break;
                case 6:
                    System.out.println("EMPRESTAR LIVRO");

                    break;
                case 7:
                    System.out.println("REMOVER EMPRESTIMO");

                    break;
                case 0:
                    System.out.println("SISTEMA ENCERRADO");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    System.out.println();
                    break;
            }
        }

        sc.close();
    }
}