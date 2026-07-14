package exercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        System.out.println("EXERCICIO 45 - ARQUIVO CSV (CADASTRO DE ALUNOS)");
        Scanner sc = new Scanner(System.in);
        int op = -1;
        System.out.print("usuario: ");
        String nomeUser = sc.nextLine();
        String slip = ",";
        String path = "txt\\ex45_CadastroAlunos.csv";

        while (op != 0) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar aluno         |         2 - Adicionar nota");
            System.out.println("3 - Alterar nota            |         4 - Remover Aluno");
            System.out.println("5 - Listar Alunos e notas   |         6 - Buscar aluno");
            System.out.println("0 - SAIR                    |");

            System.out.print(nomeUser + "> ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.print("NOME ALUNO: ");
                    String nomeAluno = sc.nextLine();

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                        if (new File(path).length() > 0) {
                            bw.newLine();
                        }

                        bw.write(nomeAluno);

                    } catch (Exception e) {
                        System.out.println();
                        System.out.println(":( |   ERRO: " + e.getMessage() + "   | :( ");
                    }

                    System.out.println("ALUNO CADASTRADO COM SUCESSO!");
                    System.out.println();

                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Qual o nome do aluno que deseha adicionar notas? ");
                    String nomeAdicionar = sc.nextLine();

                    System.out.println("ADCIONAR NOTAS: ");
                    System.out.print("NOTA DE MATEMATICA: ");
                    double notaMat = sc.nextDouble();
                    System.out.print("NOTA DE PORTUGUES: ");
                    double notaPort = sc.nextDouble();
                    System.out.print("NOTA DE CIENCIAS: ");
                    double notaCien = sc.nextDouble();
                    System.out.print("NOTA DE ARTES: ");
                    double notaArt = sc.nextDouble();
                    System.out.print("NOTA DE ESPORTES: ");
                    double notaEsport = sc.nextDouble();

                    double media = (notaMat + notaPort + notaCien + notaArt + notaEsport) / 5;

                    List<String> line2 = Files.readAllLines(Paths.get(path));

                    boolean alunoEncontrado = false;

                    for (int i = 0; i < line2.size(); i++) {

                        String linha = line2.get(i);

                        if (linha.startsWith(nomeAdicionar + ",") || linha.equals(nomeAdicionar)) {

                            linha += slip + notaMat + slip + notaPort + slip + notaCien + slip + notaArt + slip
                                    + notaEsport + slip + media;
                            line2.set(i, linha);

                            alunoEncontrado = true;
                            break;
                        }
                    }

                    if (alunoEncontrado) {
                        Files.write(Paths.get(path), line2);
                        System.out.println("NOTAS ADICIONADAS COM SUCESSO!");
                    } else {
                        System.out.println("ALUNO NAO ENCONTRADO!");
                    }

                    System.out.println();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nome do aluno que deseja alterar a nota: ");
                    String nomeAlterar = sc.nextLine();

                    List<String> notas = null;
                    int linhaIndex = -1;
                    List<String> line3 = Files.readAllLines(Paths.get(path));
                    alunoEncontrado = false;

                    for (int i = 0; i < line3.size(); i++) {
                        String linha = line3.get(i);
                        if (linha.startsWith(nomeAlterar + ",") || linha.equals(nomeAlterar)) {
                            alunoEncontrado = true;
                            notas = Arrays.asList(linha.split(","));
                            linhaIndex = i;
                            break;
                        }
                    }

                    if (alunoEncontrado) {
                        System.out.println("Aluno encontrado! Qual nota deseja alterar?");
                        System.out.println("1 - Matematica | 2 - Portugues | 3 - Ciencias | 4 - Artes | 5 - Esportes");
                        System.out.print(nomeUser + "> ");
                        int notaAlterar = sc.nextInt();
                        System.out.println("Você selecionou a nota: " + notaAlterar + " do aluno " + nomeAlterar);
                        System.out.print("Digite a nova nota: ");
                        double novaNota = sc.nextDouble();
                        notas.set(notaAlterar, String.valueOf(novaNota));
                        String novaLinha = String.join(",", notas);
                        line3.set(linhaIndex, novaLinha);
                        Files.write(Paths.get(path), line3);

                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Nome do aluno que deseja remover: ");
                    String nomeRemover = sc.nextLine();

                    List<String> line4 = Files.readAllLines(Paths.get(path));
                    alunoEncontrado = false;

                    for (int i = 0; i < line4.size(); i++) {
                        String linha = line4.get(i);
                        if (linha.startsWith(nomeRemover + ",") || linha.equals(nomeRemover)) {
                            line4.remove(i);
                            alunoEncontrado = true;
                            break;
                        }
                    }

                    if (alunoEncontrado) {
                        Files.write(Paths.get(path), line4);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }

                    System.out.println();
                    break;

                case 5:
                    List<String> line5 = Files.readAllLines(Paths.get(path));
                    System.out.println("LISTA DE ALUNOS E NOTAS:");
                    System.out.println("NOME | MATEMATICA | PORTUGUES | CIENCIAS | ARTES | ESPORTES | MEDIA");
                    for (String linha : line5) {
                        String[] dados = linha.split(",");
                        System.out.print("Aluno: " + dados[0]);
                        if (dados.length > 1) {
                            System.out.print(" | Notas: ");
                            for (int i = 1; i < dados.length; i++) {
                                System.out.print(dados[i] + " | ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Nome do aluno que deseja buscar: ");
                    String nomeBuscar = sc.nextLine();

                    List<String> line6 = Files.readAllLines(Paths.get(path));
                    alunoEncontrado = false;

                    for (String linha : line6) {
                        if (linha.startsWith(nomeBuscar + ",") || linha.equals(nomeBuscar)) {
                            System.out.println("NOME | MATEMATICA | PORTUGUES | CIENCIAS | ARTES | ESPORTES | MEDIA");
                            System.out.println("Aluno encontrado: " + linha);
                            alunoEncontrado = true;
                            break;
                        }
                    }

                    if (!alunoEncontrado) {
                        System.out.println("Aluno não encontrado!");
                    }

                    System.out.println();
                    break;
                case 0:
                    System.out.println(":)     | PROGRAMA ENCERRADO |     :)");
                    break;
                default:
                    break;
            }

        }

        sc.close();

    }
}
