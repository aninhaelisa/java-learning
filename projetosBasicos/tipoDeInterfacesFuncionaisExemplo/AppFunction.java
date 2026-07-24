package projetosBasicos.tipoDeInterfacesFuncionaisExemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities.Produto;
import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.util.UpperCaseName;

public class AppFunction {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        System.out.println();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD case", 80.00));

        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // List<String> names = list.stream().map(Produto::staticUpperCaseName).collect(Collectors.toList());
        // List<String> names = list.stream().map(Produto::nonstaticUpperCaseName).collect(Collectors.toList());
        // Function<Produto, String> func = p -> p.getNome().toUpperCase();
        // List<String> names = list.stream().map( func ).collect(Collectors.toList());
        List<String> names = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
