package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 56 - ADVINHE A PALAVRA");
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        List<String> palavras = Arrays.asList("banana", "abacaxi", "laranja", "morango", "uva");

        int n = random.nextInt(palavras.size());

        String palavra = palavras.get(n);

        StringBuilder palavraOculta = new StringBuilder("_".repeat(palavra.length()));

        int tentativas = 6;

        while (tentativas > 0 && palavraOculta.toString().contains("_")) {
            System.out.print("Palavra: " + palavraOculta + "\n");
            System.out.print("Tentativas restantes: " + tentativas + "\n");
            System.out.print("Digite uma letra: ");
            String letra = sc.nextLine().toLowerCase();

            if (letra.length() != 1) {
                System.out.println("Digite apenas uma letra.");
                continue;
            }

            boolean acertou = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra.charAt(0)) {
                    palavraOculta.setCharAt(i, letra.charAt(0));
                    acertou = true;
                }
            }

            try {
                if (!acertou) {
                    tentativas--;
                    System.out.println("Letra incorreta!");
                    Thread.sleep(2000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }

        System.out.println("Palavra: " + palavra);
        System.out.println("Fim do jogo!");

        sc.close();
    }
}
