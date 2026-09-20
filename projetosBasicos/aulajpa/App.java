package projetosBasicos.aulajpa;

import projetosBasicos.aulajpa.dominio.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Ana Elisa", "elisaana.2019.20066@gmail.com");
        Pessoa p2 = new Pessoa(2, "Amanda Eloisa", "eloisa@gmail.com");
        Pessoa p3 = new Pessoa(3, "Sandriele Almeida", "sandrielealmeida@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
