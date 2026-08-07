package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 50 - STREAM BASICO");
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoa = new ArrayList<>();

        System.out.println("Quantas pessoas deseja adicionar?");
        System.out.print("> ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Pessoa n°" + (i + 1));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            Pessoa pessoaNova = new Pessoa();
            pessoaNova.nome = nome;
            pessoaNova.idade = idade;
            pessoa.add(pessoaNova);
        }

        List<Pessoa> menorIdade = new ArrayList<>();
        for (Pessoa p : pessoa) {
           if(p.idade < 18)  {
            menorIdade.add(p);
           }   
        }

        System.out.println("Pessoas:");
        for (Pessoa p : pessoa) {
            System.out.println("Nome: " + p.nome + ", Idade: " + p.idade);
        }

        System.out.println("Pessoas com menos de 18 anos:");
        for (Pessoa p : menorIdade) {
            System.out.println("Nome: " + p.nome + ", Idade: " + p.idade);
        }

        sc.close();
    }

    public static class Pessoa {
        public String nome;
        public int idade;
    }
}
