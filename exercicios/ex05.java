package exercicios;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXERCICIO 05 - VALOR A SER PAGO");

        System.out.print("Quantos produntos deseja comprar? ");
        int quantidade = sc.nextInt();

        double valorTotal = 0.0;

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Código do produto %d: ", i + 1);
            int codigo = sc.nextInt();
            System.out.printf("Quantidade do produto %d: ", i + 1);
            int quantidadeProduto = sc.nextInt();
            System.out.println("Qual o valor do produto " + codigo);
            double valorProduto = sc.nextDouble();

            double totalProduto = quantidadeProduto * valorProduto;
            valorTotal += totalProduto;
            System.out.println("Valor total do produto " + codigo + ": R$ " + totalProduto);
            System.out.println("-----------------------------");
        }

        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        sc.close();
    }
}
