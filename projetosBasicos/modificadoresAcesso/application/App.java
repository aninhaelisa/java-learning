package projetosBasicos.modificadoresAcesso.application;

import projetosBasicos.encapsulamento.entities.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        System.out.println(p.nomePublico);  //  funciona

        // System.out.println(p.nomePrivado); //  erro (private)
        
        p.mostrar(); // ✔ acessa o privado indiretamente
    
    }
}
