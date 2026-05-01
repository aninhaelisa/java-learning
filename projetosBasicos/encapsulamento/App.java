package projetosBasicos.encapsulamento;

import projetosBasicos.encapsulamento.entities.Pessoa;

public class App {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 30, 1.75);

        // Acessando os atributos usando os getters
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

        // Modificando os atributos usando os setters
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setAltura(1.65);

        // Acessando os atributos novamente para verificar as mudanças
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}
