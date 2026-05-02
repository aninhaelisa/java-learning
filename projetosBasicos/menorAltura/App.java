package projetosBasicos.menorAltura;

import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.menorAltura.entities.Dados;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas deseja cadastrar? ");
        int n = sc.nextInt();
        Dados[] dados = new Dados[n];

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Digite o nome da pessoa: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            System.out.println("Digite a idade da pessoa: ");
            int idade = sc.nextInt();

            dados[i] = new Dados(nome, altura, idade);
        }

        System.out.println("Dados cadastrados: ");
        double menor = dados[0].getAltura();
        for(int i = 0; i < dados.length; i++) {
            if(dados[i].getAltura() < menor){
                menor = dados[i].getAltura();
            }
            System.out.println("Nome: " + dados[i].getNome() + " - Altura: " + dados[i].getAltura() + " - Idade: " + dados[i].getIdade());
        }

        System.out.println("menor altura: " + menor);   

        sc.close();
    }
}
