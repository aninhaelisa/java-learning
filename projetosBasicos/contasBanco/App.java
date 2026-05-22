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

        //-------------------------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("TESTES DE SAQUE:");
        Conta conta6 = new Conta("Ana", 800.0, 11223);
        conta6.saque(200.00);
        System.out.println("Conta6: " + conta6); //desconta 200 + 5 de taxa de saque

        ContaPopanca conta7 = new ContaPopanca("Pedro", 500.0, 33445, 0.03);
        conta7.saque(100.00);
        System.out.println("Conta7: " + conta7);

        Conta conta8 = new ContaPro("Lucas", 1000.0, 55667, 400.0);
        conta8.saque(300.00); 
        System.out.println("Conta8: " + conta8); //desconta 300 + 5 de taxa de saque + 2 de taxa adicional para conta Pro
    
    
        System.out.println();
        System.out.println("Introdução a Polimorfismo");
        Conta x = new Conta("Mariana", 200.0, 99999);
        Conta y = new ContaPopanca("Henrique", 200.0, 88888, 0.02);
        x.saque(50.0);
        y.saque(50.0);
        System.out.println("X: " + x.getSaldo());
        System.out.println("Y: " + y.getSaldo());

    }
}
