package projetosBasicos.funcionarios02;

import java.util.*;

import projetosBasicos.funcionarios02.entities.Funcionario;
import projetosBasicos.funcionarios02.entities.Terceirizado;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("Você deseja cadastrar um funcionario? (1 - Sim / 0 - Não)");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("Funcionario terceirizado? (1 - Sim / 2 - Não)");
                op = sc.nextInt();
                if (op == 1) {
                    sc.nextLine();
                    System.out.println("Digite o nome do funcionario:");
                    String nome = sc.nextLine();
                    System.out.println("Digite as horas trabalhadas:");
                    int horas = sc.nextInt();
                    System.out.println("Digite o valor por hora:");
                    double valorPorHora = sc.nextDouble();
                    System.out.println("Digite a despesa adicional:");
                    double despesaAdicional = sc.nextDouble();

                    Terceirizado func1 = new Terceirizado(nome, horas, valorPorHora, despesaAdicional);
                    System.out.println(func1);
                    System.out.printf("Valor a ser pago: %.2f", func1.pagamento());
                    System.out.println();
                } else if (op == 2) {
                    sc.nextLine();
                    System.out.println("Digite o nome do funcionario:");
                    String nome = sc.nextLine();
                    System.out.println("Digite as horas trabalhadas:");
                    int horas = sc.nextInt();
                    System.out.println("Digite o valor por hora:");
                    double valorPorHora = sc.nextDouble();

                    Funcionario func2 = new Funcionario(nome, horas, valorPorHora);
                    System.out.println(func2);
                    System.out.printf("Valor a ser pago: %.2f", func2.pagamento());
                    System.out.println();
                } else {
                    System.out.println("Opção invalida!");
                    break;
                }
            }

        } while (op == 0);
        System.out.println("Programa finalizado!");

        sc.close();
    }

}
