package projetosBasicos.contasBanco.entities;

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

    @Override
    public void saque(double valor) {
        super.saque(valor); // O super aqui serve para chamar o método saque da classe mãe (Conta), que já desconta o valor do saque e a taxa de saque de 5.0. Depois disso, fazemos o desconto da taxa adicional de saque para conta Pro.
        saldo -= 2.0; //Taxa adicional de saque para conta Pro
    }

}