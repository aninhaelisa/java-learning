package exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("EXERCICIO 04 - SALARIO FUNCIONARIO");

        System.out.print("NOME DO FUNCIONARIO:  ");
        String nome = sc.nextLine();

        System.out.print("HORAS TRABALHADAS:  ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("VALOR POR HORA:  ");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("O SALÁRIO DO FUNCIONÁRIO %s É: R$ %.2f\n", nome, salario);

        sc.close();
    }
}
