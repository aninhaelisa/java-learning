package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 42 - Gerador de logs");

        int n = -1;
        String[] line = null;

        while (n != 0) {

            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataFormatada = agora.format(fmtData);
            DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaFormatada = agora.format(fmtHora);

            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Criar Arquivo");
            System.out.println("2 - Ler Arquivo");
            System.out.println("3 - Editar o Arquivo");
            System.out.println("4 - Renomear Arquivo");
            System.out.println("5 - Deletar Arquivo");
            System.out.println("6 - Listar Arquivos");
            System.out.println("0 - Sair");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Digite o nome do arquivo: ");
                    String nomeArquivo = sc.nextLine();
                    System.out.print("Digite o conteúdo do arquivo: ");
                    String conteudoArquivo = sc.nextLine();

                    line = new String[] {
                            "Nome do arquivo: " + nomeArquivo,
                            "Conteúdo: " + conteudoArquivo
                    };

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo + ".txt", true))) {
                        for (String l : line) {
                            bw.write(l);
                            bw.newLine();
                        }

                    } catch (Exception e) {
                        System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                    }
                    System.out.println("Arquivo criado com sucesso!");
                    System.out.println("Nome do arquivo: " + nomeArquivo);
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))) {
                        bw.write("Arquivo criado: " + nomeArquivo + " - " + dataFormatada + " " + horaFormatada);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Erro ao criar o log: " + e.getMessage());
                    }

                    break;

                case 2:
                    System.out.print("Qual arquivo deseja ler? ");
                    String arquivoLer = sc.nextLine();
                    try (BufferedReader br = new BufferedReader(new FileReader(arquivoLer + ".txt"))) {
                        String ler;
                        while ((ler = br.readLine()) != null) {
                            System.out.println(ler);
                        }

                    } catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                        System.out.println("Tem certeza que o arquivo existe? Verifique o nome e tente novamente.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do arquivo que deseja editar: ");
                    String arquivoEditar = sc.nextLine();
                    System.out.print("Digite o novo conteúdo do arquivo: ");
                    String novoConteudo = sc.nextLine();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoEditar + ".txt", true))) {
                        bw.write(novoConteudo);
                        bw.newLine();
                    } catch (Exception e) {
                        System.out.println("Erro ao editar o arquivo: " + e.getMessage());
                        System.out.println("Tem certeza que o arquivo existe? Verifique o nome e tente novamente.");
                    }

                    break;

                case 4:
                    System.out.print("Digite o nome do arquivo que deseja renomear: ");
                    String arquivoRenomear = sc.nextLine();
                    File nomeAntigo = new File(arquivoRenomear + ".txt");
                    System.out.println("Digite o novo nome do arquivo: ");
                    String novoNome = sc.nextLine();
                    File nomeNovo = new File(novoNome + ".txt");

                    if (nomeAntigo.renameTo(nomeNovo)) {
                        System.out.println("Arquivo renomeado com sucesso!");
                    } else {
                        System.out.println(
                                "Erro ao renomear o arquivo. Verifique se o nome antigo está correto e tente novamente.");
                    }

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))) {
                        bw.write("Arquivo renomeado: " + arquivoRenomear + " para " + novoNome + " - " + dataFormatada
                                + " " + horaFormatada);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Erro ao criar o log: " + e.getMessage());
                    }

                    break;

                case 5:
                    System.out.print("Qual arquivo deseja deletar?");
                    String arquivoDeletar = sc.nextLine();
                    File deletar = new File(arquivoDeletar + ".txt");
                    if (deletar.delete()) {
                        System.out.println("Arquivo deletado com sucesso!");

                    } else {
                        System.out.println(
                                "Erro ao deletar o arquivo. Verifique se o nome está correto e tente novamente.");
                    }

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))) {
                        bw.write("Arquivo deletado: " + arquivoDeletar + " - " + dataFormatada + " " + horaFormatada);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Erro ao criar o log: " + e.getMessage());
                    }

                    break;

                case 6:
                    System.out.println("Listando arquivos:");

                    try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
                        String ler;
                        while ((ler = br.readLine()) != null) {
                            System.out.println(ler);
                        }

                    } catch (Exception e) {
                        System.out.println("Erro ao ler o log: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Tente novamente! Opção inválida.");
                    break;
            }

            System.out.println();
            System.out.println("_".repeat(50));
        }
        System.out.println();
        System.out.println("PROGRAMA ENCERRADO! :D");

        sc.close();
    }
}
