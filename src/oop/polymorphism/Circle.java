package oop.polymorphism;

public class Circle extends Shape{
    private double Pi = 3.14;
    private double radio;

    public Circle(String shapeName, double radio) {
        super(shapeName);
        this.radio = radio;
    }


    @Override
    public double calculateArea() {
        return this.Pi * (radio*radio);
    }
}
