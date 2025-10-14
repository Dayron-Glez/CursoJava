package oop;

public class Product2 {
    private double price;

    public Product2 (double price){
        this.price = price;
    }

    public void setPrice(double price) {
       if (price < 0){
           System.out.println("The price must be greater than zero");
       } else {
           this.price = price;
           System.out.println("The new price is " + this.price);
       }
    }
}
