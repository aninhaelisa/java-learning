package projetosBasicos.interfaceBasico.services.model;

import java.time.Duration;

import projetosBasicos.interfaceBasico.entities.model.CarRental;
import projetosBasicos.interfaceBasico.entities.model.Fatura;

public class RentalServices {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrasilTaxService brasilTaxService;

    public RentalServices(Double pricePerHour, Double pricePerDay, BrasilTaxService brasilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brasilTaxService = brasilTaxService;
    }

    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = brasilTaxService.tax(basicPayment);

        carRental.setFatura(new Fatura(50.0, 10.0));
    }
}
