package oop;

public class BankAccount {
    // Atributos
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Métodos
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Depósito exitoso: " + amount + ". Nuevo saldo: " + this.balance);
        } else {
            System.out.println("El monto del depósito debe ser positivo.");
        }
    }

}
