package projetosBasicos.tipoDeInterfacesFuncionaisExemplo.util;

import java.util.function.Consumer;

import projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities.Produto;

public class PriceUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
        p.setPreco(p.getPreco() * 1.1);
    }
}
