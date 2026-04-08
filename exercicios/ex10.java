package exercicios;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EXERCICIO 10 - HORAS JOGADAS");
        char continuar = 's';
        while (continuar == 's') {
            System.out.print("Hora que comecou a jogar: ");
            int inicio = sc.nextInt();
            
            System.out.print("Hora que parou de jogar: ");
            int fim = sc.nextInt();

            int horasJogadas;
            if (fim >= inicio) {
                horasJogadas = fim - inicio;
            } else {
                horasJogadas = (24 - inicio) + fim;
            }

            System.out.println("Horas jogadas: " + horasJogadas);
            
            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        }
        sc.close();
    }
}
