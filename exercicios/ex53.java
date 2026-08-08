package exercicios;

public class ex53 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 53 - CARREGANDO");
        System.out.println();
        try {
            int n = 0;
            for (int i = 0; i < 11; i++) {
                System.out.print("Carregando: " + n + "%\r");
                n += 10;
                Thread.sleep(1000);
            }

            System.out.println("-".repeat(10));

            for(int i = 0; i<11; i++){
                System.out.println("[" + "#".repeat(i) + " ".repeat(10-i) + "]");
                Thread.sleep(1000);
            }

            System.out.println("-".repeat(10));

            for(int i = 0; i<11; i++){
                System.out.print("Carregando: ");
                System.out.print("#".repeat(i));
                n -= 10;
                Thread.sleep(1000);
            }


        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
