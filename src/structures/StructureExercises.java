package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
public class StructureExercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers.length);

        // 2. Modifica uno de los valores del array e imprime el valor de indice antes y después de modificarlo
        System.out.println("Indice 0 antes de modificar su valor" + numbers[0]);
        numbers[0] = 6;
        System.out.println("Indice 0 después de modificar su valor" + numbers[0]);

        // 3. Crea una ArrayList vacío
        var names = new ArrayList<String>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación
        names.add("Dayron");
        names.add("Ernesto");
        names.add("Yoly");
        names.add("Candela");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);

        // 5. Crea un HasSet con dos valores diferentes

        var numbers2 = new HashSet<Integer>();

        numbers2.add(7);
        numbers2.add(8);

        System.out.println(numbers2);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet

        numbers2.add(8);
        numbers2.add(9);

        System.out.println(numbers2);

        // 7. Elimina uno de los elementos del HashSet

        numbers2.remove(9);
        System.out.println(numbers2);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor sea el numero de telefono. Añade 3 contactos

        var contactos = new HashMap<String,Integer>();

        contactos.put("Dayron", 1);
        contactos.put("Erne", 2);
        contactos.put("Yoly", 3);
        System.out.println(contactos);

        // 9. Modifica uno de los contactos y elimina otro

        contactos.replace("Dayron",4);
        System.out.println(contactos);

        contactos.remove("Dayron");
        System.out.println(contactos);


        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales

        String[] array = {"a", "b", "c"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + list);


        HashSet<String> set = new HashSet<>(list);
        System.out.println("HashSet: " + set);

        HashMap<String, String> map = new HashMap<>();
        for (String elemento : set) {
            map.put(elemento, elemento);
        }
        System.out.println("HashMap: " + map);
    }

}
