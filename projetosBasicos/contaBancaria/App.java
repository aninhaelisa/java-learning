package projetosBasicos.contaBancaria;

import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.contaBancaria.entities.Conta;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Entre com o titular da conta: ");
        String titular = sc.nextLine();

        Conta conta = new Conta(numero, titular);

        System.out.println("Dados da conta: " + conta.getNumero() + " - " + conta.getTitular() + " - Saldo: R$" + String.format("%.2f", conta.getSaldo()));

        System.out.print("Deseja fazer um depósito inicial (s/n)? ");
        String resposta = sc.nextLine();
        if(resposta.equalsIgnoreCase("s")) {
            System.out.print("Entre com o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta.deposito(depositoInicial);
            System.out.println("Saldo: R$" + String.format("%.2f", conta.getSaldo()));
        }

        sc.nextLine();
        System.out.println("Deseja fazer um saque depósito (s/n)? ");
        resposta = sc.nextLine();
        if(resposta.equalsIgnoreCase("s")) {
            System.out.print("Entre com o valor do saque: ");
            double saque = sc.nextDouble();
            conta.saque(saque);
            System.out.println("Saldo: R$" + String.format("%.2f", conta.getSaldo()));
        }

        System.out.println("PROGRAMA ENCERRADO :)");
        

        sc.close();
    }
}
