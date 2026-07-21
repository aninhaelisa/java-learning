package projetosBasicos.compareToExemplo;

import java.util.Scanner;

import projetosBasicos.compareToExemplo.entities.Pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

    try{
        Scanner sc = new Scanner(System.in);

        System.out.println("COMPARE DUAS PESSOAS ");

        Pessoa p = new Pessoa();
        List<Pessoa> pessoaList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Pessoa nPessoa = new Pessoa();
            System.out.print("NOME: ");
            String nome = sc.nextLine();
            System.out.print("IDADE: ");
            int idade = sc.nextInt();
            System.out.print("ALTURA: ");
            double altura = sc.nextDouble();
            nPessoa.setNome(nome);
            nPessoa.setIdade(idade);
            nPessoa.setAltura(altura);

            pessoaList.add(nPessoa);
            
            sc.nextLine();
        }

        for(int i = 0; i<pessoaList.size(); i++){
            Pessoa nPessoa = pessoaList.get(i);
            System.out.println("PESSOA: " + (i+1) + ": " + nPessoa);
        }

        Pessoa p1 = pessoaList.get(0);
        Pessoa p2 = pessoaList.get(1);

        System.out.println();

        System.out.println("CompareTo: " + p1.compareTo(p2));
    
        sc.close();
    } catch(Exception e){
        System.out.println("ERRO: " + e.getMessage());
        System.out.println();
    }
    }
}
