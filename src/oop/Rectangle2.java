package oop;

public class Rectangle2 {
    private double height;
    private double width;

    public Rectangle2(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea (double height, double width){
        System.out.println("EL área del rectángulo es " + (height * width));
        return height*width;
    }
}
