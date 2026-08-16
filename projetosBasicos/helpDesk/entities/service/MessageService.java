package projetosBasicos.helpDesk.entities.service;

import projetosBasicos.helpDesk.entities.enums.Categoria;
import projetosBasicos.helpDesk.entities.enums.Status;

public class MessageService {
    private String mensagem;
    private String email;
    private Categoria categoria;
    private Status status;

    private String pathMensagem = "txt/mensagem.txt";
    private String pathLog = "txt/log-helpDesk.csv";

    public MessageService(){
    }

    public MessageService(String mensagem, String email, Categoria categoria, Status status){
        this.mensagem = mensagem;
        this.email = email;
        this.categoria = categoria;
        this.status = status;
    }

    public String toString(){
        return String.format("Categoria: %s \nStatus: %s \nEmail: %s \nMensagem: %s \n", categoria, status, email, mensagem );
    }

    public String getMensagem(){
        return mensagem;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getPathMensagem(){
        return pathMensagem;
    }

    public void setPathMensagem(String pathMensagem){
        this.pathMensagem = pathMensagem;
    }

    public String getPathLog(){
        return pathLog;
    }

    public void setPathLog(String pathLog){
        this.pathLog = pathLog;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}