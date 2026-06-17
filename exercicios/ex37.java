package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class ex37 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 37 - FileReader e BufferedReader");
        String path = "F:\\TUDO ana\\ANA\\projetosJAVA\\projetos-SegundoCurso\\txt\\ex36.txt";
       

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch(Exception e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } 

    }
}
