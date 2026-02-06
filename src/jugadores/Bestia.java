package jugadores;

import java.util.Scanner;

public class Bestia extends Jugador implements Acciones{
        private int impaciencia;
    public Bestia(String nom) {
        super(nom, 1, 20, false, 5, "bestia");
        this.impaciencia = 0;
    }
    @Override
    public int atacar(int hpEnemigo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ataque quieres hacer?");
        System.out.println("1: Ataque básico");
        return hpEnemigo;
    }


}
