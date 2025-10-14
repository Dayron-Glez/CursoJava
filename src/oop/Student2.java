package oop;

public class Student2 {
    private double grade;

    public Student2(double grade) {
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPassed(double grade) {
        return grade>=60;
    }
}
