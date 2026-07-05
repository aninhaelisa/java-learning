package projetosBasicos.defaultMethods.services;

public interface InterestService { // Agora temos uma forma de herança multipla, pois uma classe pode implementar várias interfaces, permitindo que ela herde comportamentos de diferentes fontes. Isso é útil quando queremos combinar funcionalidades de diferentes serviços de juros em uma única classe.
    double getInterestRate();     // Interfaces ainda são bem diferentes de classe acstratas. Interfaces não possuem recursos tais como construtores e atributos.

    default double payment(double amount, int months) {
        if(months < 0){
            throw new IllegalArgumentException("Months cannot be negative");
        }
        return amount * Math.pow(1 + getInterestRate() / 100.0, months);
    } // Podemos reaproveitar o método payment() em todas as classes que implementarem a interface InterestService, sem precisar reescrevê-lo em cada classe. Isso promove a reutilização de código e mantém a consistência do cálculo de pagamento entre diferentes implementações de serviços de juros.
}

