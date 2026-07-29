package projetosBasicos.expressoesLambdaAula;

public class App {
    public static void main(String[] args) {

        Printable printableLambda = (s) -> "MEOW" + s;
        printThing(printableLambda);
    }

    static void printThing(Printable thing) {
        System.out.println(thing.print("!"));
    }
}
