package projetosBasicos.tipoDeInterfacesFuncionaisExemplo.entities;

public class Produto {
    private String nome;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Predicate
    // public static boolean staticProdutoPredicate(Produto p){
    // return p.getPreco() >= 100;
    // }
    // public boolean nonstaticProdutoPredicate(){
    // return preco >= 100;
    // }

    // Consumer
    public static void staticPriceProduto(Produto p) {
        p.setPreco(p.getPreco() * 1.1);
    }

    public void nonstaticPriceProduto() {
        preco = (preco * 1.1);
    }

    public String toString() {
        return String.format("Nome: %s Preco: %.2f", nome, preco);
    }
}