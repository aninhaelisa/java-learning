package projetosBasicos.compareToExemplo.entities;

public interface comparable<T> { // Toda classe que implementar Comparable deve possuir um método compareTo()
    int compareTo(Pessoa outra);
}
