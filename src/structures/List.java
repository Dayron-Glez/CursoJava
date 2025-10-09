package structures;
import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        //Declaración y creación
        ArrayList<String> names = new ArrayList<>(); // Sintaxís clásica
        var numbers = new ArrayList<Integer>(); // Sintaxis nueva

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.addFirst("Dayron");
        System.out.println(names.size());
        names.add("González");

        //Acceder a los elementos
        System.out.println(names.getFirst());

        //Modificar los elementos

        names.set(0,"Killerbee");
        System.out.println(names.getFirst());

        // Eliminar

        names.removeFirst();

        System.out.println(names.getFirst());
        
        // Buscar elementos

        System.out.println(names.contains("González"));
        System.out.println(names.contains("2"));

        // Limpiar arrayList

        names.clear();
        System.out.println(names.size());

    }
}
