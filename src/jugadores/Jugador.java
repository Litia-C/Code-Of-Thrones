package jugadores;

public class Jugador {

    protected String nom;
    protected int nivel;
    protected int hp;
    protected boolean ven;
    protected int dano;

    public Jugador(String nom, int nivel, int hp, boolean ven, int daño) {
        this.nom = nom;
        this.nivel = nivel;
        this.hp = hp;
        this.ven = ven;
        this.dano = dano;
    }

    // Get-Set
    public int getHp() {
        return hp;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNom() {
        return nom;
    }

    public boolean isVen() {
        return ven;
    }

    public int getDano() {
        return dano;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVen(boolean ven) {
        this.ven = ven;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

// Acciones
    public void check (){
        System.out.println(this.nom);
        System.out.println(this.hp);
        System.out.println(this.dano);
        System.out.println(this.nivel);
    }

}
