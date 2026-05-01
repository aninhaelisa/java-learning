package projetosBasicos.encapsulamento.entities;

public class Pessoa {
    public String nomePublico = "Ana";
    private String nomePrivado = "Segredo";

    public void mostrar() {
        System.out.println(nomePublico);  // ✔ funciona
        System.out.println(nomePrivado); // ✔ funciona (mesma classe)
    }

    
}
