package projetosBasicos.uploadArquivo;

import java.io.BufferedReader;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.uploadArquivo.entities.Arquivo;
import projetosBasicos.uploadArquivo.entities.Upload;

import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(10) + "UPLOAD ARQUIVO" + "=".repeat(10));

        System.out.println("Digite o caminho do arquivo (pasta\\arquivo): ");
        System.out.print("> ");
        String path = sc.nextLine();

        Arquivo arquivo = new Arquivo();
        arquivo.nomeArquivo(path);
        arquivo.tamanhoArquivo(path);

        System.out.println();

        Upload upload = new Upload(arquivo.getNome(), arquivo.getTamanho());
        upload.carregando();

        System.out.println(" Arquivo carregado com sucesso!");
        System.out.println(arquivo);

        System.out.println();
        System.out.println("Conteudo do arquivo: ");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}