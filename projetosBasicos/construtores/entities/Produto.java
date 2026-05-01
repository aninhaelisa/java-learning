package projetosBasicos.construtores.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){ //construtor padrão
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double totalValueInStock() {
        return preco * quantidade;
    }

    public void addProducts(int quantity) {
        this.quantidade += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantidade -= quantity;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
