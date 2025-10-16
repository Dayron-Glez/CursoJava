package oop.abstraction;

public class Circle extends Shape{
    private double height;
    private double width;

    public Circle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }
}
