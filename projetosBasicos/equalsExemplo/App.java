package projetosBasicos.equalsExemplo;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.modificadoresAcesso.entities.Pessoa;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Pessoa p = new Pessoa();
        List<Pessoa> pessoas = List.of(p); 

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("PESSOA "+(i+1)+": ");
            System.out.print("NOME: ");
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.print("IDADE: ");
            int idade = sc.nextInt();
            System.out.print("ID: ");
            double id = sc.nextDouble();
        }

        

                sc.close();
    }
}
