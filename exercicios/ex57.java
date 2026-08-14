package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex57 {
    public static void main(String[] args) {
        System.out.println("Exercício 57 - MAP E FLATMAP");
        Cliente c1 = new Cliente("Ana", Arrays.asList("1111-1111", "2222-2222"));
        Cliente c2 = new Cliente("Bob", Arrays.asList("3333-3333", "4444-4444"));

        List<Cliente> clientes = Arrays.asList(c1, c2);

        // Se usássemos MAP normal:
        // O resultado seria uma lista de listas: Stream<List<String>>
        List<List<String>> telefonesComMap = clientes.stream()
                .map(cliente -> cliente.getTelefones())
                .collect(Collectors.toList());
        System.out.println(telefonesComMap); 
        // Saída: [["1111-1111", "2222-2222"], ["3333-3333", "4444-4444"]]

        // Com FLATMAP:
        // Transforma cada List<String> em um Stream<String> individual e junta tudo
        List<String> todosOsTelefones = clientes.stream()
                .flatMap(cliente -> cliente.getTelefones().stream())
                .collect(Collectors.toList());

        System.out.println(todosOsTelefones);
        // Saída: [1111-1111, 2222-2222, 3333-3333, 4444-4444] (Lista achatada)
    }
}

class Cliente {
    private String nome;
    private List<String> telefones;

    public Cliente(String nome, List<String> telefones) {
        this.nome = nome;
        this.telefones = telefones;

    }

    public List<String> getTelefones() {
        return telefones;
    }
}