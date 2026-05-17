package projetosBasicos.stringBuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    /*@Override
    public String toString() {
        return String.format(
                "---- POST ----%n"
                + "Momento: %s%n"
                + "Título: %s%n"
                + "Conteúdo: %s%n"
                + "Likes: %d%n"
                + "Comentários:%n%s",
                sdf.format(momento),
                titulo,
                conteudo,
                likes,
                comentarios.isEmpty() ? "Nenhum comentário" : String.join("\n", comentarios.stream().map(Comentario::toString).toArray(String[]::new))
        );
    }*/ // Ocupa mais memoria que o StringBuilder, e é mais verboso

    public String toString(){ // StringBuilder é mais eficiente para concatenar strings, pois evita a criação de objetos intermediários, ao contrário do operador + que cria um novo objeto String a cada concatenação.
        StringBuilder sb = new StringBuilder();
        sb.append("---- POST ----\n");
        sb.append(likes);
        sb.append("Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for(Comentario c: comentarios){
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();
    }

    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }
}
