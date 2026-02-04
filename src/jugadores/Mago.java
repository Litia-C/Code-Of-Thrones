package jugadores;

public class Mago extends Jugador{
    private int mana;

    public Mago(String nom){
        super(nom, 1, 10, false, 2);
        this.mana = 10;
    }

    // Acciones


    @Override
    public void atacar(int ataque) {
        super.atacar(ataque);
    }
}
