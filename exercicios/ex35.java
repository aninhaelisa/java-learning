package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 35 - JOGO DA VELHA COM MATRIX");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[][] matrix = new int[3][3];

        System.out.println("JOGO DA VELHA");
        System.out.println("Escolha:");
        System.out.println("1 - X");
        System.out.println("2 - O");

        int user = sc.nextInt();

        if (user != 1 && user != 2) {
            System.out.println("Valor inválido.");
            sc.close();
            return;
        }

        int computador = (user == 1) ? 2 : 1;

        System.out.println("Você é: " + (user == 1 ? "X" : "O"));
        System.out.println("Computador é: " + (computador == 1 ? "X" : "O"));

        int jogadas = 0;
        boolean turnoJogador = true;

        while (true) {

            imprimirTabuleiro(matrix);

            if (turnoJogador) {
                int linha, coluna;

                while (true) {
                    System.out.print("Linha (0-2): ");
                    linha = sc.nextInt();

                    System.out.print("Coluna (0-2): ");
                    coluna = sc.nextInt();

                    if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                        System.out.println("Posição inválida.");
                    } else if (matrix[linha][coluna] != 0) {
                        System.out.println("Posição já ocupada.");
                    } else {
                        break;
                    }
                }

                matrix[linha][coluna] = user;

            } else {
                int linha, coluna;

                do {
                    linha = random.nextInt(3);
                    coluna = random.nextInt(3);
                } while (matrix[linha][coluna] != 0);

                System.out.println("Computador jogou em: " + linha + ", " + coluna);
                matrix[linha][coluna] = computador;
            }

            jogadas++;

            if (verificarVitoria(matrix, user)) {
                imprimirTabuleiro(matrix);
                System.out.println("Você venceu.");
                break;
            }

            if (verificarVitoria(matrix, computador)) {
                imprimirTabuleiro(matrix);
                System.out.println("Computador venceu.");
                break;
            }

            if (jogadas == 9) {
                imprimirTabuleiro(matrix);
                System.out.println("Empate.");
                break;
            }

            turnoJogador = !turnoJogador;
        }

        sc.close();
    }

    public static void imprimirTabuleiro(int[][] matrix) {
        System.out.println("\n  0 1 2");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " ");

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 1) {
                    System.out.print("X ");
                } else if (matrix[i][j] == 2) {
                    System.out.print("O ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean verificarVitoria(int[][] m, int p) {

        for (int i = 0; i < 3; i++) {
            if (m[i][0] == p && m[i][1] == p && m[i][2] == p) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (m[0][j] == p && m[1][j] == p && m[2][j] == p) {
                return true;
            }
        }

        if (m[0][0] == p && m[1][1] == p && m[2][2] == p) {
            return true;
        }

        if (m[0][2] == p && m[1][1] == p && m[2][0] == p) {
            return true;
        }

        return false;
    }
}
