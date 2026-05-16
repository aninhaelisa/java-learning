package projetosBasicos.sobreEnum.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedidos {
    private Integer id;
    private Date momento;
    private StatusPedido status;

    public Pedidos() {
    }

    public Pedidos(Integer id, Date momento, StatusPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return "Pedidos{" +
                "id=" + id +
                ", momento=" + sdf.format(momento) +
                ", status=" + status +
                '}';
    }
}
