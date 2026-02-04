package jugadores;

public class Jugador {

    protected String nom;
    protected int nivel;
    protected int hp;
    protected boolean ven;
    protected int dano;

    public Jugador(String nom, int nivel, int hp, boolean ven, int dano) {
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
        System.out.println("Nombre: "+nom);
        System.out.println("Vida restante: "+hp);
        System.out.println("Ataque: "+dano);
        System.out.println("Nivel: "+nivel);
    }
    public void atacar(int ataque){
        System.out.println("Ataca");
        this.hp-= ataque;
    }

}
