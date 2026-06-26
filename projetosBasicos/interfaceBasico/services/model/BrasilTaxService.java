package projetosBasicos.interfaceBasico.services.model;

public class BrasilTaxService {
    public Double tax(Double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}