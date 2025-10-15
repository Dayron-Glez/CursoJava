package oop.inheritance;

public class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }
    @Override
    public void eat(){
        System.out.println("El gato " + this.name + " está comiendo" );
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("La edad del gato es de " + this.age + " años");
    }
}
