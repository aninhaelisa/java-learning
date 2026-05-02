package projetosBasicos.contaBancaria.entities;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;

    public Conta(Integer numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        contas();
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(Double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void saque(Double valor) {
        if (valor > 0 && saldo >= valor + 5.0) {
            saldo -= valor + 5.0;
        }
    }

    private void contas() {
        if (numero == 123 && titular.equals("Mariano")) {
            saldo = 1000.0;
        } else if (numero == 456 && titular.equals("Maria")) {
            saldo = 2000.0;
        } else if (numero == 789 && titular.equals("Pedro")) {
            saldo = 0.0;
        } else {
            saldo = 0.0;
            System.out.println("Conta não encontrada.");
        }
    }
}
