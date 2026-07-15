package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 47 - VOTOS");

        String path_csv = "txt\\ex47_Votos.csv";
        String path_txt = "txt\\ex47_Votos.txt";
        String slip = ";";

        Map<String, Integer> votos = new HashMap<>();

        System.out.println("Quantos candidatos deseja cadastrar?");
        int quantCand = sc.nextInt();

        
        for (int i = 0; i < quantCand; i++) {
            sc.nextLine();
            System.out.print("Nome do candidato " + (i + 1) + ": ");
            String nomeCand = sc.nextLine();
            System.out.print("Número de votos do candidato  ");
            System.out.print(nomeCand + "> ");
            int numVotos = sc.nextInt();
            votos.put(nomeCand, numVotos);

            // .csv
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path_csv, true))) {
                if (new File(path_csv).length() > 0) {
                    bw.newLine();
                }

                bw.write(nomeCand + slip + numVotos);

            } catch (Exception e) {
                System.out.println(":( |   ERRO: " + e.getMessage() + "   | :( ");
                System.out.println();
            }

            // .txt
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path_txt, true))) {
                if (new File(path_txt).length() > 0) {
                    bw.newLine();
                }

                bw.write("NOME CANDIDATO: " + nomeCand + " ------- NÚMERO DE VOTOS: " + numVotos);

            } catch (Exception e) {
                System.out.println(":( |   ERRO: " + e.getMessage() + "   | :( ");
            }
        }

        System.out.println("relatorio gerado com sucesso!");
        System.out.println("Você adcionou: ");
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println("Candidato: " + entry.getKey() + " - Votos: " + entry.getValue());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path_txt))) {
            String line = br.readLine();
            System.out.println();
            System.out.println("RELATÓRIO DE VOTOS COMPLETO");
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(":( |   ERRO: " + e.getMessage() + "   | :( ");
        }

        sc.close();
    }
}
