package jugadores;

public class Mago extends Jugador{
    private int mana;

    public Mago(String nom, int nivel, int hp, int mana){
        super(nom, 1, 10, false, 2);
        this.mana = 10;
    }
}
