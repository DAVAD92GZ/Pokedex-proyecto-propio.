package Herencia;

public abstract class Hada extends Pokemones {

    private String ataqueExclusivo = "dazzlingGleam";

    public Hada(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
        super(dano, vida, velocidad, ataqueRapido);
        this.ataqueExclusivo = ataqueExclusivo;
    }

    public String getAtaqueExclusivo() {
        return ataqueExclusivo;
    }

    public void setAtaqueExclusivo(String ataqueExclusivo) {
        this.ataqueExclusivo = ataqueExclusivo;
    }

    public void verStats() {
        System.out.println(" El pokemon tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo hada " + getAtaqueExclusivo() + " y el ataque rapido " + getAtaqueRapido()
        );
    }
}
