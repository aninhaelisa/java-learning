package projetosBasicos.sobrecarga;

import projetosBasicos.sobrecarga.entities.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 30, 1.75);
        Pessoa p2 = new Pessoa("Maria", 25);

        System.out.println("Pessoa 1: " + p1.nome + ", Idade: " + p1.idade + ", Altura: " + p1.altura);
        System.out.println("Pessoa 2: " + p2.nome + ", Idade: " + p2.idade);
    }
}

// Neste exemplo, a classe `Pessoa` possui dois construtores: um que recebe o
// nome, idade e altura, e outro que recebe apenas o nome e idade. Isso é um
// exemplo de sobrecarga de construtores, permitindo criar objetos `Pessoa` com
// diferentes conjuntos de informações. No método `main`, criamos duas
// instâncias de `Pessoa` usando os dois construtores diferentes e imprimimos
// suas informações.