package exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

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
        List<String> nomes = List.of("Ana", "Ana", "Bob", "Carlos", "Diana", "Amelia", "Amanda", "Valdir", "Mikael",
                "Kaique", "João");
        List<String> arquivo = List.of("arquivo1.txt", "arquivo2.png", "arquivo3.pdf", "arquivo4.csv", "arquivo5.pdf",
                "arquivo6.docx", "arquivo7.pdf", "arquivo8.txt", "arquivo9.png", "arquivo10.csv");

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
        nomes.stream().filter(nome -> nome.startsWith("A"))
                .forEach(nome -> System.out.println("Começa com A: " + nome + " "));
        System.out.println();
        nomes.stream().filter(nome -> nome.endsWith("s"))
                .forEach(nome -> System.out.println("Termina com S: " + nome + " "));
        System.out.println();
        nomes.stream().filter(nome -> nome.length() > 5)
                .forEach(nome -> System.out.println("Mais de 5 letras: " + nome + " "));
        System.out.println();

        arquivo.stream().filter(arq -> arq.endsWith(".pdf"))
                .forEach(arq -> System.out.println("Arquivos PDF: " + arq + " "));
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
        List<Integer> tamanhoNomesOrdenados = nomesTamanho.stream().sorted().toList();
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
        System.out.println("Lista " + numLimit);
        List<Integer> numLimitnomes = numsListStreamMap.stream().limit(5).toList();
        System.out.println("Lista de números mapeados limitados a 5: " + numLimitnomes);
        List<String> nomesLimit = nomes.stream().limit(3).toList();
        System.out.println("Lista de nomes limitados a 4: " + nomesLimit);
        List<String> nomesLimitDistin = nomesDistinct.stream().limit(3).distinct().toList();
        System.out.println("Lista de nomes distintos limitados a 3: " + nomesLimitDistin);

        System.out.println();
        System.out.println("Skip(): ");
        System.out.println("Lista normal: " + numRandom);
        List<Integer> numSkip = numRandom.stream().skip(3).toList();
        System.out.println("Lista " + numSkip);
        List<String> nomesSkip = nomes.stream().skip(3).toList();
        System.out.println("Lista de nomes pulando os 3 primeiros: " + nomesSkip);

        System.out.println();
        System.out.println("Peek(): "); // Util quando você quer inspecionar os elementos do stream sem modificar o
                                        // stream
        System.out.println("Lista normal: " + numRandom);
        List<Integer> numPeek = numRandom.stream().peek(n -> System.out.println("Número: " + n)).toList();
        System.out.println("Lista " + numPeek); // não use peek para modificar os elementos do stream, use map para
                                                // isso.
        // Peek() é útil para depuração, logging ou para realizar ações secundárias em
        // elementos do stream sem alterar o fluxo principal de dados.

        System.out.println();
        System.out.println("Count(): ");
        System.out.println("Lista normal: " + numRandom);
        long nomeContar = nomes.stream().count();
        System.out.println("Quantidade de nomes: " + nomeContar);
        long nomeContarDint = nomes.stream().distinct().count();
        System.out.println("Quantidade de nomes distintos: " + nomeContarDint);

        System.out.println();
        System.out.println("AnyMatch() AllMatch() NoneMatch(): true/false");
        System.out.println("Lista normal: " + numRandom);
        System.out.println("Anymatch: Algum número maior que 5? " + numRandom.stream().anyMatch(n -> n > 5));
        System.out.println("Allmatch: Todos os numeros são maiores que 5? " + numRandom.stream().allMatch(n -> n > 5));
        System.out.println("Nonematch: Nenhum número é maior que 5? " + numRandom.stream().noneMatch(n -> n > 5));

        System.out.println();
        System.out.println("FindFirst() FindAny(): "); // pega o primeiro elemento que existe
        System.out.println("Lista normal random: " + numRandom);
        System.out.println("Lista numeros: " + nums);
        System.out.println("FindFirst: " + numRandom.stream().findFirst());
        Optional<Integer> first = nums.stream().findFirst(); // É optional pq ele pode estar vazio. Em vez de retornar
                                                             // null, JAVA retorna um Optional, que é uma forma de lidar
                                                             // com valores que podem ou não estar presentes.
        System.out.println("FindFirst: " + first);
        Optional<Integer> any = nums.stream().findAny(); // Pega qualquer elemento do stream, não necessariamente o
                                                         // primeiro.
        System.out.println("FindAny: " + any);

        System.out.println();
        System.out.println("Max() e Min():");
        System.out.println("Lista normal random: " + numRandom);
        System.out.println("Max: " + numRandom.stream().max(Comparator.naturalOrder()));
        System.out.println("Min: " + numRandom.stream().min(Comparator.naturalOrder()));
        System.out.println("Max reverso: " + numRandom.stream().max(Comparator.reverseOrder()));
        System.out.println("Min reverso: " + numRandom.stream().min(Comparator.reverseOrder()));

        System.out.println();
        System.out.println("Reduce():");
        System.out.println("Lista normal random: " + numRandom);
        System.out.println("NUMS: " + nums);
        System.out.println("Soma RANDOM: " + numRandom.stream().reduce(0, (total, n) -> total + n));
        System.out.println("Soma NUMS: " + nums.stream().reduce(0, (total, n) -> total + n));
        Integer mult = nums.stream().reduce(1, (a,b) -> a * b);
        System.out.println("Multiplicação NUMS: " + mult);

        System.out.println();
        System.out.println("COLLECTORS: ");
        System.out.println("Lista normal random: " + numRandom);
        System.out.println("Lista numeros: " + nums);
        System.out.println("Lista nomes: " + nomes);
        String nomesCollector = nomes.stream().collect(Collectors.joining(" | "));
        System.out.println("Lista de nomes concatenada: " + nomesCollector);
        long numsCollector = nums.stream().collect(Collectors.counting());
        System.out.println("Contar NUMS: " + numsCollector);
        Set<Integer> numsColInteger = nums.stream().collect(Collectors.filtering(n -> n >= 2, Collectors.toSet()));
        System.out.println("Set nums filtrado: " + numsColInteger);

        System.out.println();
        System.out.println("Avarage() e sum(): "); //Não existe diretamente em Stream<T>. Ele é encontrado em Streams primativas, como Int Stream Double Stream e long Stream
        System.out.println("Média Nums: " + nums.stream().mapToInt(n -> n).average());
        System.out.println("Média double: " + nums.stream().mapToDouble(n -> n).average());
        //average() não retorna OptionalInt, mesmo quando você usa IntStream. Ele sempre retorna OptionalDouble, porque uma média pode ter casas decimais.
        System.out.println("Soma nums: " + nums.stream().mapToInt(n->n).sum());
        System.out.println("Soma double: " + nums.stream().mapToDouble(n->n).sum());

        System.out.println();
        System.out.println("MapToInt() MapToDouble() MapToLong(): ");
        System.out.println("Existem streams esepecializadas para tipos primitivos, como o avarage() e sum()");
        System.out.println("Integer é um objeto, int é primitivo");
        System.out.println("Os streams especializados permitem operações numericas mais naturais: ");
        System.out.println("sum() max() min() avarage() entre outros");
        System.out.println();
    }
}
