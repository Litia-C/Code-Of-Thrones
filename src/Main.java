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
        Jugador j1;
        Jugador j2;
        switch (clase1){
            case "guerrero" -> j1 = new Guerrero(nombre1);
            case "mago" -> j1 = new Mago(nombre1);
            case "bestia" -> j1 = new Bestia(nombre1);
            default ->throw new IllegalStateException("Unexpected value: " + clase1);
        }
        j1.setNom(nombre1);
        switch (clase2){
            case "guerrero" -> j2 = new Guerrero(nombre1);
            case "mago" -> j2 = new Mago(nombre1);
            case "bestia" -> j2 = new Bestia(nombre1);
            default -> throw new IllegalStateException("Unexpected value: " + clase2);
        }
        j2.setNom(nombre2);
        Scanner act = new Scanner(System.in);

        boolean pass;
        boolean vivo = true;
        do {

            if (vivo) {
                do {
                    pass = false;
                    System.out.println(nombre1 + " ¿Qué quieres hacer");
                    System.out.println("1: Inspeccionar enemigo (0)");
                    System.out.println("2: Atacar sin más (0)");
                    System.out.println("3: ");
                    int ataque = act.nextInt();

                    switch (ataque) {
                        case 1:
                            j2.check(clase1);
                            break;
                        case 2:
                            j2.atacar(j1.getDano());
                            pass = true;
                            break;
                    }
                } while (!pass);
                if (j1.getHp() < 1 || j2.getHp() < 1) {
                    vivo = false;
                }
            }
            if (vivo) {
                do {
                    pass = false;
                    System.out.println(nombre2 + " ¿Qué quieres hacer");
                    System.out.println("1: Inspeccionar enemigo (0)");
                    System.out.println("2: Atacar sin más (0)");
                    System.out.println("3: ");
                    int ataque = act.nextInt();

                    switch (ataque) {
                        case 1:
                            j1.check(clase2);
                            break;
                        case 2:
                            j1.atacar(j2.getDano());
                            pass = true;
                            break;
                    }
                } while (!pass);
                if (j1.getHp() < 1 || j2.getHp() < 1) {
                    vivo = false;
                }
            }
        }while (vivo);

        System.out.println("Fin de la partida");

    }
}