package jugadores;

public class Mago extends Jugador{
    private int mana;

    public Mago(String nom){
        super(nom, 1, 10, false, 2, "mago");
        this.mana = 10;
    }

    // Acciones


    @Override
    public void check(String clase) {
        super.check(clase);
        System.out.println("Maná: " + mana);
    }
}
