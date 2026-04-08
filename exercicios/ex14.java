package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("EXERCICIO 14 - IMPOSTO DE RENDA");

        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("RENDA ANUAL: ");
        double rendaAnual = sc.nextDouble();

        double imposto;

        if(rendaAnual <= 2000.00) {
            imposto = 0.0;
            System.out.println("ISENTO DE IMPOSTO DE RENDA");
        } else if (rendaAnual <= 3000.00) {
            imposto = (rendaAnual - 2000.00) * 0.08;
        } else if (rendaAnual <= 4500.00) {
            imposto = (rendaAnual - 3000.00) * 0.18 + 80.00;
        } else {
            imposto = (rendaAnual - 4500.00) * 0.28 + 350.00;
        }
        
        System.out.println("---".repeat(10)+"--> RESULTADO <--"+"---".repeat(10));
        System.out.println("NOME: " + nome);
        System.out.printf("IMPOSTO DE RENDA: R$ %.2f%n", imposto);

        sc.close();
    }
}
