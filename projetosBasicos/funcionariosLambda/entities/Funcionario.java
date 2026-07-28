package projetosBasicos.funcionariosLambda.entities;

public class Funcionario {
    private String nome;
    private String email;
    private Double salario;

    public Funcionario(String nome, String email, double salario){
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public Funcionario(){
    }

    public String toString(){
        return String.format("%s,%s,%.2f", nome, email, salario);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
