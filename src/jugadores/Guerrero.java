package jugadores;

import java.util.Scanner;

public class Guerrero extends Jugador implements Acciones {
    protected int resist;

    public Guerrero(String nom) {
        super(nom, 1, 15, false, 3, Clases.guerrero);
        this.resist = 1;
    }

    public int getResist() {
        return resist;
    }

    public void setResist(int resist) {
        this.resist = resist;
    }

    // Acciones


    @Override
    public void check(Clases clase) {
        super.check(clase);
        System.out.print("Resistencia: " + resist);
        System.out.println();
    }

    @Override
    public int atacar(int hpEnemigo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ataque quieres hacer?");
        System.out.println("1: Ataque básico");
        System.out.println("2: Afilar espada (ataque +1)");
        System.out.println("3: Pulir armadura (defensa + 1)");
        System.out.println("4: Usar carta");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Usas tu espada");
                hpEnemigo -= getDano();
                System.out.println(getDano() + " de daño ha sido inflingido");
                break;
            case 2:
                System.out.println("Afilas tu espada");
                setDano(getDano()+2);
                break;
            case 3:
                System.out.println("Limpias tu armadura");
                setResist(getResist()+1);
                break;

        }
        return hpEnemigo;
    }
}
