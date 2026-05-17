package projetosBasicos.Pedidos.entities;

public class Produto {
    private String nome;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Double setPreco(Double preco) {
        return this.preco = preco;
    }

    public String toString(){
        StringBuilder sd = new StringBuilder();
        sd.append("---- PRODUTO ----\n");
        sd.append("Nome: " + getNome() + "\n");
        sd.append("Preço: " + getPreco() + "\n");
        return sd.toString();
    }
}
