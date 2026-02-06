package jugadores;

import java.util.Scanner;

public class Bestia extends Jugador implements Acciones{
        private int impaciencia;
    public Bestia(String nom) {
        super(nom, 1, 20, false, 5, Clases.bestia);
        this.impaciencia = 0;
    }

    public int getImpaciencia() {
        return impaciencia;
    }

    public void setImpaciencia(int impaciencia) {
        this.impaciencia = impaciencia;
    }

    @Override
    public int atacar(int hpEnemigo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que ataque quieres hacer?");
        System.out.println("1: Ataque básico");
        System.out.println("2: Absorber vida");
        System.out.println("3: Calmarse");
        System.out.println("4: Usar carta");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Usas tus garras");
                hpEnemigo -= getDano();
                System.out.println(getDano() + " de daño ha sido inflingido");
                break;
            case 2:
                System.out.println("Abres la boca para morder a tu adversario");
                hpEnemigo -= getDano();
                setHp(getHp()+3);
                System.out.println(getDano() + " de daño ha sido inflingido");
                System.out.println("Te has curado 3 de hp");
                break;
            case 3:
                System.out.println("Miras al cielo");
                setImpaciencia(0);
                System.out.println("Te has calmado por el momento...");
                break;
        }
        return hpEnemigo;
    }


}
