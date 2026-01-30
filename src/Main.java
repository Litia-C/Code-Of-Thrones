import jugadores.Jugador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miau = new Scanner(System.in);
        String nombre;
        String clase;
        System.out.println("¡Bienvenido!");
        System.out.println("Escribe tu nombre Jugador1:");
        nombre = miau.next();
        System.out.println("¿Que clase escoges?");
        System.out.println("1: Guerrero");
        System.out.println("2: Mago");
        System.out.println("3: Bestia");
        clase = miau.next();
        if (clase.equals(1)){
            clase = "Guerrero";
        }
        if (clase.equals(2)){
            clase = "Mago";
        }
        if (nombre.equals(3)){
            clase
        }


    }
}