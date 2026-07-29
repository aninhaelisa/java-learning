package projetosBasicos.funcionariosLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.funcionariosLambda.entities.Funcionario;


public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho do arquivo: ");
        String path = sc.nextLine();
        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Funcionario maior = list.stream().max((f1, f2) -> Double.compare(f1.getSalario(), f2.getSalario())).orElse(null);
            System.out.print("MAIOR SALARIO: ");
            System.out.print(maior.getNome());
            System.out.println(String.format(" %.2f", maior.getSalario()));

            System.out.println();
            List<Funcionario> letram = list.stream().filter(f -> f.getNome().startsWith("M")).toList();
            for (Funcionario funcionario : letram) {
                System.out.println(funcionario);
            }

            System.out.print("Valor: ");
            double valor = sc.nextDouble();
            List<String> emails = list.stream().filter(f -> f.getSalario() > valor).map(Funcionario::getEmail).sorted().toList();
            for (String string : emails) {
                System.out.println(string);
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        sc.close();
    }
}
