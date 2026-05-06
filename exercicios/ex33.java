package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 32 - LISTA");
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        List<String> listaCompras = new ArrayList<>(); // criação da lista fora de qualquer tipo de bloco.

        do {
            System.out.println("1 - O que é uma lista? ");
            System.out.println("2 - Criar Lista de compra");
            System.out.println("3 - Alterar elemento da lista");
            System.out.println("4 - Adcionar elemento na lista");
            System.out.println("5 - Remover elemento da lista");
            System.out.println("6 - Exibir lista de compras");
            System.out.println("0 - Sair");
            System.out.println();

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("1 - Em uma lista armazenamos apenas dados do mesmo tipo -> HOMOGÊNEA");
                    System.out.println("2 - Os elementos são acessados por posicoes -> ORDENADA");
                    System.out.println("3 - Inicia vazia, e seus elementos são alocados sob demanda");
                    System.out.println("4 - Cada elemento ocupa um 'nó' (nodo) da lista - Apenas se nao");
                    System.out.println();
                    System.out.println("VANTAGENS: ");
                    System.out.println(
                            "+ Tamanho é dinâmico, ou seja, não é necessário definir um tamanho máximo para a lista");
                    System.out.println(
                            "+ Inserção e remoção de elementos são mais eficientes, pois não é necessário deslocar os elementos para manter a ordem");
                    System.out.println("DESVANTAGENS: ");
                    System.out.println(
                            "- Acesso sequencial dos elementos, ou seja, para acessar um elemento específico, é necessário percorrer a lista desde o início");
                    System.out.println(
                            "- Maior consumo de memória devido ao armazenamento de referências adicionais para os nós da lista *");
                    System.out.println();
                    System.out.println("* Porém, depende da implementação da lista, como por exemplo:");
                    System.out.println(
                            "ARRAYLIST é uma implementação otimizada de List, que é como uma mistura de vetor com Lista.");
                    System.out.println();
                    System.out.println("Iniciar uma lista é simples: ");
                    System.out.println("> List<String> minhaLista = new ArrayList<>();");
                    System.out.println(
                            "Importante lembrar que listas NÃO aceitam tipos primitivos. ex: int, double, char, boolean, etc. Para isso, utilizamos as classes wrapper: Integer, Double, Character, Boolean, etc.");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("--------------------CRIAR LISTA DE COMPRAS--------------------");
                    System.out.println("Quantos produtos vc deseja adicionar na lista? ");
                    int q = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < q; i++) {
                        System.out.print((i + 1) + "°: ");
                        String p = sc.nextLine();
                        listaCompras.add(p);
                    }
                    System.out.println("Lista de compras: ");
                    for (String produto : listaCompras) {
                        System.out.println("- " + produto);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("--------------------ALTERAR ELEMENTOS DA LISTA--------------------");
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista de compras está vazia. Por favor, crie uma lista primeiro.");
                        break;
                    } else {
                        System.out.print("Qual item da lista vc deseja alterar? ");
                        int nItem = sc.nextInt() - 1;
                        if (nItem >= 0 && nItem < listaCompras.size()) {
                            System.out.println("O item que você deseja alterar é: " + listaCompras.get(nItem));
                            System.out.print("Qual o nome do novo produto? ");
                            sc.nextLine();
                            String novoProduto = sc.nextLine();
                            listaCompras.set(nItem, novoProduto);
                            System.out.println("Lista de compras atualizada:");
                            for (String produto : listaCompras) {
                                System.out.println("- " + produto);
                            }
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("--------------------ADICIONAR ELEMENTOS NA LISTA--------------------");

                    System.out.print("Qual produto vc deseja adcionar? ");
                    sc.nextLine();
                    String novoProduto = sc.nextLine();
                    listaCompras.add(novoProduto);
                    System.out.println("Lista de compras atualizada: ");
                    for (String produto : listaCompras) {
                        System.out.println("- " + produto);
                    }

                    break;

                case 5:
                    System.out.println("--------------------REMOVER ELEMENTOS DA LISTA--------------------");
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista está vazia, por favor crie uma lista primeiro.");
                        break;
                    } else {
                        System.out.print("Qual item você deseja remover? ");
                        int itemRemover = sc.nextInt() - 1;
                        if (itemRemover >= 0 && itemRemover > listaCompras.size()) {
                            System.out.println("O item que você deseja remover não existe na lista.");
                        } else {
                            listaCompras.remove(itemRemover);
                            System.out.println("item removido com sucesso :D");
                        }
                    }
                    break;
                case 6: 
                    System.out.println("--------------------EXIBIR LISTA DE COMPRAS--------------------");
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista de compras está vazia. Por favor, crie uma lista primeiro.");
                    } else {
                        System.out.println("Lista de compras: ");
                        for (String produto : listaCompras) {
                            System.out.println("- " + produto);
                        }
                    }
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
        sc.close();

        System.out.println(" Programa encerrado :D ");
    }
}
