package oop.inheritance;

public abstract class Shape {
    public String nombreFigura;

    public Shape(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
        System.out.println("La figura es: " + this.nombreFigura);
    }

    public abstract double calculateArea();

}
