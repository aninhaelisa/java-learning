package projetosBasicos.vetorBasico;

import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.vetorBasico.entities.Produto;


public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos produtos serão registrados? ");
        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Produto #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Produto #" + (i + 1) + ": " + vect[i].getNome() + " - R$" + vect[i].getPreco());
        }

        sc.close();
    }
}
