package basics;

public class VariablesAndConstants {
    public static void main(String[] args) {
        //Variables
        String name = "Dayron";
        name = "Dayron2";

        System.out.println(name);

        final int AGE = 24;
        // AGE = 25; --> This is an error cus within the final word before the type of the variable you can't change the variable value
        // Usually the constants names are always in UPPERCASE

        var email = "dayron123@gmail.com"; // --> the var world is used by Java to infer data type



    }
}
