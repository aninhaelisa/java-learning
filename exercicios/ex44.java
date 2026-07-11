package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex44 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 44 - Cadastro de frutas com Set");
        Scanner sc = new Scanner(System.in);

        Set<String> frutas = new HashSet<>();

        System.out.print("Quantas frutas deseja cadastrar? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
            String fruta = sc.next();
            frutas.add(fruta);
        }

        System.out.println("Frutas cadastradas: ");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("Total de frutas cadastradas: " + frutas.size());
        System.out.println("Deseja remover alguma fruta? (s/n)");
        String remove = sc.next();
        if (remove.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome da fruta que deseja remover: ");
            String frutaRemove = sc.next();
            if (frutas.contains(frutaRemove)) {
                frutas.remove(frutaRemove);
                System.out.println("Fruta removida com sucesso!");

                System.out.println("Frutas cadastradas após remoção: ");
                for (String fruta : frutas) {
                    System.out.println(fruta);
                }
            } else {
                System.out.println("Fruta não encontrada!");
            }
        }
        


        sc.close();
    }
}
