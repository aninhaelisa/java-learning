package projetosBasicos.String;

public class App {
    public static void main(String[] args) {
        System.out.println("Manipulação de Strings em Java");

        String palavra1 = "Ana Elisa -  eNgenaria de SofTware 2026  - 2028 ";
        String p01 = palavra1.toLowerCase();
        String p02 = palavra1.toUpperCase();
        System.out.println("Original: " + palavra1 + "-");
        System.out.println();
        System.out.println("Minúsculas: " + p01 + "-");
        System.out.println("Maiúsculas: " + p02 + "-");
        System.out.println();
        String p04 = palavra1.trim();
        System.out.println("Sem espaços no fim: " + p04 + "-");
        System.out.println();
        String p06 = palavra1.substring(0, 14);
        String p07 = palavra1.substring(2);
        System.out.println("Subtring (0 a 10): " + p06 + "-");
        System.out.println("Substring (a partir do 2): " + p07 + "-");
        System.out.println();
        String p08 = palavra1.replaceAll("[0-9]", "*");
        System.out.println("Substituindo números por '*': " + p08 + "-");
        String p05 = palavra1.replace("2026", "2027");
        System.out.println("Substituindo '2026' por '2027': " + p05 + "-");
        System.out.println();
        int i = palavra1.indexOf("SofTware");
        System.out.println("Índice de 'SofTware': " + i);
        int j = palavra1.lastIndexOf("2026");
        System.out.println("Último índice de '2026': " + j);

        System.out.println();
        String[] p03 = palavra1.split(" - ");
        System.out.println("Dividido por ' - ': " + p03[0] + " | " + p03[1] + " | " + p03[2] + "-");
        // O split serve para recortar a string em partes, usando um delimitador
        // específico. No exemplo, a string é dividida em três partes usando " - " como
        // delimitador. O resultado é um array de strings, onde cada elemento contém uma
        // parte da string original. No caso, p03[0] contém "Ana Elisa", p03[1] contém
        // "eNgenaria de SofTware 2026" e p03[2] contém "2028".
    }
}
