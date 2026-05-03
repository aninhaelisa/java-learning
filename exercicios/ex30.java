package exercicios;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 30 - QUANTIDADE DE HOMENS E MULHERES");

        int homens = 0, mulheres = 0;

        System.out.print("Informe quantas pessoas deseja cadastrar: ");
        int n = sc.nextInt();
        String[] pessoas = new String[n];
        double[] alturas = new double[n];

        double somaM = 0;
        double somaF = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o sexo da pessoa (F/M): ");
            pessoas[i] = sc.next();
            System.out.println("Informe a altura da pessoa: ");
            alturas[i] = sc.nextDouble();

            if (pessoas[i].equalsIgnoreCase("M")) {
                homens++;
                somaM += alturas[i];
            } else if (pessoas[i].equalsIgnoreCase("F")) {
                mulheres++;
                somaF += alturas[i];
            } else {
                System.out.println("Sexo inválido. Por favor, informe F ou M.");
            }
        }

        double mediaM = (homens > 0) ? somaM / homens : 0;
        double mediaF = (mulheres > 0) ? somaF / mulheres : 0;

        System.out.println("----------------------------");
        System.out.printf("Média de altura dos homens: %.2f %n", mediaM);
        System.out.println("Quantidade de homens: " + homens);
        System.out.println("----------------------------");
        System.out.printf("Média de altura das mulheres: %.2f %n", mediaF);
        System.out.println("Quantidade de mulheres: " + mulheres);

        sc.close();
    }    
}
