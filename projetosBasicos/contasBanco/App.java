package projetosBasicos.contasBanco;

import projetosBasicos.contasBanco.entities.Conta;
import projetosBasicos.contasBanco.entities.ContaPopanca;
import projetosBasicos.contasBanco.entities.ContaPro;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta("João", 1000.0, 12345);
        ContaPro contapro = new ContaPro("Maria", 2000.0, 54321, 500.0);
        System.out.println(conta + "\n" + contapro);

        //UPCASTING
        System.out.print("\nUPCASTING: \n");
        Conta conta1 = contapro; // Uma contaPro é uma Conta, por isso não da erro ao fazer Upcasting -- Herança é uma relação de "é um".
        System.out.println(conta1);

        Conta conta2 = new ContaPro("Carlos", 1500.0, 67890, 300.0); 
        System.out.println(conta2);

        Conta conta3 = new ContaPopanca("Luiza", 1200.0, 98765, 0.05); 
        System.out.println(conta3);

        //DOWNCASTING
        System.out.print("\nDOWNCASTING: \n");
        ContaPro conta4 = (ContaPro) conta2; //Devo fazer casting manual para evitar erro, pois Conta2 é do Tipo Conta e não podemos garantir que ela seja do tipo ContaPro, por isso o casting é necessário.
        System.out.println(conta4);
        conta4.saque(1000.00);

       // --> ContaPro conta5 = (ContaPro) conta3; //conta3 foi instanciada como ContaPopança, por isso não é possível fazer o downcasting para ContaPro, pois não é do tipo ContaPro, e sim do tipo ContaPopança. Isso gera um erro de ClassCastException em tempo de execução.
      // -->  System.out.println(conta5);
        if(conta3 instanceof ContaPro){ //Verificando se conta3 é do tipo ContaPro antes de fazer o downcasting, para evitar o erro de ClassCastException.
            ContaPro conta5 = (ContaPro) conta3;
            System.out.println("conta5 "+conta5);
        }
        if(conta3 instanceof ContaPopanca){ //Verificando se conta3 é do tipo ContaPopanca antes de fazer o downcasting, para evitar o erro de ClassCastException.
            ContaPopanca conta5 = (ContaPopanca) conta3;
            conta5.atualizarSaldo();
            System.out.println("Saldo atualizado: " + conta5);
        }
        
    }
}
