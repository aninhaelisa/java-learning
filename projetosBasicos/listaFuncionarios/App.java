package projetosBasicos.listaFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // ID COM NUMERAÇÃO ALEATORIA
        int op = 0;

        List<Double> salarios = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<String> cargos = new ArrayList<>();
        List<Integer> id = new ArrayList<>();

        do {
            System.out.println("----SITEMA DE CADASTRO DE FUNCIONARIOS----");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Listar Funcionarios");
            System.out.println("3 - Remover Funcionario");
            System.out.println("4 - Alterar cadastro de Funcionario");
            System.out.println("5 - Buscar Funcionario por ID");
            System.out.println("6 - Listar Funcionarios por ordem alfabetica");
            System.out.println("0 - Sair");
            System.out.print("> ");
            op = sc.nextInt();
            System.out.println();
            System.out.println("......".repeat(10));
            switch (op) {
                case 1:
                    System.out.println("----CADASTRO DE FUNCIONARIO----");
                    System.out.print("Quantos funcionarios deseja cadastrar? ");
                    int quant = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < quant; i++) {
                        System.out.println("Funcionario N° " + (i + 1));
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        nomes.add(nome);
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        cargos.add(cargo);
                        System.out.print("Salario: ");
                        double salario = sc.nextDouble();
                        salarios.add(salario);
                        System.out.print("Identificador do Funcionario: ");
                        int ident = random.nextInt(500);
                        id.add(ident);
                        System.out.println(ident);
                        sc.nextLine();
                    }
                    System.out.println("Funcionarios cadastrados com sucesso!");
                    break;
                case 2:
                    System.out.println("----LISTA DE FUNCIONARIOS----");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("Funcionario N° " + (i + 1) + " - ID: " + id.get(i));
                        System.out.println("Nome: " + nomes.get(i));
                        System.out.println("Cargo: " + cargos.get(i));
                        System.out.println("Salario: " + salarios.get(i));
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("----REMOVER FUNCIONARIO----");
                    System.out.print("Qual o numero do funcionario que deseja remover? ");
                    int nRmv = sc.nextInt() - 1;
                    if (nomes.isEmpty()) {
                        System.out.println(
                                "Não há funcionarios cadastrados, por favor cadastre um funcionario primeiro.");
                        break;
                    }
                    if (nRmv >= 0 && nRmv < nomes.size()) {
                        System.out.println("Funcionario " + nomes.get(nRmv) + " removido com sucesso!");
                        nomes.remove(nRmv);
                        cargos.remove(nRmv);
                        salarios.remove(nRmv);
                        id.remove(nRmv);
                    } else {
                        System.out.println("Funcionario não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("----ALTERAR CADASTRO DE FUNCIONARIO----");
                    System.out.print("Qual o numero do funcionario que deseja alterar? ");
                    if (nomes.isEmpty()) {
                        System.out.println(
                                "Não há funcionarios cadastrados, por favor cadastre um funcionario primeiro.");
                        break;
                    } else {
                        int nAlt = sc.nextInt() - 1;
                        if (nAlt >= 0 && nAlt < nomes.size()) {
                            System.out.println("Funcionario " + nomes.get(nAlt) + " encontrado!");
                            System.out.print("Novo nome: ");
                            sc.nextLine();
                            String nome = sc.nextLine();
                            nomes.set(nAlt, nome);
                            System.out.print("Novo cargo: ");
                            String cargo = sc.nextLine();
                            cargos.set(nAlt, cargo);
                            System.out.print("Novo salario: ");
                            double salario = sc.nextDouble();
                            salarios.set(nAlt, salario);
                            System.out
                                    .println("Cadastro do funcionario " + nomes.get(nAlt) + " atualizado com sucesso!");
                        } else {
                            System.out.println("Funcionario não encontrado!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("----BUSCAR FUNCIONARIO POR ID----");
                    System.out.print("Qual o ID do funcionario que deseja buscar? ");
                    int nId = sc.nextInt();
                    if (id.isEmpty()) {
                        System.out.println(
                                "Não há funcionarios cadastrados, por favor cadastre um funcionario primeiro.");
                        break;
                    } else {
                        int indexId = id.indexOf(nId);
                        if (indexId != -1) {
                            System.out.println("Funcionario " + nomes.get(indexId) + " encontrado!");
                            System.out.println("ID: " + id.get(indexId));
                            System.out.println("Nome: " + nomes.get(indexId));
                            System.out.println("Cargo: " + cargos.get(indexId));
                            System.out.println("Salario: " + salarios.get(indexId));
                        } else {
                            System.out.println("Funcionario não encontrado!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("----LISTAR FUNCIONARIOS POR ORDEM ALFABETICA----");
                    List<String> nomesOrdenados = new ArrayList<>(nomes);
                    nomesOrdenados.sort(String::compareToIgnoreCase);
                    for (String nome : nomesOrdenados) {
                        int index = nomes.indexOf(nome);
                        System.out.println("Funcionario N° " + (index + 1) + " - ID: " + id.get(index));
                        System.out.println("Nome: " + nomes.get(index));
                        System.out.println("Cargo: " + cargos.get(index));
                        System.out.println("Salario: " + salarios.get(index));
                        System.out.println();
                    }
                case 0: 
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (op != 0);

        System.out.println("SITEMA ENCERRADOO :D");
        sc.close();
    }
}
