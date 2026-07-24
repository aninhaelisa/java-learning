package projetosBasicos.tipoDeInterfacesFuncionaisExemplo;

import java.util.Locale;
import java.util.function.Predicate;

import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities.Produto;
import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.util.ProdutoPredicate;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        System.out.println();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD case", 80.00));

        System.out.println("Sem alteração");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Produto " + (i + 1) + "°: ");
            System.out.println(list.get(i));
        }

        System.out.println();
        System.out.println("Remove produtos com preco maior que 100");
        // list.removeIf(p -> p.getPreco() >= 100);
        // list.removeIf( new ProdutoPredicate() );
        // list.removeIf(Produto::staticProdutoPredicate);
        // list.removeIf(Produto::nonstaticProdutoPredicate);
        // Predicate<Produto> pred = p -> p.getPreco() >= 100.0;
        // list.removeIf(pred);
        list.removeIf(p -> p.getPreco() >= 100.0);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Produto " + (i + 1) + "°: ");
            System.out.println(list.get(i));
        }

        System.out.println();
    }

}