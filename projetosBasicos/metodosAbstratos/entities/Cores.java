package projetosBasicos.metodosAbstratos.entities;

public enum Cores {
    RESET("\u001B[0m"),
    ROSA("\u001B[1m\u001B[35m"),
    BRANCO("\u001B[1m\u001B[37m"),
    VERMELHO("\u001B[1m\u001B[31m"),
    AZUL("\u001B[1m\u001B[34m"),
    AMARELO("\u001B[1m\u001B[33m");

    private String codigo;

    Cores(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String aplicar(String texto) {
        return codigo + texto + RESET.codigo;
    }
}
