package projetosBasicos.funcoesComoParametro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import projetosBasicos.funcoesComoParametro.entities.Produto;
import projetosBasicos.funcoesComoParametro.service.ProdutoService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto>  list = new ArrayList<>();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.00));

        ProdutoService ps = new ProdutoService();
        double sum =  ps.filteredSum(list, p -> p.getNome().charAt(0) == 'T');

        System.out.println("Sum: " + String.format("%.2f", sum));
    }
}
