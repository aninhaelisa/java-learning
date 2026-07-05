package projetosBasicos.defaultMethods.services;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate; // este metodo fica apenas aqui pois interface não pode armazenar estado
    }


}
