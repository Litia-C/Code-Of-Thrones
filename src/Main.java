import jugadores.Bestia;
import jugadores.Guerrero;
import jugadores.Jugador;
import jugadores.Mago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miau = new Scanner(System.in);

        String nombre1;
        String nombre2;
        String clase1 = null;
        String clase2 = null;
        System.out.println("¡Bienvenido!");
        System.out.println("Escribe tu nombre Jugador1:");
        nombre1 = miau.next();
        System.out.println("¿Que clase escoges?");
        System.out.println("1: Guerrero");
        System.out.println("2: Mago");
        System.out.println("3: Bestia");
        int clase = miau.nextInt();
        switch (clase){
            case 1:
                clase1 = "guerrero";
                break;
            case 2:
                clase1 = "mago";
                break;
            case 3:
                clase1 = "bestia";
                break;
        }

        System.out.println("Ahora, el oponente");
        System.out.println("Escribe tu nombre Jugador2:");
        nombre2 = miau.next();
        System.out.println("¿Que clase escoges?");
        System.out.println("1: Guerrero");
        System.out.println("2: Mago");
        System.out.println("3: Bestia");
        clase = miau.nextInt();
        if (clase == 1){
            clase2 = "guerrero";
        }
        if (clase==2){
            clase2 = "mago";
        }
        if (clase == 3){
            clase2 = "bestia";
        }
        batalla(nombre1, nombre2, clase1, clase2);
    }
    public static void batalla(String nombre1, String nombre2, String clase1, String clase2){
        Scanner inp = new Scanner(System.in);
        Guerrero j1 = new Guerrero(nombre1);
        Mago j2 = new Mago(nombre2);
        boolean pass;
        do {
            pass = false;
            System.out.println(nombre1 + " ¿Qué quieres hacer");
            System.out.println("1: Inspeccionar enemigo (0)");
            System.out.println("2: Atacar sin más (0)");
            System.out.println("3: ");
            int ataque = inp.nextInt();

            switch (ataque){
                case 1 -> j2.check(clase1);
                case 2 -> j2.atacar(j1.getDano());
            }
        }while (!pass);
    }
}