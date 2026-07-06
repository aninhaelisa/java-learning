package projetosBasicos.tiposCuringa;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<?> lista = new ArrayList<>(); // ? é um tipo curinga, que pode ser qualquer tipo de objeto
        List<Integer> myNumbers = new ArrayList<>();
        lista = myNumbers;

        // lista.add(3); // isso gera erro pois a lista é do tipo curinga, e não sabemos
        // qual é o tipo real da lista. Portanto, não podemos adicionar elementos a ela.

        // Tipos curingas delimitados
        List<? extends Number> lista2 = new ArrayList<>();
        List<Integer> myNumbers2 = new ArrayList<>();
        lista2 = myNumbers2; // isso é permitido, pois Integer é um subtipo de Number

    }
}
