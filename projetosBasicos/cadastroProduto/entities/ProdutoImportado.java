package projetosBasicos.cadastroProduto.entities;

public class ProdutoImportado extends Produto {
    private Double taxa;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    public Double getTaxa() {
        return taxa;
    }

    public Double precoTotal() {
        return getPreco() + taxa;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + " R$ " + String.format("%.2f", precoTotal()) + " (Taxa de importação: R$ " + String.format("%.2f", taxa) + ")";
    }
}
