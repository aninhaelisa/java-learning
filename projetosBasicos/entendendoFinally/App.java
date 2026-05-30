package projetosBasicos.entendendoFinally;

import java.io.File;

public class App {
    public static void main(String[] args) {
        File file = new File("arquivo/arquivo.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage()); // getMessage() é um método que retorna a mensagem de erro.
        } finally {
            System.out.println("Bloco finally executado!");
        }

        System.out.println("fim");
    }
}
