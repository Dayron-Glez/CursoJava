package oop;

public class Person {
    // Atributos
    protected String name;
    private int age;
    final private String id;

    // Constructor
    public Person(String name, int age, String id) {
    this.name = name;
    this.setAge(age);
    this.id = id;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + this.name + " y tengo " + this.age + " años.");
    }

    //getters
    public String getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    //setters

    public void setAge(int age){
        if( age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
