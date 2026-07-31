package projetosBasicos.split_Exemplo;

public class App {
    public static void main(String[] args) {
        String listaCompra = "Melancia;Abacaxi;Kiwi;Melão;Maca Verde";
        String[] separado = listaCompra.split(";");

        for (String fruta : separado) {
            System.out.println(fruta);
        }
    }
}
