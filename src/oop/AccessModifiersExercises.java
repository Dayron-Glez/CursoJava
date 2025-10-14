package oop;

public class AccessModifiersExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Person2 con atributos privados name y age. Usa los métodos getName(), setName(), getAge()  y setAge() para asignar y mostrar valores
        var person2 = new Person2("Dayron",24);
        System.out.println("Name=" + person2.getName() + " Age=" + person2.getAge());

        // 2. Crea una clase Product2 con el atributo privado price. Añade el método setPrice (double price) que solo permita precios mayores que 0
        var product2 = new Product2(100);
        product2.setPrice(200);

        // 3. Crea una clase BankAccount2 con el atributo privado balance. Implementa los métodos deposit(double ammount) y withdraw( double amount) que validen las cantidades correctamente
        var bankAccount2 = new BankAccount2(500);
        bankAccount2.deposit(100);
        bankAccount2.withDraw(500);

        // 4. Crea una clase Book2 con el atributo privado title. Permite leerlo con el método getTitle() pero mo modificarlo. El título debe de asignarse solo por el constructor
        var book2 = new Book2("El diario de una Geicha");
        book2.getTitle();

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100
        var temperature = new Temperature(50);
        temperature.setCelsius(80);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password), y checkPassword(String inputUsername) que compare contraseñas
        var user = new User("Dayron", "Dayron123");
        System.out.println(user.checkPassword("Dayron123"));

        // 7. Crea una clase Worker2 con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo per mita aumentos positivos
        var worker2 = new Worker2(250);
        worker2.raiseSalary(100);

        // 8. Crea una clase Rectangle2 con los atributos privados width y height y el método calculateArea() que devuelva el resultado de width * height
        var rectangle2 = new Rectangle2(5,3);
        rectangle2.calculateArea(8,4);

        // 9. Crea una clase Student2  que con el atributo privado grade. Agrega los métdos setGrade(int grade) y isPassed() que devuelva true si el estudiante está aprobado
        var student2 = new Student2(60);
        System.out.println(student2.isPassed(61));

        // 10. Crea una clase Car2 con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad(máximo 120) y brake(int amount) que reduzca la velocidad (hasta 0)
        var car2 = new Car2(50);
        car2.accelerate(10);
        car2.breakCar(60);

    }
}
