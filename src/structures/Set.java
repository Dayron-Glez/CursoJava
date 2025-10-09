package structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();
        // Tamaño

        System.out.println(names.size());

        //Añadir elementos

        names.add("Dayron");
        System.out.println(names.size());
        names.add("González");

        // No se utilizan los set para alamcenar datos de manera ordenada

        //Buscar elementos

        System.out.println(names.contains("Dayron"));

        // Eliminar elementos

        names.remove("González");

        System.out.println(names);

    }
}
