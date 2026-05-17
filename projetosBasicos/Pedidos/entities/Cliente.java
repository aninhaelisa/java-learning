package projetosBasicos.Pedidos.entities;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Cliente {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private String nome;
    private String email;
    private Date dataNascimento;

    public Cliente(){
    }

    public Cliente(String nome, String email, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date setDataNascimento(Date dataNascimento) {
        return this.dataNascimento = dataNascimento;
    }

    public String toString(){
        StringBuilder sd = new StringBuilder();
        sd.append("---- CLIENTE ----\n");
        sd.append("Nome: " + getNome() + "\n");
        sd.append("Email: " + getEmail() + "\n");
        sd.append("Data de Nascimento: " + sdf.format(getDataNascimento()) + "\n");
        return sd.toString();
    }


}
