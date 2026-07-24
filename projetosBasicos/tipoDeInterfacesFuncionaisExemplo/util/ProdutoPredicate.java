package projetosBasicos.tipoDeInterfacesFuncionaisExemplo.util;

import java.util.function.Predicate;

import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities.Produto;

public class ProdutoPredicate implements Predicate<Produto>{
    @Override
    public boolean test(Produto p){
        return p.getPreco() >= 100.0;
    }
}
