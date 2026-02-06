package jugadores;

import java.util.Scanner;

public class Mago extends Jugador implements Acciones{
    private int mana;

    public Mago(String nom){
        super(nom, 1, 10, false, 2, Clases.mago);
        this.mana = 10;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    // Acciones


    @Override
    public void check(Clases clase) {
        super.check(clase);
        System.out.println("Maná: " + mana);
    }

    @Override
    public int atacar(int hpEnemigo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ataque quieres hacer?");
        System.out.println("1: Ataque básico");
        System.out.println("2: Aumentar maná");
        System.out.println("3: Aumentar vida");
        System.out.println("4: Usar carta");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Usas tu bastón");
                hpEnemigo -= getDano();
                System.out.println(getDano() + " de daño ha sido inflingido");
                break;
            case 2:
                System.out.println("Cierras los ojos y recitas un hechizo");
                setMana(getMana()+5);
                break;
            case 3:
                System.out.println("Sacas hierbas curativas");
                setHp(getHp()+4);
                break;

        }
        return hpEnemigo;
    }
}
