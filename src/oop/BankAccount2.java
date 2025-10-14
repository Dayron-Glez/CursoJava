package oop;

public class BankAccount2 {
    private double balance;

    public BankAccount2(double balance) {
        this.balance = balance;
    }

    public void deposit(double money){
        if(money <= 0) {
            System.out.println("The minimal mount must be greater than zero");
        } else {
            this.balance+=money;
            System.out.println("The balance now is " + this.balance);
        }
    }

    public double withDraw(double money){
        if(money >=this.balance) {
            System.out.println("The maximum amount to withdraw must be equal or less than " + this.balance);
        } else {
            this.balance-=money;
            System.out.println("The new balance is " + this.balance);
        }
        return this.balance;
    }
}
