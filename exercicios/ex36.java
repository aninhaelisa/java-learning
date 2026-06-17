package exercicios;

import java.io.File;
import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 36 - File e Scanner");
        File file = new File("F:\\TUDO ana\\ANA\\projetosJAVA\\projetos-SegundoCurso\\txt\\ex36.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
  
    }
}
