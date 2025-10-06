package Herencia;

public abstract class Planta extends Pokemones {

    private String ataqueExclusivo = "leafStorm";

    public Planta(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
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
        System.out.println(" El pokemon tiene Vida = " + getVida() + " Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo planta " + getAtaqueExclusivo() + " y el ataque rapido " + getAtaqueRapido()
        );
    }
}
