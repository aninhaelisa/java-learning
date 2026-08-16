package projetosBasicos.helpDesk.entities.enums;

public enum Categoria {
    INCIDENTE(1),
    REDE(2),
    IMPRESSORA(3),
    COMUNICACAO(4),
    SEGURANÇA(5),
    ACESSOS(6),
    COMPUTADOR(7),
    SOLICITACAO(8);

    private final int valor;

    Categoria(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public static Categoria fromValor(int valor){
        for(Categoria cat : Categoria.values()){
            if(cat.valor == valor){
                return cat;
            }
        }
        return null;
    }
}
