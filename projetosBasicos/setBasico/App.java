package projetosBasicos.setBasico;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("notebook");
        set.add("Tablet");

       // set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Tablet"));
        System.out.println(set.contains("set"));

        for(String p : set){
            System.out.println(p);
        }
    }
}
