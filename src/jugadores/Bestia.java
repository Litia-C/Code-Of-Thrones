package jugadores;

public class Bestia extends Jugador{
        private int impaciencia;
    public Bestia(String nom) {
        super(nom, 1, 8, false, 5);
        this.impaciencia = 0;
    }
}
