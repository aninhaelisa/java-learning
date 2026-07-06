package projetosBasicos.hashCodeEquals;

import projetosBasicos.hashCodeEquals.entities.Clientes;

public class App {
    public static void main(String[] args) {
        Clientes c1 = new Clientes("Maria", "maria@gmail.com");
        Clientes c2 = new Clientes("Lucas", "lucas@gmail.com");

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.getEmail().hashCode());  
    }
}
