package projetosBasicos.Pedidos.entities;


public class Item {
    private Integer quantidade;
    private Double preco;

    public Item() {
    }

    public Item(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer setQuantidade(Integer quantidade) {
        return this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public Double setPreco(Double preco) {
        return this.preco = preco;
    }



    public String toString(){
        StringBuilder sd = new StringBuilder();
        sd.append("---- ITEM ----\n");
        sd.append("Quantidade: " + getQuantidade() + "\n");
        sd.append("Preço: " + getPreco() + "\n");
        return sd.toString();
    }

    public Double subTotal(){
        return quantidade * preco;
    }
}
