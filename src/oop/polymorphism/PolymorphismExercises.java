package oop.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        var animalList = new ArrayList<>(Arrays.asList(
                new Dog(),
                new Cat(),
                new Cow()
        ));
        for (Animal animal : animalList) {
            animal.makeSound();
        }
        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        var shapes = new ArrayList<>(Arrays.asList(
                new Circle("circle", 5),
                new Rectangle(5,3,"rectangle")
        ));

        for(Shape shape:shapes){
            System.out.println(shape.shapeName + ": " + shape.calculateArea());
        }
        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var printer = new Printer();
        printer.print(5);
        printer.print(8.0);
        printer.print("Hello");
        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHello("Dayron");
    }
}
