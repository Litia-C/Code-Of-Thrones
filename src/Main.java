import jugadores.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miau = new Scanner(System.in);

        String nombre1;
        String nombre2;
        Clases clase1 = null;
        Clases clase2 = null;
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
                clase1 = Clases.guerrero;
                break;
            case 2:
                clase1 = Clases.mago;
                break;
            case 3:
                clase1 = Clases.bestia;
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
            clase2 = Clases.guerrero;
        }
        if (clase==2){
            clase2 = Clases.mago;
        }
        if (clase == 3){
            clase2 = Clases.bestia;
        }
        batalla(nombre1, nombre2, clase1, clase2);
    }
    public static void batalla(String nombre1, String nombre2, Clases clase1, Clases clase2){
        Jugador j1;
        Jugador j2;
        switch (clase1){
            case Clases.guerrero -> j1 = new Guerrero(nombre1);
            case Clases.mago -> j1 = new Mago(nombre1);
            case Clases.bestia -> j1 = new Bestia(nombre1);
            default ->throw new IllegalStateException("Unexpected value: " + clase1);
        }
        j1.setNom(nombre1);
        switch (clase2){
            case Clases.guerrero -> j2 = new Guerrero(nombre1);
            case Clases.mago -> j2 = new Mago(nombre1);
            case Clases.bestia -> j2 = new Bestia(nombre1);
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
                    System.out.print(nombre1);
                    System.out.print(" HP: " + j1.getHp());
                    System.out.println();
                    System.out.println(nombre1 + " ¿Qué quieres hacer");
                    System.out.println("1: Inspeccionar (No pasa turno)");
                    System.out.println("2: Habilidades");
                    System.out.println("3: No hacer nada");
                    int acto = act.nextInt();
                    int ataque = 0;
                    switch (acto) {
                        case 1:
                            j2.check(clase1);
                            break;
                        case 2:
                            j2.setHp(j1.atacar(j2.getHp()));
                            pass = true;
                            break;
                        case 3:
                            j1.esperar();
                            pass = true;
                    }
                } while (!pass);

                if (j1.getHp() < 1 || j2.getHp() < 1) {
                    vivo = false;
                }
            }
            if (vivo) {
                do {
                    pass = false;
                    System.out.print(nombre2);
                    System.out.print(" HP: " + j2.getHp());
                    System.out.println();
                    System.out.println(nombre2 + " ¿Qué quieres hacer");
                    System.out.println("1: Inspeccionar (No pasa turno)");
                    System.out.println("2: Habilidades");
                    System.out.println("3: No hacer nada");
                    int acto = act.nextInt();

                    switch (acto) {
                        case 1:
                            j1.check(clase2);
                            break;
                        case 2:
                            j1.setHp(j2.atacar(j1.getHp()));
                            pass = true;
                            break;
                        case 3:
                            j2.esperar();
                            pass = true;
                    }
                } while (!pass);
                if (j1.getHp() < 1 || j2.getHp() < 1) {
                    vivo = false;
                }
            }
        }while (vivo);
        if (j1.getHp() < 1){
            System.out.println("Ha ganado: " + nombre2);
        }
        if (j2.getHp() < 1){
            System.out.println("Ha ganado: " + nombre1);
        }
        System.out.println("Fin de la partida");

    }
}