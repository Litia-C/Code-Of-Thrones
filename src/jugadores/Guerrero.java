package jugadores;

public class Guerrero extends Jugador {
    protected int resist;

    public Guerrero(String nom) {
        super(nom, 1, 15, false, 3);
        this.resist = 1;
    }

}
