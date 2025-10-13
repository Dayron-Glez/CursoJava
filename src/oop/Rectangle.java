package oop;

public class Rectangle {
    // Atributos
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Métodos
    public double area() {
        System.out.println("EL AREA ES: " + this.width * this.height);
        return this.width * this.height;
    }

    public double perimeter() {
        System.out.println("EL PERIMETRO ES: " + 2 * (this.width + this.height));
        return 2 * (this.width + this.height);
    }
}
