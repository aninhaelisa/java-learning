package projetosBasicos.estoque.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void addProduto(int quant){
        quantidade += quant;
    }

    public void removeProduto(int quant){
        quantidade -= quant;
    }
}

