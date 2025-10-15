package oop.polymorphism;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width, String shapeName) {
        super(shapeName);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.height*this.width;
    }
}
