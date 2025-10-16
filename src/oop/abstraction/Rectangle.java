package oop.abstraction;

public class Rectangle extends Shape{
    private final double PI = 3.14;
    private double radio;

    public Rectangle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return this.PI * (this.radio * this.radio);
    }
}
