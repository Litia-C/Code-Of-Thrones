package jugadores;

public class Guerrero extends Jugador {
    protected int resist;

    public Guerrero(String nom) {
        super(nom, 1, 15, false, 3);
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
    public void check() {
        System.out.println("El guerrero observa con atención...");
        super.check();
        System.out.println("Resistencia: " +resist);

    }
}
