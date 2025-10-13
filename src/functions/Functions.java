package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        // Funciones
        for (int i = 0; i <5 ; i++) {
            sendEmail();
        }

        sendEmailToUser("dayron@gmail.com", "Dayron");

        var emails = new ArrayList<>(Arrays.asList("Dayron", "Erne"));
        sendEmailToUser(emails);

        var state = sendEmailVerification("dayron@gmail.com");
        System.out.println("Email sent: " + state);
    }
    // Funcción sin parámetros y sin retorno
    public static void sendEmail() {
        System.out.println("Sending email...");
    }

    // Función con parámetros y sin retorno
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Sending email to " + email + " with name " + name);
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for(String email : emails) {
            System.out.println("Sending email to " + email);
        }
    }

    // Función con parámetros y con retorno

    public static boolean sendEmailVerification(String email){
        System.out.println("Sending email verification to " + email);
        return true;
    }
}
