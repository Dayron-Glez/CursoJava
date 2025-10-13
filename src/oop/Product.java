package oop;

public class Product {
    // Atributos
    String name;
    double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Métodos
    public void applyDiscount( double percentage ) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("El porcentaje debe estar entre 0 y 100.");
            return;
        }
        double discountAmount = this.price * (percentage / 100);
        this.price -= discountAmount;
        System.out.println("Descuento aplicado: " + discountAmount + ". Nuevo precio: " + this.price);
    }
}
