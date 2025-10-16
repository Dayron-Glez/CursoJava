package oop.composition;

public class Composition {
    public static void main(String[] args) {
        // Composición
       Motor miMotor = new MotorDiesel();
       Coche miCoche = new Coche(miMotor);
       miCoche.encender();

       // Facilmente puedo crear otro coche con otro motor

       Motor otroMotor = new MotorElectrico();
       Coche tesla = new Coche(otroMotor);
       tesla.encender();

    }
    /*
    * Primero definimos una interface para el motor con los métodos generales de cualquier motor
    * Es una buena práctica programar contra interfaces
    * */
    interface Motor {
        void arrancar();
    }

    // Diferentes implementaciones

    public static class MotorDiesel implements Motor {
        @Override
        public void arrancar() {
            System.out.println("Coche Diesel: BRUM BRUM !!!");
        }
    }

    public static class MotorElectrico implements Motor {

        @Override
        public void arrancar() {
            System.out.println("Coche electrico: silencio...");
        }
    }

    public static class Coche {
        private Motor motor; // acá la clave es el polimorfismo, al pasar motor al constructor no nos ligamos a un motor en concreto, ahora puede recibir cualquier tipo de Motor cuando se cree el objeto Coche

        public Coche(Motor motor) {
            this.motor = motor;
        }

        public void encender() {
            System.out.println("Encendiendo coche:");
            motor.arrancar();
        }
    }

}
