package basics;

public class BeginnerExercises {
    public static void main(String[] args) {
        //1. Declara una variable de tipo String y asígnale tu nombre
            String myName = "Dayron";
        //2. Crea una variable de tipo int y asígnale tu edad
            int age = 24;
        //3. Create a double variable and asign it your height in meters
            double heightInMeters = 1.75;
        //4. Declare a variable of type boolean that says if you like to programming
            boolean iLikeToProgramming = true;
        //5. Declare a constant with your email
            final String EMAIL = "dayron123";
        //6. Create a variable of type chart and save the first letter of your name
            char letter = 'D';
        //7. Declare a variable of String type with your city, change its value and print it again
            String city = "Habana";
            System.out.println(city);
            city = "Sevilla";
            System.out.println(city);
        //8. Create a int variable called a, another one called b, and print the sum of both
            int a = 2;
            int b = 3;
            int sum = a + b;
            System.out.println(sum);
        //9. Print the data type of two variables created
            System.out.println("The data type of a variable is " + ((Object)a).getClass().getSimpleName());

        //10. Try to create a variable without initializing it and give it a value before printing it
            char anoterLetter =
            anoterLetter = 'B';
            System.out.println(anoterLetter);
    }
}
