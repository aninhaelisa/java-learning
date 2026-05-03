package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 31 - APROVADOS E REPROVADOS");
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            double media = (notas1[i] + notas2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
