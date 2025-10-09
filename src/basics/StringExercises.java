package basics;

public class StringExercises {
    public static void main(String[] args) {
        String a = "Primera cadena de texto";
        String b = "Segunda cadena de texto";
        String stringConEspacios = "String con espacios";
        int entero = 24;
        //1. Concatena dos cadenas de texto
            System.out.println( a + " " + b);
        //2. Muestra la longitud de una cadena de texto
            System.out.println(a.length());
        //3. Muestra el primer y último carácter de un string
            System.out.println(a.charAt(0) + "" + a.charAt(a.length() -1));
        //4. Convierte a mayúsculas y minúsculas un string
            System.out.println(a.toUpperCase());
            System.out.println(a.toLowerCase());
        //5. Comprueba si una cadena de texto contiene una palabra
            System.out.println(a.contains("texto"));
        //6. Formatea un string con un entero
            System.out.println(String.format("Mi nombre es Dayron y tengo %d años", entero));
        //7. Elimina los espacios en blanco al principio y al final de una cadena de texto
            System.out.println(a.trim());
        //8. Sustituye todos los epacios en blanco de una cadena de texto por un guión (-)
            System.out.println(stringConEspacios.toLowerCase().replace(' ', '-'));
        //9. Comprueba si dos strings son iguales
            System.out.println(a.equals(b));
        //10. Comprueba si dos strings tienen la misma longitud
            System.out.println(a.length() == b.length());
    }
}
