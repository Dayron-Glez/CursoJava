package oop;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassesExercises {
    public static void main(String[] args) {
      // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos
        var book = new Book("1984", "George Orwell");
        System.out.println("Title: " + book.title + ", Author: " + book.author);
      // 2. Crea una clase Dog con un método bark() que imprima su sonido
        var dog = new Dog("Buddy");
        dog.bark();
      // 3. Añade un constructor a la clase Book que reciba title y author
        // -> Ya se añadió en el ejercicio 1
      // 4. Crea una clase  Car con atributos brand y model y un metodo showData
        var vehicle = new Car("Toyota", "Corolla");
        vehicle.showData();
      // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó(mayor o igual a 60)
        var student = new Student("Alice", 75);
        student.checkPass();
      // 6. Crea una clase BankAccount con atributo balance y un metodo deposit que sume el saldo
        var account = new BankAccount("123456789", 1000);
        account.deposit(500);
      // 7. Crea una clase Rectangle y metodos para calcular su area y perimetro
        var rectangle = new Rectangle(5, 10);
        rectangle.area();
        rectangle.perimeter();
      // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar el salario
        var worker = new Worker("John", 3000);
        worker.showData();
      // 9. Crea varios objetos Person y guárdalos en un ArrayList
        var people = new ArrayList<>(Arrays.asList(
                new Person("Ana", 25, "561"),
                new Person("Luis", 30, "64984"),
                new Person("Marta", 28, "8494")
        ));
        for (Person person : people) {
            System.out.println("Name: " + person.name + ", Age: " + person.getAge());
        }
      // 10. Crea una clase Product y un método que aplique un descuento sobre su precio
        var product = new Product("Laptop", 1000);
        product.applyDiscount(10);
    }
}
