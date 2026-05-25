package projetosBasicos.cadastroProduto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.cadastroProduto.entities.Produto;
import projetosBasicos.cadastroProduto.entities.ProdutoImportado;
import projetosBasicos.cadastroProduto.entities.ProdutoUsado;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFabricacao = LocalDate.now();

        List<Produto> ProdutosNovos = new ArrayList<>();
        List<Produto> ProdutosUsados = new ArrayList<>();
        List<Produto> ProdutosImportado = new ArrayList<>();

        int op = 0;
        double somaN = 0;
        double somaU = 0;
        double somaI = 0;
        do{
            System.out.println("Qual o tipo do produto: ");
            System.out.println("1 - Produto comum");
            System.out.println("2 - Produto usado");
            System.out.println("3 - Produto importado");
            System.out.println("0 - Sair");
            System.out.print("> ");
            op = sc.nextInt();

            if(op == 0){
                break;
            }

            System.out.print("Quantos produtos deseja cadastrar? ");
            int quantidade = sc.nextInt();
    
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Produto comum:");
                    for(int i =0; i<quantidade; i++){
                        System.out.println("Produto #" + (i+1) + ":");
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Preço: ");
                        double precoN = sc.nextDouble();
                        sc.nextLine();
    
                        Produto produto = new Produto(nome, precoN);
                        ProdutosNovos.add(produto);

                        somaN += precoN;
                    }

                    System.out.println("-----------ETIQUETAS DE PREÇO-----------");
                    for(Produto p : ProdutosNovos){
                        System.out.println(p.etiquetaPreco());
                    }
                    System.out.println("Valor total dos produtos: R$ " + String.format("%.2f", somaN));
                    System.out.println("-----------------------------------------");

                    break;

                case 2:
                    System.out.println("Produto usado:");
                    for(int i = 0; i < quantidade; i++){
                        System.out.println("Produto Usado#" + (i+1) + ":");
                        System.out.print("Nome: ");
                        String nomeUsado = sc.nextLine();
                        System.out.print("Preço: ");
                        double precoU = sc.nextDouble();
                        System.out.println("Data de fabricação (DD/MM/YYYY): ");
                        String data = sc.next();
                        sc.nextLine();
                        dataFabricacao = LocalDate.parse(data, fmt);

                        ProdutoUsado produtoUsado = new ProdutoUsado(nomeUsado, precoU, dataFabricacao);
                        ProdutosUsados.add(produtoUsado);

                        somaU += precoU;
                    }

                    System.out.println("-----------ETIQUETAS DE PREÇO-----------");
                    for(Produto p : ProdutosUsados){
                        System.out.println(p.etiquetaPreco() + " (Data de fabricação: " + dataFabricacao.format(fmt) + ")");
                    }
                    System.out.println("Valor total dos produtos: R$ " + String.format("%.2f", somaU));
                    System.out.println("-----------------------------------------");
                    break;

                case 3:
                    System.out.println("Produto importado:");
                    for(int i = 0; i < quantidade; i++){
                        System.out.println("Produto Importado#" + (i+1) + ":");
                        System.out.print("Nome: ");
                        String nomeImportado = sc.nextLine();
                        System.out.print("Preço: ");
                        double precoI = sc.nextDouble();
                        System.out.print("Taxa de importação: ");
                        double taxa = sc.nextDouble();
                        sc.nextLine();
                        ProdutoImportado produtoImportado = new ProdutoImportado(nomeImportado, precoI, taxa);
                        ProdutosImportado.add(produtoImportado);

                        somaI += precoI + taxa;
                    }

                    System.out.println("-----------ETIQUETAS DE PREÇO-----------");
                    for(Produto p : ProdutosImportado){
                       System.out.println( p.etiquetaPreco());
                    }
                    System.out.println("Valor total dos produtos: R$ " + String.format("%.2f", somaI));
                    System.out.println("-----------------------------------------");
                    break;
                default:
                    break;
            }



            System.out.println("Deseja cadastrar outro produto? (1 - Sim / 0 - Não)");
            System.out.print("> ");
            op = sc.nextInt();

        }while(op == 1);
        System.out.println("PROGRAMA ENCERRADO! OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS!");

        sc.close();
    }
}
