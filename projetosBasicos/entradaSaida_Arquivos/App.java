package projetosBasicos.entradaSaida_Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String[] nomes = {"Ana", "Melissa", "Juliana", "Marisa"};
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Escrevendo");
            bw.write("\nEscrevendo um arquivo?...");

            for (String n : nomes) {
                bw.write("\n" + n);
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}