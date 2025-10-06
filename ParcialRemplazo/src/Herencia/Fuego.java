package Herencia;

public abstract class Fuego extends Pokemones {

    private String ataqueExclusivo = "Sacred Fire";

    public Fuego(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
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
    	System.out.println(" El pokemon tiene Vida =" + getVida() +" Daño = " + getDano() + " Velocidad =" + getVelocidad() + " con el ataque Exclusivo del tipo" + getAtaqueExclusivo());
    }

}
