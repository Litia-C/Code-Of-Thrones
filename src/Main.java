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
        int clase;
        System.out.println("¡Bienvenido!");
        System.out.println("Escribe tu nombre Jugador1:");
        nombre1 = miau.next();
        System.out.println("¿Que clase escoges?");
        System.out.println("1: Guerrero");
        System.out.println("2: Mago");
        System.out.println("3: Bestia");
        clase = miau.nextInt();
/*        switch (clase){
            case 1:
                Guerrero j1 = new Guerrero(nombre);
                break;
            case 2:
                Mago j1 = new Mago(nombre);
                break;
            case 3:
                Bestia j1 = new Bestia(nombre);
                break;
        }
*/
        System.out.println("Ahora, el oponente");
        System.out.println("Escribe tu nombre Jugador2:");
        nombre2 = miau.next();
        System.out.println("¿Que clase escoges?");
        System.out.println("1: Guerrero");
        System.out.println("2: Mago");
        System.out.println("3: Bestia");
        clase = miau.nextInt();
        /*
        if (clase == 1){
            Guerrero j2 = new Guerrero(nombre);
        }
        if (clase==2){
            Mago j2 = new Mago(nombre);
        }
        if (clase == 3){
            Bestia j2 = new Bestia(nombre);
        }*/
        batalla(nombre1, nombre2);
    }
    public static void batalla(String nombre1, String nombre2){
        Scanner inp = new Scanner(System.in);
        Guerrero j1 = new Guerrero(nombre1);
        Mago j2 = new Mago(nombre2);
        boolean pass;
        do {
            pass = false;
            System.out.println(nombre1 + " ¿Qué quieres hacer");
            System.out.println("1: Inspeccionar enemigo");
            int ataque = inp.nextInt();

            switch (ataque){
                case 1 -> j2.check();
                case 2 -> j2.atacar(j1.getDano());
            }
        }while (!pass);
    }
}