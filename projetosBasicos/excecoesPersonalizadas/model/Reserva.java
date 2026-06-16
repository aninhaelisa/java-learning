package projetosBasicos.excecoesPersonalizadas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return diff / (1000 * 60 * 60 * 24);
    }

    public String atualizarDatas(Date checkIn, Date checkOut) {
        Date hoje = new Date();
            if (checkIn.before(hoje) || checkOut.before(hoje)) {
                return "Erro na reserva: As datas para atualização devem ser futuras.";
            } 
            if (!checkOut.after(checkIn)) {
                return "Erro na reserva: A data de check-out deve ser posterior à data de check-in.";
            } 
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "Quarto "
            + numeroQuarto
            + ", check-in: "
            + sdf.format(checkIn)
            + ", check-out: "
            + sdf.format(checkOut)
            + ", "
            + duracao()
            + " noites";
    }
}
