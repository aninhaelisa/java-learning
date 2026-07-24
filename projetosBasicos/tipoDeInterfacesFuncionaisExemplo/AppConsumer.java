package projetosBasicos.tipoDeInterfacesFuncionaisExemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities.Produto;
import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.util.PriceUpdate;

public class AppConsumer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> list = new ArrayList<>();
        System.out.println();

        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD case", 80.00));

        // atualiza o preço de todos os produtos mutiplicando por 1.1
        // list.forEach(new PriceUpdate());
        // list.forEach(Produto::staticPriceProduto);
        // list.forEach(Produto::nonstaticPriceProduto);
        // Consumer<Produto> cons = p -> p.setPreco(p.getPreco()*1.1);
        // list.forEach(cons);
        list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
        
        list.forEach(System.out::println);

        System.out.println();
    }
}
