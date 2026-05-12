package projetosBasicos.matrix;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("MATRIX");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("================================");
        System.out.println();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
            System.out.println("---------");
        }
        System.out.println();
        System.out.println("================================");
    
        System.out.println("Diagonal Principal: ");
        for(int i = 0; i<n;i++){
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        int negativos = 0;
        System.out.println("Negativos: ");

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j]<0){
                    negativos++;
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de negativos: " + negativos);


        sc.close();
    }
}
