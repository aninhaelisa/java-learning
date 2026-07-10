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

        System.out.println(set.contains("Tablet"));
        System.out.println(set.contains("set"));

        for(String p : set){
            System.out.println(p);
        }
    }
}
