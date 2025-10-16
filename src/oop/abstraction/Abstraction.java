package oop.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        // abstracción

        // - Clase abstracta

        var dog = new Dog();
        dog.sound();

        // - Interface
    }

    public static abstract class Animal {
        public abstract void sound();
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof!!!");
        }
    }
    // - Interface
    public interface Flying {
        void fly();
    }

    public static class Bird extends Animal implements Flying{
        @Override
        public void sound() {
            System.out.println("pio pio!!!");
        }

        @Override
        public void fly() {
            System.out.println("el pajaro vuela");
        }
    }
    public static class Bat extends Animal implements Flying{
        @Override
        public void sound() {
            System.out.println("el señor de la nocheeeee!!!");
        }

        @Override
        public void fly() {
            System.out.println("Vuela en su nave");
        }
    }

}
