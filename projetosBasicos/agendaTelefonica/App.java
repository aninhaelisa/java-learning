package projetosBasicos.agendaTelefonica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "txt\\agendaTelefonica.csv";
        int op = -1;
        List<String> listaCompleta = new ArrayList<>();

        try {

            while (op != 0) {

                System.out.println();
                System.out.println("------ Lista telefonica ------");
                System.out.println("1 - Cadastrar Contato  |  2 - Listar Contatos");
                System.out.println("3 - Remover Contato    |  0 - SAIR");
                op = sc.nextInt();

                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Cadastro de Contato");
                        System.out.print("NOME: ");
                        String nome = sc.nextLine();
                        System.out.print("TELEFONE: ");
                        String telefone = sc.next();

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                            bw.write(nome + ";" + telefone);
                            bw.write("\n");
                            bw.close();
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        System.out.println("CADASTRADO COM SUCESSO!");
                        break;

                    case 2:
                        System.out.println("Lista de Contatos");
                        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                System.out.println(line);
                            }
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("Remover nome");
                        System.out.print("NOME: ");
                        String nomeRemover = sc.nextLine();
                    
                        listaCompleta = Files.readAllLines(Paths.get(path));
                    
                        listaCompleta.removeIf(linha -> linha.split(";")[0].equalsIgnoreCase(nomeRemover));
                    
                        Files.write(Paths.get(path), listaCompleta);
                    
                        System.out.println("NOME REMOVIDO");
                        break;

                    case 0:
                        System.out.println("PROGRAMA ENCERRADO");
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
