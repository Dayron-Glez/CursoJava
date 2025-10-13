package oop;

public class Person {
    // Atributos
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + this.name + " y tengo " + this.age + " años.");
    }
}
