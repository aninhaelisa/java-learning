package projetosBasicos.sacarDinheiro;

import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.sacarDinheiro.model.entities.Conta;
import projetosBasicos.sacarDinheiro.model.exceptions.ContaException;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados da conta:");
        try{
            System.out.print("Número: ");
            int numero = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine(); 
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            Conta conta = new projetosBasicos.sacarDinheiro.model.entities.Conta(numero, titular, saldo);
            System.out.print("Digite um valor para sacar: ");
            double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
            System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
