package exercicios;

import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("EXERCICIO 52 - Contando (thread.sleep)");

        try{

            System.out.print("Digite um numero: ");
            int n = sc.nextInt();

            System.out.println("Iniciando contagem:");
            for(int i = 0; i<n; i++){
                System.out.print(i + " - ");
                Thread.sleep(1000);
            }

            System.out.println("Contagem finalizada!");

        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
