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

    @Override //Isso serve para avisar o compilador que estamos Sobrescrevendo um metodo. --> Se não existisse o método saque, o compilador iria avisar que estamos tentando sobrescrever um método que não existe.
    public void saque(double valor) {
        saldo -= valor; //Sem taxa de saque  para conta poupança
    }
}
