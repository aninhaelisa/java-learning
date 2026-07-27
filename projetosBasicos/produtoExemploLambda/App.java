package projetosBasicos.produtoExemploLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import projetosBasicos.produtoExemploLambda.entities.Produto;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Produto> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("AVG: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = list.stream().filter(p -> p.getPreco() < avg).map(p -> p.getNome())
                    .sorted(comp.reversed()).collect(Collectors.toList());
            names.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
