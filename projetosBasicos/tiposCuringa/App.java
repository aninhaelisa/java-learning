package projetosBasicos.tiposCuringa;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<?> lista = new ArrayList<>(); // ? é um tipo curinga, que pode ser qualquer tipo de objeto
        List<Integer> myNumbers = new ArrayList<>();
        lista = myNumbers; 

       // lista.add(3); // isso gera erro pois a lista é do tipo curinga, e não sabemos qual é o tipo real da lista. Portanto, não podemos adicionar elementos a ela.


       List<Integer> myInts = new ArrayList<>(5, 6, 7);
    }
}
