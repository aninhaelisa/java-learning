package projetosBasicos.funcionarios02.entities;

public class Terceirizado extends Funcionario{
    private Double despesaAdicional;

    public Terceirizado() {
        super();
    }

    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }
    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    public String toString(){
        return super.toString() + " - " + "DESPESA ADICIONAL: " + despesaAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
