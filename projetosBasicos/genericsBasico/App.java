package projetosBasicos.genericsBasico;

import java.util.Scanner;

import projetosBasicos.genericsBasico.services.PrintService;

public class App { // Generics são bons para tipos de dados que podem variar, como Integer, String, Double, etc. Eles permitem que você escreva código mais flexível e reutilizável, sem precisar criar classes separadas para cada tipo de dado. Além disso, eles ajudam a evitar erros de tipo em tempo de compilação, tornando o código mais seguro e fácil de manter.
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values?  ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
