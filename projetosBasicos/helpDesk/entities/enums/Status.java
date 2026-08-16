package projetosBasicos.helpDesk.entities.enums;

public enum Status {
    NOVO(1),
    ANDAMENTO(2),
    PENDENTE(3),
    RESOLVIDO(4),
    FECHADO(5),
    CANCELADO(6);

    public final int valor;

    Status(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public static Status fromValor(int valor){
        for(Status stat : Status.values()){
            if(stat.valor == valor){
                return stat;
            }
        }
        return null;
    }
}
