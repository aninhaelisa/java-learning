package exercicios;

import java.util.Scanner;
import java.io.File;

public class ex39 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 39 - Manipulando arquivos com File");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String srtPath = sc.nextLine();

        File path = new File(srtPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder: folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file: files){
            System.out.println(file);
        }

        boolean success = new File(srtPath + "\\subdir").mkdir(); // cria um diretório chamado "subdir" dentro do caminho especificado
        if(success){
            System.out.println("Diretório criado com sucesso!");
        } else {
            System.out.println("Falha ao criar o diretório.");
        }
        sc.close();
    }
}
