package projetosBasicos.composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private Nivel nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<HorasContrato> contratos = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String nome, Nivel nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public Nivel getNivel() {
        return this.nivel;
    }

    public Nivel setNivel(Nivel nivel) {
        return this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public Double setSalarioBase(Double salarioBase) {
        return this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public Departamento setDepartamento(Departamento departamento) {
        return this.departamento = departamento;
    }

    public List<HorasContrato> getContratos() {
        return this.contratos;
    }

    @Override
    public String toString() {
        return "Funcionario{ " + "Nome: " + nome + " - Nivel: " + nivel + " - Salario Base: " + salarioBase
                + "- Departamento: " + departamento + " - Contratos: " + contratos + " }";
    }

    public void addContrato(HorasContrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(HorasContrato contrato) {
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes){
        Calendar cal = Calendar.getInstance();
        double soma = salarioBase;
     
        for(HorasContrato c : contratos){
            cal.setTime(c.getData());
            int c_ano= cal.get(Calendar.YEAR);
            int c_mes= cal.get(Calendar.MONTH) + 1;
            if(ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
