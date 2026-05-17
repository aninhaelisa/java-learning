package projetosBasicos.Pedidos.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class Pedido {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private Status status;

    private List<Item> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, Status status) {
        this.momento = momento;
        this.status = status;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append("---- PEDIDO ----\n");
        sd.append("Momento: " + sdf.format(momento) + "\n");
        sd.append("Status: " + status + "\n");
        return sd.toString();
    }

    public void addItem(Item item) {
        System.out.println("Item adicionado: " + item);
        itens.add(item);
    }

    public void removeItem(Item item) {
        System.out.println("Item removido: " + item);
        itens.remove(item);
    }

    public void total() {
        Double soma = 0.0;
        
        for(Item item: itens){
            soma += item.subTotal();
        }

        System.out.println("Total do pedido: " + soma);
    }

}
