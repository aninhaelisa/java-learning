package projetosBasicos.heranca.entities;

public class Conta{
    private String titular;
    protected Double saldo;
    private Integer numero;

    public Conta(){
    }
    
    public Conta(String titular, Double saldo, Integer numero){
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public String toString(){
        return "Conta: "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }

}