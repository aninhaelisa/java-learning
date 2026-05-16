package projetosBasicos.composicao.entities;

import java.util.Date;

public class HorasContrato {
    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public HorasContrato(){
    }

    public HorasContrato(Date data, Double valorPorHora, Integer horas){
        this.data=data;
        this.valorPorHora=valorPorHora;
        this.horas=horas;
    }

    public Date getData(){
        return this.data;
    }

    public Date setData(Date data){
        return this.data=data;
    }

    public Double getValorPorHora(){
        return this.valorPorHora;
    }

    public Double setValorPorHora(Double valorPorHora){
        return this.valorPorHora=valorPorHora;
    }

    public Integer getHoras(){
        return this.horas;
    }

    public Integer setHoras(Integer horas){
        return this.horas=horas;
    }

    @Override
    public String toString(){
        return "HorasContrato{ " +"Data: " + data + " - Valor Por Horas: " + valorPorHora + " - Horas: " + horas + " }";
    }

    public Double valorTotal(){
        return valorPorHora * horas;
    }
}
