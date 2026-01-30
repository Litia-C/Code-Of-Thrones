package jugadores;

public class Guerrero extends Jugador {
    protected int resist;

    public Guerrero(String nom, int nivel, int hp, int resist) {
        super(nom, nivel, hp);
        this.resist = 0;
    }
}
