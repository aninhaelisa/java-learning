package exercicios;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 15 - SENHA");
        int senha = 2002;
        System.out.println("Digite a senha: ");
        int tentativa = sc.nextInt();
        while (tentativa != senha) {
            System.out.println("Senha Invalida! Tente novamente: ");
            tentativa = sc.nextInt();
            
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
