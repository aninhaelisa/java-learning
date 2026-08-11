package projetosBasicos.uploadArquivo.entities;

import java.io.File;

public class Arquivo {
    private String nome;
    private Double tamanho = 0.0;

    public Arquivo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public Arquivo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return String.format("Arquivo: %s \nTamanho: %.2f KB", nome, tamanho);
    }

    public void nomeArquivo(String caminho){
        File file = new File(caminho);
        if (file.exists()) {
            this.nome = file.getName();
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }

    public void tamanhoArquivo(String caminho){
        File file = new File(caminho);
        if (file.exists()) {
            this.tamanho = (double) file.length() / 1024; // tamanho em KB
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }
}