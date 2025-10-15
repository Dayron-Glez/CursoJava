package oop.inheritance;

public class Circle extends Shape{
    private double height;
    private double width;

    public Circle(String nombreFigura, double height, double width) {
        super(nombreFigura);
        this.height = height;
        this.width = width;
    }

    public Circle(String nombreFigura) {
        super(nombreFigura);
    }


    @Override
    public double calculateArea() {
        return this.height * this.width;
    }
}
