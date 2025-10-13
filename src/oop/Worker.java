package oop;

public class Worker {
    // Atributos
    String name;
    double salary;

    // Constructor
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Métodos
    public void showData() {
        System.out.println("Worker Name: " + this.name + ", Salary: " + this.salary);
    }
}
