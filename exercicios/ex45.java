package exercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

                    Object[] line1 = { nomeAluno};

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                        for (Object l : line1) {
                            bw.write(String.valueOf(l));
                        }

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

                    List<String> line2 = Files.readAllLines(Paths.get(path));

                    for (int i = 0; i < line2.size(); i++) {

                        String linha = line2.get(i);

                        if (linha.startsWith(nomeAdicionar + ",") || linha.equals(nomeAdicionar)) {

                            linha += slip + notaMat + slip + notaPort + slip + notaCien + slip + notaArt + slip + notaEsport;
                            line2.set(i, linha);
                            break;
                        }
                    }

                    Files.write(Paths.get(path), line2);
                    System.out.println("NOTAS ADICIONADAS COM SUCESSO!");

                    System.out.println();
                default:
                    break;
            }

        }

        sc.close();

    }
}
