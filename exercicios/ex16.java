package exercicios;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 16 - IMPARES");

        System.out.print("Informe um valor: ");
        int n = sc.nextInt();
        for(int i =0; i < n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
