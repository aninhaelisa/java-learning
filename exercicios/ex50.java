package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ex50 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 50 - STREAM BASICO");
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Programa sem Stream: ");
            List<Pessoa> pessoa = new ArrayList<>();

            System.out.println("Quantas pessoas deseja adicionar?");
            System.out.print("> ");
            int quantidade = sc.nextInt();

            System.out.println();

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
                if (p.idade < 18) {
                    menorIdade.add(p);
                }
            }
            System.out.println();

            System.out.println("Pessoas:");
            for (Pessoa p : pessoa) {
                System.out.println("Nome: " + p.nome + ", Idade: " + p.idade);
            }
            System.out.println();

            System.out.println("Pessoas com menos de 18 anos:");
            for (Pessoa p : menorIdade) {
                System.out.println("Nome: " + p.nome + ", Idade: " + p.idade);
            }


        
            // PROGRAMA COM STREAM ABAIXO: ----------------------------------------------------
            System.out.println();
            System.out.println("Programa com Stream: ");

            System.out.println("Quantos animais deseja adicionar?");
            System.out.print("> ");
            int n = sc.nextInt();
            
            List<Animal> animais = Stream.generate(() -> {
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                return new Animal(idade, nome);
            }).limit(n).toList();
            System.out.println();
            animais.forEach(a -> System.out.println("Nome: " + a.nome + ", Idade: " + a.idade));

           // ERRO: List<Animal> animal = Stream.iterate(0, i -> i+1).limit(n).map(i -> new Animal(sc.nextInt(), sc.nextLine())).toList();
           // ERRO: animal.forEach(a -> System.out.println("Nome: " + a.nome + ", Idade: " + a.idade));

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

    public static class Pessoa {
        public String nome;
        public int idade;
    }

    public static class Animal {
        public String nome;
        public int idade;
    
        public Animal(int idade, String nome) {
            this.idade = idade;
            this.nome = nome;
        }
    }
}
