package oop;

public class Car2 {
    private double speed;

    public Car2(double speed) {
        this.speed = speed;
    }

    public void accelerate(double amount) {
        if(amount < 0 || amount > 120) {
            System.out.println("The minimal accelerate amount must be greater than 0 and less than 120");
        } else {
            this.speed+=amount;
            System.out.println("The actual speed is " + this.speed);
        }
    }

    public void breakCar( double amount) {
        if (this.speed-amount < 0) {
            System.out.println("Frena más despacio joder");
        } else {
            this.speed-= amount;
            System.out.println("La velocidad actual es de " + this.speed);
        }
    }
}
