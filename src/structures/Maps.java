package structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer,String>();

        //Tamaño

        System.out.println(names.size());

        names.put("clave1","Dayron");
        names.put("clave2","Yoly");
        names.put("clave3","Erne");
        names.put("clave4","daygongar");

        System.out.println(names);

        //Acceder a los elementos
        System.out.println(names.containsKey("clave1"));

        // Modificar

        names.put("clave1", "killerbee");

        System.out.println(names);

        // Eliminar

//        names.remove("clave4");
        System.out.println(names.remove("clave4"));

        // Limpiar

        names.clear();

        System.out.println(names);
    }
}
