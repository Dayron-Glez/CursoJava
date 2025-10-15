package oop.inheritance;

public class Car extends Vehicle{
    public Car(int speed) {
        super(speed);
    }

    public void honk() {
        System.out.println("honk!!!!");
    }
}
