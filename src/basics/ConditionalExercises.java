package basics;

public class ConditionalExercises {
    public static void main(String[] args) {
        //1. Establece la edad de un usuario y muestra si puede votar
            int edadUsuario =17;
            if(edadUsuario>=18){
                System.out.println("El usuario puede votar");
            } else {
                System.out.println("El usuario no puede votar");
            }
        //2. Declara dos números y muestra cuál es el mayor, o si son iguales
            int primerNum =3;
            int segundoNUm = 5;
            if(primerNum > segundoNUm) {
                System.out.println(primerNum + " es mayor que " + segundoNUm);
            } else if( primerNum == segundoNUm) {
                System.out.println(primerNum + " son iguales " + segundoNUm);
            } else {
                System.out.println(segundoNUm + " es mayor  que " + primerNum);
            }
        //3. Dado un número, verifica si es positivo, negativo o cero
            int num = 6;
            if(num>0) {
                System.out.println(num + " es mayor que 0");
            } else if (num<0) {
                System.out.println(num + " es negativo");
            } else {
                System.out.println(num + " es 0");
            }
        //4. Crea un programa que diga si un número es par o impar
            int parOImpar = 6;
            int resto = parOImpar % 2;
            if (resto == 0) {
                System.out.println("El número " + parOImpar + " es par");
            } else {
                System.out.println("EL número " + parOImpar + " es impar");
            }
        //5. Verifica si un número está en el rango de 1-100
            int numeroRango = 69;
            if(numeroRango >=1 && numeroRango <=100) {
                System.out.println("El número " + numeroRango + " está en el rango de 1-100");
            } else {
                System.out.println("El número " + numeroRango + " no está en el rango de 1-100");

            }
        //6. Declara una variable con el día de la semana (1-7) y muestra su nombre con un switch
            int diaSemana = 3;

            switch (diaSemana) {
                case (1):
                    System.out.println("Lunes");
                    break;
                case (2):
                    System.out.println("Martes");
                    break;
                case (3):
                    System.out.println("Miercoles");
                    break;
                case (4):
                    System.out.println("Jueves");
                    break;
                case (5):
                    System.out.println("Viernes");
                    break;
                case (6):
                    System.out.println("Sábado");
                    break;
                case (7):
                    System.out.println("Domingo");
                    break;
            }
        //7. Simula un sistema de notas: Muestra Sobresaliente, Aprobado o Suspenso segúm la nota (0-100)
            int notaEstudiante = 59;
            String sobresaliente = "Sobresaliente";
            String aprobado = "Aprobado";
            String suspenso = "Suspenso";
            if(notaEstudiante >=85) {
                System.out.println("Nota " + sobresaliente);
            } else if (notaEstudiante <85 && notaEstudiante >=60) {
                System.out.println(aprobado);
            } else {
                System.out.println(suspenso);
            }
        //8.Crea un programa que determine si puedes ir al cine( Debes de tener al menos 15 años o ir acompañado)
            int edadNiño = 14;
            boolean isAcompañado = true;

            if( edadNiño >=15) {
                System.out.println("Puede ir al cine");
            } else if (edadNiño < 15 && isAcompañado) {
                System.out.println("Puede ir al cine");
            } else {
                System.out.println("No puede ir al cine");

            }
        //9. Crea un programa que diga si una letra es vocal o consonante
            char letter = 'a';

            switch (letter) {
                case ('a'):
                    System.out.println("es vocal");
                    break;
                case ('e'):
                    System.out.println("es vocal");
                    break;
                case ('i'):
                    System.out.println("es vocal");
                    break;
                case ('o'):
                    System.out.println("es vocal");
                    break;
                case ('u'):
                    System.out.println("es vocal");
                    break;

                default:
                    System.out.println("es consonante");
            }
        //10. Usa tres variables a,b o c y muestra cual es el mayor
        int a = 2;
        int b = 5;
        int c = 1;

        if(a > b && a > c){
            System.out.println(a + " es mayor que " + b + " y " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " es mayor que " + a + " y " + c);
        } else {
            System.out.println(c + " es mayor que " + a + " y " + b);

        }
    }
}
