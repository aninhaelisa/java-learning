package exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ex38 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 38 - FileWriter e BufferWriter"); 
        String[] line = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = "F:\\\\TUDO ana\\\\ANA\\\\projetosJAVA\\\\projetos-SegundoCurso\\\\txt\\\\ex38.txt";

        try(BufferedWriter bw= new BufferedWriter(new FileWriter(path, true))){
            for(String l : line){
                bw.write(l);
                bw.newLine();
            }

        }  catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
