package oop.inheritance;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move(int amount) {
        if(amount <=0) {
            System.out.println("Seleccione un numero mayo a 0");
        } else {
            this.speed+=amount;
            System.out.println("Velocidad actual: " + this.speed);
        }
    }
}
