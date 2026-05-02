package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("-----".repeat(10) + "VETORES" + "-----".repeat(10));
        System.out.println("Informe quantas notas deseja inserir: ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Informe a " + (i + 1) + "° nota: ");
            double nota = sc.nextDouble();
            if (nota < 0.0 || nota > 10.00) {
                System.out.println("Valor inválido");
            } else {
                notas[i] = nota;
            }
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            if (notas[i] < 6.0) {
                System.out.println("Reprovado");
            } else if (notas[i] >= 6.0 && notas[i] < 7.0) {
                System.out.println("Aprovado");

            } else {
                System.out.println("NOTA INVÁLIDA");
            }
        }
        sc.close();
    }
}
