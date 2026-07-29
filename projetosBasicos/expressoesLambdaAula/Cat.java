package projetosBasicos.expressoesLambdaAula;

public class Cat implements Printable{
    public String name;
    public int age;

    public Cat(){}


    @Override
    public void print() {
        System.out.println("MEOW");
    }
}
