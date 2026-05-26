package projetosBasicos.metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projetosBasicos.metodosAbstratos.entities.Circulo;
import projetosBasicos.metodosAbstratos.entities.Cores;
import projetosBasicos.metodosAbstratos.entities.Forma;
import projetosBasicos.metodosAbstratos.entities.Retangulo;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de formas: ");
        int n = sc.nextInt();

        List<Forma> formas = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Forma #" + (i+1) + " dados:");
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            if(ch == 'r'){
                System.out.print("Cor (PRETO/ROSA/BRANCO/VERMELHO/AZUL/AMARELO): ");
                String cor = sc.next();
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                Retangulo retangulo = new Retangulo(Cores.valueOf(cor.toUpperCase()), largura, altura);
                formas.add(retangulo);
            } else {
                System.out.print("Cor (PRETO/ROSA/BRANCO/VERMELHO/AZUL/AMARELO): ");
                String cor = sc.next();
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                Circulo circulo = new Circulo(Cores.valueOf(cor.toUpperCase()), raio);
                formas.add(circulo);
            }
        }

        for(Forma forma : formas){
            System.out.print(forma.getCores().aplicar( String.format("Forma: %s - ", forma.getClass().getSimpleName())));
            System.out.println(forma.getCores().aplicar(String.format("Area: %.2f", forma.area())));
        }
        sc.close();
    }
}
