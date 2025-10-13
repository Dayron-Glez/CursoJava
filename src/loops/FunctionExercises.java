package loops;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionExercises {
    public static void main(String[] args) {
        Bienvenida();
        saludarPersona("Dayron");
        int resta = restaNumerosEnteros(5,2);

        calcularCuadradoNumero(5);

        boolean paridad = parOImpar(6);
        System.out.println(paridad);

        boolean mayoriaDeEdad = mayoriaEdad(17);
        System.out.println(mayoriaDeEdad);

        longitudCadenaTexto("Hola");

        int[] enteros = {5,5};

       float resultadoMediaAritmetica =  mediaAritmetica(enteros);
       System.out.println("El resultado de la media de " + Arrays.toString(enteros) + " es " + resultadoMediaAritmetica);

       int numeroParaFactorial = 5;
       int resultadoFactorial =factorial(numeroParaFactorial);
       System.out.println("El factorial de " + numeroParaFactorial + " es " + resultadoFactorial);

        var names = new ArrayList<>(Arrays.asList("Dayron", "Erne", "Yoly"));
        mostrarElementosArrayList(names);
    }

    // 1. Crea una función que imprima Te doy la bienvenida al curso de Java desde 0
    public static void Bienvenida() {
        System.out.println("Te doy la bienvenida al curso de Java desde 0");
    }
    // 2. Crea una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludarPersona(String nombre) {
        System.out.println("Hola " + nombre + ", bienvenido!");
    }
    // 3. Haz un método que reciba dos números enteros y devuelva su resta

    public static int restaNumerosEnteros (int a, int b){

        int res = a - b;
        System.out.println("Resultado: " + res);

        return res;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n*n)

    public static void calcularCuadradoNumero(Integer numero){
        System.out.println("El cuadrado de " + numero + " es " + (numero*numero));
    }

    // 5. Escribe una función que reciba un número y devuelva true si es par y false si es impar.

    public static boolean parOImpar (Integer numero) {
        return numero % 2 == 0;
    }

    // 6. Crea una función que reciba una edad y retone true si es mayor de edad y false si no lo es.

    public static boolean mayoriaEdad (Integer edad) {
        return edad >= 18;
    }

    // 7. Implementa una función que reciba una cadena de texto y devuelva su longitud.

    public static int longitudCadenaTexto (String cadena){
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena " + cadena + " es " + longitud);
        return longitud;
    }

    // 8. Crea un método que reciba un array de enteros, calcule su media y la devuelva.

    public static int mediaAritmetica (int[] enteros){
        int suma =0;
        for(Integer entero : enteros){
            suma+=entero;
        }

        return suma/enteros.length;
    }

    // 9. Escribe una función que reciba un número y devuelva su factorial.

    public static int factorial(Integer numero){
        int numeroDado = 5;
        int resultadoFactorial = numeroDado;
        for (int j = numeroDado -1; j > 1 ; j--) {
            resultadoFactorial*=j;
        }
        return resultadoFactorial;
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorrra mostrando cada elemento por consola.

    public static void mostrarElementosArrayList (ArrayList<String> elementos) {
        for(String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
