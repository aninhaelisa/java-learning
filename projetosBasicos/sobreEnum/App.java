package projetosBasicos.sobreEnum;
import java.util.Date;
import projetosBasicos.sobreEnum.entities.Pedidos;
import projetosBasicos.sobreEnum.entities.StatusPedido;

public class App {
    public static void main(String[] args) {
        //link: https://docs.oracle.com/cd/E17952_01/mysql-5.7-en/enum.html

        Date date = new Date();
        Pedidos p1 = new Pedidos(1080, date, StatusPedido.PENDENTE);
        System.out.println(p1);

        StatusPedido sp1 = StatusPedido.PROCESSANDO;
        StatusPedido sp2 = StatusPedido.valueOf("PROCESSANDO");
        System.out.println(sp1);
        System.out.println(sp2);


    }
    
}
