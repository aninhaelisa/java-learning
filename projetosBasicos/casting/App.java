package projetosBasicos.casting;

public class App {
    public static void main(String[] args) {
        System.out.println("Exemplo de Casting em Java");
        // Casting de tipos primitivos:
        // Casting explicito (narrowing)
        // Casting implícito (widening)

        int numeroInteiro = 100;
        System.out.println("Número inteiro: " + numeroInteiro);
        double numeroDecimal = numeroInteiro; // Implicit casting (widening)
        System.out.println("Número decimal (após casting implícito): " + numeroDecimal);

        double outroNumeroDecimal = 3.14;
        System.out.println("Outro número decimal: " + outroNumeroDecimal);
        int outroNumeroInteiro = (int) outroNumeroDecimal; // Explicit casting (narrowing)
        System.out.println("Outro número inteiro (após casting explícito): " + outroNumeroInteiro);

        // Casting de tipos de referência:
        Object obj = "Olá, mundo!";
        String str = (String) obj; // Casting explícito de Object para String
        System.out.println("String após casting de Object: " + str);

        // Cuidado com o casting de tipos de referência:
        Object outroObj = new Object();
        try {
            String outraStr = (String) outroObj; // Isso causará ClassCastException
            System.out.println("Outra string: " + outraStr);
        } catch (ClassCastException e) {
            System.out.println("Erro de casting: " + e.getMessage());
        }

    }
}