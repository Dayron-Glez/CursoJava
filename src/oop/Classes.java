package oop;

public class Classes {
    public static void main(String[] args) {
        var person = new Person("Dayron", 24, "A123456B");
        person.sayHello();
        System.out.println(person.getId());
        person.setAge(25);
        System.out.println(person.getAge());
    }
}

