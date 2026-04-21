package projetosBasicos.funcionarios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projetosBasicos.funcionarios.entities.Funcionarios;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----".repeat(10) + "SALÁRIO DO FUNCIONÁRIO" + "----".repeat(10));
        System.out.println("1 - Cadastrar/Remover funcionario");
        System.out.println("2 - Aumentar/Diminuir salário");
        System.out.println("3 - Procurar um funcionário");
        System.out.print("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();

        Funcionarios funcionario = new Funcionarios();
        switch (op) {
            case 1:
                System.out.println("Deseja cadastrar um novo funcionário ou remover um existente? (C/R)");
                String c_r = sc.nextLine();
                if (c_r.equalsIgnoreCase("c")) {

                    System.out.println("VOCÊ ESCOLHEU CADASTRAR UM FUNCIONÁRIO");
                    System.out.print("Nome: ");
                    funcionario.nome = sc.nextLine();
                    System.out.print("Cargo: ");
                    funcionario.cargo = sc.nextLine();
                    System.out.print("Salário bruto: ");
                    funcionario.salarioBruto = sc.nextDouble();
                    System.out.print("Imposto: ");
                    funcionario.imposto = sc.nextDouble();

                    try {
                        FileWriter writer = new FileWriter("funcionarios.txt", true);
                        writer.write(
                                "NOME: " + funcionario.nome + " - CARGO: " + funcionario.cargo + " - SALÁRIO BRUTO: R$"
                                        + funcionario.salarioBruto + " - IMPOSTO: R$" + funcionario.imposto + "\n");
                        writer.close();
                    } catch (IOException e1) {
                        System.out.println("Um erro aconteceu ao tentar criar o arquivo -> " + e1.getMessage());
                    }
                } else if (c_r.equalsIgnoreCase("r")) {
                    System.out.println("VOCÊ ESCOLHEU REMOVER UM FUNCIONÁRIO");

                    try {
                        File funcionarioFile = new File("funcionarios.txt");
                        Scanner fileScanner = new Scanner(funcionarioFile);

                        List<String> linhas = new ArrayList<>();

                        System.out.print("nome:");
                        String nomeRemoverBusca = sc.nextLine();

                        while (fileScanner.hasNextLine()) {
                            String linha = fileScanner.nextLine();

                            if (!linha.toLowerCase().contains(nomeRemoverBusca.toLowerCase())) {
                                linhas.add(linha);

                            }
                        }
                        fileScanner.close();

                        Path path = Paths.get("funcionarios.txt");
                        Files.write(path, linhas, StandardCharsets.UTF_8);
                        System.out.println("Funcionário removido com sucesso!");

                    } catch (IOException e2) {
                        System.out.println("Um erro aconteceu ao tentar ler o arquivo -> " + e2.getMessage());
                    }

                } else {
                    System.out.println(":D ERRO D:");
                }

                break;

            case 2:
                System.out.println("VOCÊ ESCOLHEU AUMENTAR/REDUZIR O SALÁRIO DE UM FUNCIONÁRIO");
                System.out.println("Digite o nome do funcionário:");
                String nomeBusca = sc.nextLine();

                try {
                    File funcionarioFile = new File("funcionarios.txt");
                    Scanner fileScanner = new Scanner(funcionarioFile);

                    List<String> linhas = new ArrayList<>();

                    while (fileScanner.hasNextLine()) {
                        String linha = fileScanner.nextLine();

                        if (linha.toLowerCase().contains(nomeBusca.toLowerCase())) {
                            System.out.println("Funcionário encontrado: " + linha);
                            System.out.println("Deseja aumentar ou reduzir o salário? (A/R)");
                            String opcao = sc.nextLine();

                            String[] partes = linha.split(" - ");

                            String nomeParte = partes[0];
                            String cargoParte = partes[1];
                            String salarioParte = partes[2];
                            String impostoParte = partes[3];

                            double salarioAtual = Double.parseDouble(
                                    salarioParte.replace("SALÁRIO BRUTO: R$", ""));

                            if (opcao.equalsIgnoreCase("a")) {
                                System.out.print("Digite o valor a ser aumentado: ");
                                double valorAumento = sc.nextDouble();
                                sc.nextLine();
                                salarioAtual += valorAumento;
                            } else if (opcao.equalsIgnoreCase("r")) {
                                System.out.print("Digite o valor a ser reduzido: ");
                                double valorReducao = sc.nextDouble();
                                sc.nextLine();
                                salarioAtual -= valorReducao;
                            }

                            linha = nomeParte + " - " + cargoParte +
                                    " - SALÁRIO BRUTO: R$" + salarioAtual +
                                    " - " + impostoParte;

                            System.out.println("Salário atualizado!");
                        }

                        linhas.add(linha);
                    }

                    fileScanner.close();

                    Path path = Paths.get("funcionarios.txt");
                    Files.write(path, linhas, StandardCharsets.UTF_8);

                } catch (IOException e3) {
                    System.out.println("Um erro aconteceu ao tentar ler o arquivo -> " + e3.getMessage());
                }

                break;
            case 3:
                System.out.println("VOCÊ ESCOLHEU PROCURAR UM FUNCIONÁRIO");
                System.out.print("Digite o nome do funcionário: ");
                String nomeBusca3 = sc.nextLine();

                try {
                    File funcionarioFile = new File("funcionarios.txt");
                    Scanner fileScanner = new Scanner(funcionarioFile);

                    boolean encontrado = false;

                    while (fileScanner.hasNextLine()) {
                        String linha = fileScanner.nextLine();

                        if (linha.toLowerCase().contains(nomeBusca3.toLowerCase())) {
                            System.out.println("Funcionário encontrado:");
                            System.out.println(linha);
                            encontrado = true;
                        }
                    }

                    fileScanner.close();

                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }

                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo -> " + e.getMessage());
                }

                break;
            default:
                break;
        }

        sc.close();
    }
}
