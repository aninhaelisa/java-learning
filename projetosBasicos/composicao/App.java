package projetosBasicos.composicao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.composicao.entities.Funcionario;
import projetosBasicos.composicao.entities.HorasContrato;
import projetosBasicos.composicao.entities.Nivel;
import projetosBasicos.composicao.entities.Departamento;

public class App {
    public static void main(String[] args) throws ParseException {
        System.out.println();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nome do Departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Nivel (JUNIOR/PLENO/SENIOR): ");
        String nivelFuncionario = sc.nextLine();
        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nomeFuncionario, Nivel.valueOf(nivelFuncionario), salarioBase,
                new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos para este trabalhador? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            sc.nextLine();
            Date data = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duracao (horas): ");
            int horas = sc.nextInt();
            HorasContrato contrato = new HorasContrato(data, valorPorHora, horas);
            funcionario.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com o mes e ano para calcular a renda (MM/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Renda para " + mesAno + ": "  + String.format("%.2f", funcionario.renda(ano, mes)));
        sc.close();

        System.out.println();
    }
}
