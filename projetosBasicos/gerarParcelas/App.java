package projetosBasicos.gerarParcelas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.gerarParcelas.entities.Contracts;
import projetosBasicos.gerarParcelas.entities.Installment;
import projetosBasicos.gerarParcelas.services.ContractService;
import projetosBasicos.gerarParcelas.services.PaypalService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Contract value: ");
        double totalValue = sc.nextDouble();

        Contracts contract = new Contracts(number, date.format(fmt), totalValue);

        System.out.println("Enter number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
