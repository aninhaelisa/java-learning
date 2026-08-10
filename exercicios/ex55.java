package exercicios;

public class ex55 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 55 - CARREGAMENTO SIMULADOR");

        try{
            System.out.print("Progresso: ");
            for(int i = 0; i < 10; i++) {
                System.out.print("█");
                System.out.flush();
                Thread.sleep(1000);
            }

            System.out.println();
            System.out.print("Download: ");
            for (int i = 0; i < 10; i++) {
                System.out.print("█");
                System.out.flush();
                Thread.sleep(500);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
