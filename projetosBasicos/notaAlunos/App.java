package projetosBasicos.notaAlunos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import projetosBasicos.notaAlunos.entities.Alunos;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----".repeat(10) + "NOTA DOS ALUNOS" + "----".repeat(10));
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Verificar média do aluno");
        System.out.print("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                String op_cadastro = "s";
            while (op_cadastro.equalsIgnoreCase("S")) {
                System.out.println("---CADASTRAR UM ALUNO---");
                Alunos aluno = new Alunos();
                System.out.print("Nome do aluno: ");
                aluno.nome = sc.nextLine();
                System.out.print("Nota de matemática: ");
                aluno.matematica = sc.nextDouble();
                System.out.print("Nota de português: ");
                aluno.portugues = sc.nextDouble();
                System.out.print("Nota de artes: ");
                aluno.artes = sc.nextDouble();
                double media = (aluno.matematica + aluno.portugues + aluno.artes) / 3.0;
                aluno.media = media;

                try{
                    FileWriter writer = new FileWriter("alunos_notas.txt", true);
                    writer.write(String.format("NOME: %s - NOTA DE MATEMÁTICA: %.1f - NOTA DE PORTUGUÊS: %.1f - NOTA DE ARTES: %.1f - MÉDIA: %.2f\n", aluno.nome, aluno.matematica, aluno.portugues, aluno.artes, aluno.media));
                    writer.close();
                }catch(IOException e){
                    System.out.println("hum... Algo deu errado ao tentar salvar... tente novamente...");
                }

                sc.nextLine();
                System.out.println("Deseja cadastrar outro aluno? (S/N)");
                op_cadastro = sc.nextLine();
            }
                break;
        
                case 2: 
                System.out.println("---VERIFICAR MÉDIA DO ALUNO---");

                String op_verificar = "s";
                while(op_verificar.equalsIgnoreCase("S")){
                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = sc.nextLine();

                try{
                    File alunoFile = new File("alunos_notas.txt");
                    Scanner fileScanner = new Scanner(alunoFile);

                    boolean alunoEncontrado = false;

                    while (fileScanner.hasNextLine()) {
                        String linha = fileScanner.nextLine();

                        if(linha.toLowerCase().contains(nomeAluno.toLowerCase())){
                            System.out.println(linha);
                            alunoEncontrado = true;
                            break;
                        }
                    } 

                    fileScanner.close();
                }catch(IOException e){
                    System.out.println("hum... Algo deu errado ao tentar ler o arquivo... tente novamente...");
                }

                sc.nextLine();
                System.out.println("Deseja verificar a média de outro aluno? (S/N)");
                op_verificar = sc.nextLine();
            }
                break;
            default:
                break;
        }

        sc.close();
    }
}
