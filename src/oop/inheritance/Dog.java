package oop.inheritance;

public class Dog extends Animal {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }
    @Override
    public void eat(){
        System.out.println("El perro " + this.name + " está comiendo" );
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("La edad del perro es de " + this.age + " años");
    }
}
