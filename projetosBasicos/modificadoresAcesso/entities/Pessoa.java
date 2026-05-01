package projetosBasicos.modificadoresAcesso.entities;

public class Pessoa {
    public String nomePublico;
    protected String nomeProtegido;
    String nomeDefault; // sem modificador
    private String nomePrivado;

    public Pessoa() {
        nomePublico = "Publico";
        nomeProtegido = "Protegido";
        nomeDefault = "Default";
        nomePrivado = "Privado";
    }

    public void mostrarDentroDaClasse() {
        System.out.println(nomePublico);
        System.out.println(nomeProtegido);
        System.out.println(nomeDefault);
        System.out.println(nomePrivado);
    }
}
