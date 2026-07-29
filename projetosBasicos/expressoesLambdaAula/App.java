package projetosBasicos.expressoesLambdaAula;

public class App {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        Printable printableLambda = () -> System.out.println("MEOW");
        printThing(printableLambda);
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}
