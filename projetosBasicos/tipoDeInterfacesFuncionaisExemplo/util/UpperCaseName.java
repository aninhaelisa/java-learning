package projetosBasicos.tipoDeInterfacesFuncionaisExemplo.util;

import java.util.function.Function;
import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities.Produto;

public class UpperCaseName implements Function<Produto,String>{

    @Override
    public String apply(Produto p) {
        return p.getNome().toUpperCase();
    }

}