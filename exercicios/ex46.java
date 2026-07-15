package exercicios;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ex46 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 46 - ESTOQUE DE PRODUTOS");

        Map<String, Double> estoque = new HashMap<>();

        System.out.println("Quantos produtos deseja cadastrar?");
        System.out.print("> ");
        int quantidade = sc.nextInt();
        for(int i =0; i<quantidade; i++){
            System.out.print("Digite o nome do produto " + (i+1) + ": ");
            String nomeProduto = sc.next();
            System.out.print("Digite o preço do produto " + (i+1) + ": ");
            double precoProduto = sc.nextDouble();
            estoque.put(nomeProduto, precoProduto);
        }
        System.out.print("Quer alterar o preco de algum produto? (1-sim / 2-nao)");
        int opcao = sc.nextInt();
        if(opcao == 1){
            System.out.print("Digite o nome do produto que deseja alterar o preco:");
            String nomeProduto = sc.next();
            if(estoque.containsKey(nomeProduto)){
                System.out.print("Digite o novo preco do produto " + nomeProduto + ":");
                double novoPreco = sc.nextDouble();
                estoque.put(nomeProduto, novoPreco);
                System.out.println("Preco do produto " + nomeProduto + " alterado para " + novoPreco);
            } else {
                System.out.println("Produto nao encontrado.");
            }
        }
        System.out.println();
        System.out.println("Estoque de produtos:");
        for(Map.Entry<String, Double> entry : estoque.entrySet()){
            System.out.println("Produto: " + entry.getKey() + " | Preco: " + entry.getValue());
        }        

        sc.close();
    }
}