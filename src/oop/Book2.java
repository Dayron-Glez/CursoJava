package oop;

public class Book2 {
    private final String title;

    public Book2(String title) {
        this.title = title;
    }

    public String getTitle() {
        System.out.println("El titulo es: " + this.title);
        return title;
    }
}
