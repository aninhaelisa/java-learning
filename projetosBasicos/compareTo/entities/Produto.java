package projetosBasicos.compareTo.entities;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}