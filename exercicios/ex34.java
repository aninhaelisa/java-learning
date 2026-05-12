package exercicios;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 34 - MATRIX");
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas: ");
        int n = sc.nextInt();
        System.out.println("Colunas: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        } 

        System.out.println("Matriz: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Qual Numero deseja localizar? ");
        System.out.print("> ");
        int x = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == x){
                    System.out.println("POSIACAO: ");
                    System.out.println("LINHA: " + i + " - " + "COLUNA: " + j);

                    if(j > 0){
                        System.out.println("ESQUERDA -> " + matrix[i][j-1]);
                    }

                    if(i > 0){
                        System.out.println("CIMA -> " + matrix[i-1][j]);
                    }

                    if(j < m-1){
                        System.out.println("DIREITA -> "+matrix[i][j+1]);
                    }

                    if(i < n-1){
                        System.out.println("BAIXO -> "+matrix[i+1][j]);
                    }
                }

            }
        }

        sc.close();
    }
}
