package projetosBasicos.excecoesTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        metodo1();

        System.out.println();
        System.out.println("Fim do programa!");
 
    }

    public static void metodo1() {
        System.out.println("metodo1 começou!");
        metodo2();
        System.out.println("metodo1 terminou!");
    }

    public static void metodo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("metodo2 começou!");

        try {
            String[] vect = sc.nextLine().split(" "); // o slipt é para separar os elementos do vetor, ou seja, o espaço
                                                      // entre eles.
            int posicao = sc.nextInt();
            System.out.println(vect[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace(); // mostra o erro completo, ou seja, a pilha de erros.
        } catch(InputMismatchException e){
            System.out.println("Entrada inválida! Digite um número inteiro.");
            e.printStackTrace();
        }

        System.out.println("metodo2 terminou!");
        sc.close();
    }
}
