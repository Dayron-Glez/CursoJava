package oop.inheritance;

public class Rectangle extends Shape{
    private double PI = 3.14;
    private double radio;

    public Rectangle(String nombreFigura, double radio) {
        super(nombreFigura);
        this.radio = radio;
    }




    @Override
    public double calculateArea() {
        return this.PI * (this.radio * this.radio);
    }
}
