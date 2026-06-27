package projetosBasicos.compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import projetosBasicos.compareTo.entities.Produto;

public class App {
     public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Notebook", 3500.0));
        lista.add(new Produto("Caneta", 5.0));
        lista.add(new Produto("Caderno", 25.0));
        lista.add(new Produto("Borracha", 3.5));

        Collections.sort(lista);

        System.out.println("Produtos em ordem alfabética:");

        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
