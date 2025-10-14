package oop;

public class Worker2 {
    private double salary;

    public Worker2(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        if(amount <= 0 ) {
            System.out.println("El aumento debe de ser mayor que cero");
        } else {
            this.salary+=amount;
            System.out.println("El aumento fue de " + amount + ". El salario actual es de " + this.salary);
        }
    }
}
