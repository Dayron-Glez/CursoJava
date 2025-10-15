package oop.inheritance;

public class InheritanceExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Vehicle con el metodo move. Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk
        var car = new Car(50);
        car.move(10);
        car.honk();

        // 2. Crea una clase Animal con el metodo makeSound. Haz que Dog diga woof y el Cat diga meow sobrescribiendo makeSound
        var dog = new Dog("Firus", 2);
        var cat = new Cat("Misu", 3);
        dog.makeSound();
        cat.makeSound();

        // 3. Crea una clase abstracta Shape con un metodo calculateArea. Luego implementa ese metodo en circle y en rectangle
        var circle = new Circle("circle", 5, 3);
        var rectangle = new Rectangle("rectangle", 5);
        System.out.println("El area del " + circle.getNombreFigura() + " es " +circle.calculateArea());
        System.out.println("El area del " + rectangle.getNombreFigura() + " es " +rectangle.calculateArea());

    }
}
