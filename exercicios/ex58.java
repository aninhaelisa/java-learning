package exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ex58 {
    public static void main(String[] args) {
        List<Integer> numRandom = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int nr = r.nextInt(1, 10);
            numRandom.add(nr);
        }

        System.out.println("EXERCICIO 58 - PRATICANDO STREAMS");
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<String> nomes = List.of("Ana", "Ana", "Bob", "Carlos", "Diana", "Amelia", "Amanda", "Valdir", "Mikael", "Kaique", "João");
        List<String> arquivo = List.of("arquivo1.txt", "arquivo2.png", "arquivo3.pdf", "arquivo4.csv", "arquivo5.pdf", "arquivo6.docx", "arquivo7.pdf", "arquivo8.txt", "arquivo9.png", "arquivo10.csv");

        System.out.println("FILTER: ");
        nums.stream().filter(n -> n > 2).forEach(System.out::print); 
        System.out.println();
        nums.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println("Par: " + n));
        nums.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println("Ímpar: " + n));
        nums.stream().filter(n -> n > 3).forEach(n -> System.out.println("Maior que 3: " + n));
        nums.stream().filter(n -> n < 3).forEach(n -> System.out.println("Menor que 3: " + n));
        List<Integer> numsListStream = nums.stream().filter(n -> n > 1).toList();
        System.out.println("Lista filtrada (n > 1): " + numsListStream);
       
        System.out.println();
        nomes.stream().filter(nome -> nome.startsWith("A")).forEach(nome -> System.out.println("Começa com A: " + nome + " " ));
        System.out.println();
        nomes.stream().filter(nome -> nome.endsWith("s")).forEach(nome -> System.out.println("Termina com S: "+ nome + " "));
        System.out.println();
        nomes.stream().filter(nome -> nome.length() > 5).forEach(nome -> System.out.println("Mais de 5 letras: "+ nome + " "));
        System.out.println();

        arquivo.stream().filter(arq -> arq.endsWith(".pdf")).forEach(arq -> System.out.println("Arquivos PDF: " + arq + " "));
        System.out.println();
       
        System.out.println("MAP: ");
        nums.stream().map(n -> n * 10).toList().forEach(n -> System.out.println(n));
        List<Integer> numsListStreamMap = nums.stream().map(n -> n * 10).toList();
        System.out.println("Lista mapeada (n * 10): " + numsListStreamMap);
        List<String> nomeUpper = nomes.stream().map(nome -> nome.toUpperCase()).toList();
        System.out.println("Lista de nomes em maiúsculo: " + nomeUpper);
        List<String> nomeLower = nomes.stream().map(nome -> nome.toLowerCase()).toList();
        System.out.println("Lista de nomes em minúsculo: " + nomeLower);
        List<Integer> nomesTamanho = nomes.stream().map(nome -> nome.length()).toList();
        System.out.println("Lista de tamanhos dos nomes: " + nomesTamanho);

        System.out.println();
        System.out.println("Sorted(): ");
        System.out.println("Lista normal: " + numRandom);
        List<Integer> numsSorted = nums.stream().sorted().toList();
        System.out.println("Lista ordenada: " + numsSorted);
        List<Integer> tamanhoNomesOrdenados= nomesTamanho.stream().sorted().toList();
        System.out.println("Lista de tamanhos dos nomes ordenada: " + tamanhoNomesOrdenados);
        List<Integer> tamanhoNomesOrdRevers = nomesTamanho.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Lista de tamanhos dos nomes ordenada reversa: " + tamanhoNomesOrdRevers);
        List<String> nomesOrdenados = nomes.stream().sorted().toList();
        System.out.println("Lista de nomes ordenada: " + nomesOrdenados);
        List<String> nomesOrdRevers = nomes.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Lista de nomes ordenada reversa: " + nomesOrdRevers);

        System.out.println();
        System.out.println("Distinct(): ");
        System.out.println("Lista normal: " + numRandom);
        List<Integer> numsDistinct = numRandom.stream().distinct().toList();
        System.out.println("Lista de números distintos: " + numsDistinct);
        List<String> nomesDistinct = nomes.stream().distinct().toList();
        System.out.println("Lista de nomes distintos: " + nomesDistinct);

        System.out.println();
        System.out.println("Limit(): ");
        System.out.println("Lista normal: " + numRandom);
        List<Integer> numLimit = numRandom.stream().limit(3).toList();
        System.out.println("Lista "+ numLimit);
        // List<Integer> numLimit
    }
}

