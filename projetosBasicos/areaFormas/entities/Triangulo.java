package projetosBasicos.areaFormas.entities;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area(){
        double area = (a + b + c) / 2.0;
        return Math.sqrt(area * (area - a) * (area - b) * (area - c));
    }
}
