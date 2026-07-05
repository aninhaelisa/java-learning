package projetosBasicos.defaultMethods.services;

public class UsaInterestService {
    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double payment(double amount, int months) {
        if (months < 0) {
            throw new IllegalArgumentException("Months cannot be negative");
        }
        return amount * Math.pow(1 + interestRate / 100.0, months);
    }
}
