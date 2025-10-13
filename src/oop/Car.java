package oop;

public class Car {
    // Atributos
    String brand;
    String model;
    //Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //Metodos

    public void showData() {
        System.out.println("Brand: " + this.brand + ", Model: " + this.model);
    }
}
