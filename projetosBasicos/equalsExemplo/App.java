package projetosBasicos.equalsExemplo;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.equalsExemplo.entities.Pessoa;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Pessoa p = new Pessoa();
        List<Pessoa> pessoasList = List.of(new Pessoa(), new Pessoa());

        try {
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < pessoasList.size(); i++) {
                Pessoa pessoaI = pessoasList.get(i);
                
                System.out.println("PESSOA " + (i + 1) + ": ");
                System.out.print("NOME: ");
                String nome = sc.nextLine();
                System.out.print("IDADE: ");
                int idade = sc.nextInt();
                System.out.print("ID: ");
                double id = sc.nextDouble();

                pessoaI.setNome(nome);
                pessoaI.setIdade(idade);
                pessoaI.setId(id);

                sc.nextLine();
            }

            for (int i = 0; i < pessoasList.size(); i++) {
                Pessoa pessoaI = pessoasList.get(i);
                System.out.print("PESSOA " + (i + 1) + " : ");
                System.out.println(pessoaI);
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("ERRO AO EXECUTAR O PROGRAMA: " + e.getMessage());
        }
    }
}
