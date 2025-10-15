package oop.inheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("El animal " + this.name + " está comiendo");
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}
