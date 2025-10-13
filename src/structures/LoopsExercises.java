package structures;

import java.util.*;
import java.util.Arrays;

public class LoopsExercises {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando  while
        int index = 1;
        System.out.println("numeros del 1 al 10 con el while");
        while (index <= 10) {
            System.out.println(index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList

        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;
        System.out.println("Usa do-while para mostrar todos los valores de un ArrayList");
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);

        // 3. Imprime los múltiplos del 5 del 1 al 50 utilizando un for
        System.out.println("Imprime los múltiplos del 5 del 1 al 50 utilizando un for");
        for (i = 1; i <= 10; i++) {
            System.out.println(i * 5);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total
        System.out.println("Recorre un Array de 5 números e imprime la suma total");
        int[] numbers2 = {5, 10, 20};
        int result = 0;
        for (Integer number : numbers2) {
            result += number;
        }
        System.out.println(result);

        // 5. Usa un for para recorrer un Array y mostrar sus valores
        System.out.println("Usa un for para recorrer un Array y mostrar sus valores");

        int[] arrayNumber = new int[3];
        arrayNumber[0] = 50;
        arrayNumber[1] = 100;
        arrayNumber[2] = 200;

        for (i=0; i< arrayNumber.length; i++) {
            System.out.println(arrayNumber[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap

        System.out.println("Usa for-each para recorrer un HashSet y un HashMap");
        HashSet<String> namesSet = new HashSet<>(Arrays.asList("Dayron", "Saily", "Tone","Amanda"));

        HashMap<String, Integer> phonesMap = new HashMap<>();
        phonesMap.put("Carola", 1);
        phonesMap.put("Yoly", 2);
        phonesMap.put("Erne", 3);
        phonesMap.put("Aarón", 4);

        System.out.println("Recorrer HashSet");
        for (String name : namesSet) {
            System.out.println(name);
        }
        System.out.println("Recorrer HashMap");
        for(Map.Entry<String,Integer> phone : phonesMap.entrySet()){
            System.out.println(phone);
        }

        // 7. Imprime los números del 10 al 1 de forma descendiente con un for
        System.out.println("Imprime los números del 10 al 1 de forma descendiente con un for");
        for (int j = 10; j > 0 ; j--) {
            System.out.println(j);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20
        System.out.println("Usa continue para saltar los múltiplos de 3 del 1 al 20");
        for (int j = 1; j <= 10; j++) {
            result = j * 3;
            if(result < 20) {
                continue;
            }
            System.out.println(result);
        }


        // 9. Usa break para de tener un bucle cuando encuentres un número negativo en un Array

        System.out.println("Usa break para de tener un bucle cuando encuentres un número negativo en un Array");
        int[] numbers3 = {1,2,3,-4,5,6};
        for (int number : numbers3) {
            if (number < 0) {
                break;
            }
            System.out.println(number);
        }

        //10. Crea un programa que calcule el factorial de un número dado
        System.out.println("Crea un programa que calcule el factorial de un número dado");
        int numeroDado = 5;
        int resultadoFactorial = numeroDado;
        for (int j = numeroDado -1; j > 1 ; j--) {
            resultadoFactorial*=j;
        }
        System.out.println(resultadoFactorial);

    }
}






