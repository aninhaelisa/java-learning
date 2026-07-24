package projetosBasicos.funcoesComoParametro.service;

import java.util.List;
import java.util.function.Predicate;

import projetosBasicos.funcoesComoParametro.entities.Produto;

public class ProdutoService {
    public double filteredSum(List<Produto> list, Predicate<Produto> criteria) {
        double sum = 0.0;
        for (Produto p : list) {
            if (criteria.test(p)) {
                sum += p.getPreco();
            }
        }
        return sum;
    }
}
