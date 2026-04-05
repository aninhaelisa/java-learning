package projetosBasicos.cadastrarAlunos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao == 1) {
            System.out.println("Quantos alunos deseja cadastrar? ");
            int n = sc.nextInt();

            String[] nome = new String[n];
            int[] idade = new int[n];
            char[] sexo = new char[n];

            for (int i = 0; i < n; i++) {
                System.out.println("NOME DO ALUNO: ");
                sc.nextLine();
                nome[i] = sc.nextLine();
                System.out.println("Qual idade do aluno?");
                idade[i] = sc.nextInt();
                while (idade[i] < 6 || idade[i] > 18) {
                    System.out.println("Idade inválida! Digite uma idade entre 6 e 18.");
                    idade[i] = sc.nextInt();
                }
                System.out.println("Qual o sexo do aluno? (M/F)");
                sexo[i] = sc.next().charAt(0);
                while (sexo[i] != 'M' && sexo[i] != 'F') {
                    System.out.println("Sexo inválido! Digite M para masculino ou F para feminino.");
                    sexo[i] = sc.next().charAt(0);
                }
                System.out.println("ALUNO CADASTRADO COM SUCESSO!");
                System.out.println("|^^|^^".repeat(20));
            }

            System.out.println("LISTA DE ALUNOS CADASTRADOS:");

            for (int i = 0; i < n; i++) {
                System.out.println("ALUNO " + (i + 1) + ": " + nome[i] + ", " + idade[i] + " anos, sexo: " + sexo[i]);
            }

            System.out.println("Deseja cadastrar mais alunos? (1 - Sim / 0 - Não)");
            opcao = sc.nextInt();
            System.out.println("------".repeat(30));
        }

        System.out.println("PROGRAMA ENCERRADO. OBRIGADO POR UTILIZAR!");

        sc.close();
    }
}