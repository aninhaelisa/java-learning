package exercicios;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 29 - MAIS VELHO");
        System.out.print("Quantos elementos possui o vetor? ");
        int n = sc.nextInt();
        int[] idades = new int[n];
        String[] nomes = new String[n];

        int maiorIdade = 0;
        String nomeMaisVelho = "";

        for (int i = 0; i < n; i++) {
            System.out.println("---".repeat(10));
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            if(idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }


        System.out.println("O nome do mais velho é: " + nomeMaisVelho);
        System.out.println("A idade é: " + maiorIdade);

        sc.close();
    }
}
