package projetosBasicos.equalsExemplo.entities;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Double id;

    //Construtor
    public Pessoa(String nome, Integer idade, Double id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    //Setters e Getters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getId(){
        return id;
    }
    public void setId(double id){
        this.id = id;
    }

    //CONSTRUTOR VAZIO
    public Pessoa(){
    }

    //toString
    public String toString(){
        return "NOME: " + nome + " | " + "IDADE: " + idade + " | " + "ID: " + id + " | ";
    }

}
