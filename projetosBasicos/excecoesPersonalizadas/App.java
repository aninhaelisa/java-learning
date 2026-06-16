package projetosBasicos.excecoesPersonalizadas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import projetosBasicos.excecoesPersonalizadas.model.entities.Reserva;
import projetosBasicos.excecoesPersonalizadas.model.exceptions.DomainExcepition;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva:");
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva atualizada: " + reserva);
    } catch (ParseException e) {
        System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
    } catch(DomainExcepition e) {
        System.out.println( e.getMessage());
    } catch(RuntimeException e) {
        System.out.println("Erro inesperado");
    }
        sc.close();
    }
}
