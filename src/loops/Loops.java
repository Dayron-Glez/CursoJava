package loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Loops {
    public static void main(String[] args) {
        //Loops


        // - for
        for (int index = 0; index <5 ; index++) {
            System.out.println("Hola Java en index " + index);
        }

        String[] names = {"Dayron","Yoly","Erne"};

        for (int i  = 0; i < names.length ; i ++) {
         System.out.println("Hola " + names[i]);
        }
        // for each, más simplificado, para recorrer todos los elementos de una estructura x
        for (String name : names) {
            System.out.println("Hola2 " + name);
        }

        var emails = new HashMap<String,String>();
        emails.put("Dayron","dayron@gmail.com");
        emails.put("Yoly","yoly@gmail.com");
        emails.put("Erne","erne@gmail.com");

        for (Map.Entry<String,String> email : emails.entrySet()) {
            System.out.println(email.getValue()); // Esto es para solo obtener el value del par <Key, Value > del Set
            // Una forma más bonita de verlo sería
            System.out.println("El usuario " + email.getKey() + " tiene el email " + email.getValue());
        }

        // Ejemplo. Podría tener un critero que fuese recorrer todos los email y modificar solamente el email de una clave en específico

        for (Map.Entry<String,String> email : emails.entrySet()) {
          if(Objects.equals(email.getKey(), "Dayron")) {
              emails.replace("Dayron", "dayron@gmail.com", "daygongar123@gmail.com");
          }
        }

        System.out.println("Valores nuevos :" + emails.values());

        // while
        int index = 0;
        boolean find = false;
        while (!find) {
            System.out.println("Hola hola");
            index++;
            find = true;
        }

        // do while
        int indice = 0;
        do {
            System.out.println(indice);
            indice++;
        } while (indice <5);

        //Control de bucles

        // break

        for (String name : names) {
            if(name.equals("Erne")) {
                break;
            } else {
                System.out.println(name);
            }
        }

        // continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // el continue lo que hace es forzar una nueva ejecución del bucle, ignorando lo que le sigue
            }
            System.out.println(i);
        }
    }
}
