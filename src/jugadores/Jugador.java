package jugadores;

import java.util.Scanner;

public abstract class Jugador {

    protected String nom;
    protected int nivel;
    protected int hp;
    protected boolean ven;
    protected int dano;
    protected Clases tipo;

    public Jugador(String nom, int nivel, int hp, boolean ven, int dano, Clases tipo) {
        this.nom = nom;
        this.nivel = nivel;
        this.hp = hp;
        this.ven = ven;
        this.dano = dano;
        this.tipo = tipo;
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
    public void check (Clases clase){
        switch (clase){
            case Clases.guerrero -> System.out.println("Te concentras en tu enemigo...");
            case Clases.mago -> System.out.println("Observas dentro de tu orbe...");
            case Clases.bestia -> System.out.println("Olisqueas a tu adversario...");
        }
        System.out.println("Estadísticas del adversario:");
        System.out.println("Nombre: "+nom);
        System.out.println("Vida restante: "+hp);
        System.out.println("Ataque: "+dano);
        System.out.println("Nivel: "+nivel);
    }
    public void recibirDano(int ataque){
        System.out.println("Ataca");
        this.hp-= ataque;
    }
    public void esperar(){
        System.out.println("No haces nada (Supongo)");
    }

    public abstract int atacar(int hpEnemigo);
}
