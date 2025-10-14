package oop;

public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        if(celsius < -100 || celsius > 100){
            System.out.println("La temperatura debe de estar entre los -100C° y los 100°C");
        } else {
        this.celsius = celsius;
            System.out.println("La temperaura es de " + this.celsius + "°C");
        }
    }
}
