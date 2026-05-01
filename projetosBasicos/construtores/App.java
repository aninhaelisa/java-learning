package projetosBasicos.construtores;

import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.construtores.entities.Produto;

public class App {
    public static void main(String[] args) {
        // CONSTUTORES SÃO MÉTODOS ESPECIAIS PARA INICIALIZAR OBJETOS, O NOME DO
        // CONSTRUTOR É O MESMO DA CLASSE, NÃO TEM RETORNO E PODE RECEBER PARÂMETROS
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("Price: ");
        double preco = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade); //instanciando o objeto produto usando o construtor

        System.out.println();
        System.out.println("Product data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + produto);
        sc.close();
    }
}
