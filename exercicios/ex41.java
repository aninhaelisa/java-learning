package exercicios;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class ex41 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] line = null;

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = agora.format(fmtData);
        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = agora.format(fmtHora);

        System.out.println("EXERCICIO 41 - Diario pessoal");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        int opcao = -1;
        while (opcao != 0) {

            System.out.println("Oi " + nome + "! O que deseja fazer hoje?");
            System.out.println("1 - Escrever no diário");
            System.out.println("2 - Ler o diário");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Me conta em uma linha como foi seu dia: ");
                    String sobreDia = sc.nextLine();

                    System.out.println("Uau! Muita coisas aconteceram hoje... Como você se sente sobre isso? ");
                    String sentimento = sc.nextLine();
                    
                    System.out.println("Aconteceu mais alguma coisa que gostaria de compartilhar? (n - não, s - sim)");
                    String decisao = sc.nextLine();


                    if (decisao.equalsIgnoreCase("n")) {
                        System.out.println("Entendi, obrigado por compartilhar seu dia comigo!");
                        line = new String[] {
                                "Nome: " + nome,
                                "Data: " + dataFormatada,
                                "Hora: " + horaFormatada,
                                "Como foi seu dia: " + sobreDia,
                                "Como se sente sobre isso: " + sentimento,
                        };
                    } else if (decisao.equalsIgnoreCase("s")) {
                        System.out.println("Me conta mais sobre o que aconteceu: ");
                        String maisSobreDia = sc.nextLine();
                        System.out.println("Obrigado por compartilhar mais detalhes do seu dia comigo!");
                        line = new String[] {
                                "Nome: " + nome,
                                "Data: " + dataFormatada,
                                "Hora: " + horaFormatada,
                                "Como foi seu dia: " + sobreDia,
                                "Como se sente sobre isso: " + sentimento,
                                "Mais detalhes do dia: " + maisSobreDia,
                        };
                    }

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Diario.txt", true))) {
                        for (String item : line) {
                            bw.write(item);
                            bw.newLine();
                        }
                        bw.newLine();
                    } catch (Exception e) {
                        System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
                    }

                    break;

                case 2:
                    System.out.println("Lendo o diário...");
                    try (BufferedReader br = new BufferedReader(new java.io.FileReader("Diario.txt"))) {
                        String line2;
                        while ((line2 = br.readLine()) != null) {
                            System.out.println(line2);
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                    }

                    break;

                case 0:
                    System.out.println("Até mais " + nome + "! Espero que tenha um ótimo dia! Te vejo na proxima");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }

        }

        sc.close();
    }
}
