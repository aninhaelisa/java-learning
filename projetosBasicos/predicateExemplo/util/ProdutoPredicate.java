package projetosBasicos.predicateExemplo.util;

import projetosBasicos.predicateExemplo.entities.Produto;
import java.util.function.Predicate;

public class ProdutoPredicate implements Predicate<Produto>{
    @Override
    public boolean test(Produto p){
        return p.getPreco() >= 100.0;
    }
}
