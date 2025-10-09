package basics;

import java.util.Scanner;
public class HelloWorldExercises {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1. Imprime un mensaje que diga tu nombre en lugar de Hola Mundo
        System.out.println("Hola Dayron");

        //2. Imprime dos líneas que digan Hola y Mundo con un solo println
        System.out.println("Hola\n" + "Mundo");

        //3. Imprime tu edad, tu color favorito y tu ciudad
        int edad = 24;
        String ColorFavorito = "rojo";
        String ciudad = "Sevilla";
        System.out.println("Tengo " + edad + " años. Mi color favorito es el " + ColorFavorito + " y vivo en " + ciudad);

        //4. Explora los diferentes System.xxx.println más allá del out
            // Probar el system.in
                System.out.println("Por favor, introduce tu nombre");
                String nombre = entrada.next();
                System.out.println("Por favor, introduce tu edad");
                int edadNueva = entrada.nextInt();
                System.out.println("Tu nombre es " + nombre + " y tienes " + edadNueva + " años");
                entrada.close();
            //Probar el system.err
                System.err.println("Texto de error");

    }
}
