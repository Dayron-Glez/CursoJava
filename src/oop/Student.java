package oop;

public class Student {
    // Atributos
    String name;
    int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Métodos
    public void checkPass() {
        if (this.score >= 60) {
            System.out.println(this.name + " ha aprobado con una puntuación de " + this.score);
        } else {
            System.out.println(this.name + " no ha aprobado con una puntuación de " + this.score);
        }
    }
}
