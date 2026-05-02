package projetosBasicos.menorAltura.entities;

public class Dados {
    private String nome;
    private double altura;
    private int idade;

    public Dados(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double setAltura(double altura) {
        return this.altura = altura;
    }

    public int setIdade(int idade) {
        return this.idade = idade;
    }


}
