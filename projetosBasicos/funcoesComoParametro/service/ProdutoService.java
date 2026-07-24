package projetosBasicos.funcoesComoParametro.service;

import java.util.List;

import projetosBasicos.funcoesComoParametro.entities.Produto;

public class ProdutoService {
    public double filteredSum(List<Produto> list) {
        double sum = 0.0;
        for (Produto p : list) {
            if (p.getNome().charAt(0) == 'T') {
                sum += p.getPreco();
            }
        }
        return sum;
    }
}
