package projetosBasicos.produtoExemploLambda.entities;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(){
    }

    public Produto(String nome, Double preco){
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public double getPreco(){
        return preco;
    }

    public void setIdade(double preco){
        this.preco = preco;
    }

    @Override
    public String toString(){
        return String.format("%s,%.2f", nome,preco);
    }
}
