package projetosBasicos.stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import projetosBasicos.stringBuilder.entities.Comentario;
import projetosBasicos.stringBuilder.entities.Post;

public class App {
    public static void main(String[] args) throws ParseException{
        System.out.println();
        System.out.println("---- STRING BUILDER ----");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comentario1 = new Comentario("Tenha uma boa viagem!");
        Comentario comentario2 = new Comentario("Uau! Que legal!");
        Post post1 = new Post(sdf1.parse("21/06/2018 13:05:44"), "Viajar para Nova Zelândia", "Estou indo viajar para Nova Zelândia. Abraços!", 12);
  
        post1.addComentario(comentario1);
        post1.addComentario(comentario2);

        Comentario comentario3 = new Comentario("Você já conhece a cidade? Eu adoro!");
        Comentario comentario4 = new Comentario("Aproveite!");
        Post post2 = new Post(sdf1.parse("25/06/2018 07:33:26"), "Um visita a essa bela cidade", "Essa cidade é incrível", 12);
  
        post2.addComentario(comentario3);
        post2.addComentario(comentario4);

        System.out.println(post1);
        System.out.println(post2);
        System.out.println();
    }
}
