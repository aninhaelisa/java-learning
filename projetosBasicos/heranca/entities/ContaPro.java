package projetosBasicos.heranca.entities;

public class  ContaPro extends Conta{
    private Double limite;

    public ContaPro(){
        super();
    }

    public ContaPro(String titular, Double saldo, Integer numero, Double limite) {
        super(titular, saldo, numero);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void emprestimo(double valor){
        if(valor <= limite){
            saldo += valor - 10.0;
        }

    }

}