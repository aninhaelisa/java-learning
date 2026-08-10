package exercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("EXERCICIO 54 - ALARME DIGITAL");
            System.out.println("Configure o Alarme (hh:mm:ss): ");
            System.out.print("> ");
            String alarme = sc.nextLine();
            DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime horaAlarme = LocalTime.parse(alarme, dataFormatada);

            while (LocalTime.now().isBefore(horaAlarme)) {
                LocalTime horaAtual = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", horaAtual.getHour(), horaAtual.getMinute(),
                        horaAtual.getSecond());
                System.out.flush();
                Thread.sleep(1000);
            }

            System.out.println();
            System.out.println(" ALARME! A hora atual é: " + LocalTime.now().format(dataFormatada));
            sc.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
