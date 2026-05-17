package projetosBasicos.Pedidos;

import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

import projetosBasicos.Pedidos.entities.Pedido;
import projetosBasicos.Pedidos.entities.Produto;
import projetosBasicos.Pedidos.entities.Cliente;
import projetosBasicos.Pedidos.entities.Item;
import projetosBasicos.Pedidos.entities.Status;


public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int op = -1;

        Date data = new Date();
        List<Pedido> pedidos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        do {
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Listar pedidos");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Cadastrar cliente");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Data de nascimento (dd/MM/yyyy): ");
                    String dataNascimento = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataCovertida = sdf.parse(dataNascimento);
                    Cliente cliente = new Cliente(nome, email, dataCovertida);
                    clientes.add(cliente);
                    System.out.println(cliente);

                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Fazer pedido");
                    System.out.print("Produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.print("Preço: R$");
                    Double precoProduto = sc.nextDouble();
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    System.out.println("Produto cadastrado: " + produto);
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Status do pedido: ");
                    String statusPedido = sc.next();
                    Status status = Status.valueOf(statusPedido);
                    Pedido pedido = new Pedido(data, status);
                    pedidos.add(pedido);
                    System.out.println("Pedido criado: " + pedido);
                    Item item = new Item(quantidade, precoProduto);
                    pedido.addItem(item);
                    System.out.println("Total do pedido: R$" + item.subTotal());
                    break;

                case 3:
                    System.out.println("Listar pedidos");
                    for (Pedido p : pedidos) {
                        System.out.println(p);
                    }

                    System.out.println("Dados dos Clientes: ");
                    for (Cliente c : clientes) {
                        System.out.println(c);
                    }                    
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (op != 0);

        System.out.println("> Programa encerrado <");
        sc.close();
    }
}
