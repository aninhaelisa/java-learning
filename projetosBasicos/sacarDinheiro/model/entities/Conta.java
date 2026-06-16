package projetosBasicos.sacarDinheiro.model.entities;

import projetosBasicos.sacarDinheiro.model.exceptions.ContaException;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new ContaException("O valor do saque deve ser maior que zero");
        }
        if (valor > saldo) {
            throw new ContaException("Saldo insuficiente");
        }

        saldo -= valor;
    }
}
