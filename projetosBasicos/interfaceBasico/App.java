package projetosBasicos.interfaceBasico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.interfaceBasico.entities.model.CarRental;
import projetosBasicos.interfaceBasico.entities.model.Veiculo;
import projetosBasicos.interfaceBasico.services.model.BrasilTaxService;
import projetosBasicos.interfaceBasico.services.model.RentalServices;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do Aluguel: ");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Devolução (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Veiculo(model));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalServices.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getFatura().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getFatura().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getFatura().getTotalPayment()));
        
        sc.close();
    }
}
