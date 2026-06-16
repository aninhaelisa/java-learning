package projetosBasicos.excecoesPersonalizadas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import projetosBasicos.excecoesPersonalizadas.model.Reserva;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numeroQuarto = sc.nextInt();
        System.out.print("Data de check-in (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data de check-out (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: A data de check-out deve ser posterior à data de check-in.");
        } else {
            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva:");
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date hoje = new Date();
            if (checkIn.before(hoje) || checkOut.before(hoje)) {
                System.out.println("Erro na reserva: As datas para atualização devem ser futuras.");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: A data de check-out deve ser posterior à data de check-in.");
            } else {
                reserva.atualizarDatas(checkIn, checkOut);
                System.out.println("Reserva atualizada: " + reserva);
            }

        }

        sc.close();
    }
}
