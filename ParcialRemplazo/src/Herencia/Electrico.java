package Herencia;

public abstract class Electrico extends Pokemones {

    private String ataqueExclusivo = "thunder";

    public Electrico(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
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
        System.out.println(" El pokemon tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo electrico " + getAtaqueExclusivo() +" y el ataque rapido " + getAtaqueRapido());
    }
}
