package projetosBasicos.compareToExemplo.entities;

public class Pessoa implements comparable<Pessoa>{
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa(){
    }

    public String toString(){
        return "Nome: " + nome + " | " + "Idade: " + idade + " | " + "Altura: " + altura;
    }

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
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome);
    }
}
