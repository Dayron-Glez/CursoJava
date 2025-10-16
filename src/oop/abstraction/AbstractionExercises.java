package oop.abstraction;

import java.util.ArrayList;
import java.util.Arrays;

public class AbstractionExercises {
    public static void main(String[] args) {
        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        var circle = new Circle(5,3);
        System.out.println(circle.calculateArea());

        var rectangle = new Rectangle(5);
        System.out.println(rectangle.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
            var guitar = new Guitar();
            var piano = new Piano();

            guitar.play();
            piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        var animals = new ArrayList<>(Arrays.asList(
                new Dog(),
                new Cat()
        ));

        for(Animal animal : animals) animal.makeSound();
    }

    public interface Playable {
        void play();
    }
}
