package projetosBasicos.contasBanco.entities;

public class ContaPopanca extends Conta{
    private double juros;

    public ContaPopanca(){
        super();
    }

    public ContaPopanca(String titular, Double saldo, Integer numero, double juros) {
        super(titular, saldo, numero);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }
    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void atualizarSaldo(){
        saldo += saldo * juros;
    }
}
