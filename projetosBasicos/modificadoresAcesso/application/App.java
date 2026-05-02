package projetosBasicos.modificadoresAcesso.application;

import projetosBasicos.modificadoresAcesso.entities.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        System.out.println(p.nomePublico);  //  funciona

        // System.out.println(p.nomePrivado); //  erro (private)
        
        p.mostrarDentroDaClasse(); // ✔ acessa o privado indiretamente
    
    }
}
