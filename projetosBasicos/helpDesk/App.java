package projetosBasicos.helpDesk;

import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.helpDesk.entities.enums.Status;
import projetosBasicos.helpDesk.entities.enums.Categoria;

import projetosBasicos.helpDesk.entities.service.MessageService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------- SISTEMA HELP DESK --------------------------");

        try {
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.println("Categoria: ");
            System.out.println("1 - Incidente | 2 - Rede    | 3 - Impressora | 4 - Comunicação");
            System.out.println("5 - Segurança | 6 - Acessos | 7 - Computador | 8 - Solicitação");
            System.out.print("> ");
            int cat = sc.nextInt();
            sc.nextLine();
            System.out.println("Mensagem: ");
            System.out.print("> ");
            String mensagem = sc.nextLine();
            
            System.out.println();
            MessageService messageService = new MessageService(mensagem, email, Categoria.fromValor(cat),  Status.fromValor(1));
            System.out.println(messageService);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
