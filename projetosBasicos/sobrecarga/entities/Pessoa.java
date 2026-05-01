package projetosBasicos.sobrecarga.entities;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    // Construtor1
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Sobrecarga do construtor2
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


}
