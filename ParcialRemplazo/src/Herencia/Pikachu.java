package Herencia;

public class Pikachu extends Electrico {
    private String ataqueDelPokemon = "volt tackle";
    private String counters = "tierra";

    private static int minVida = 20;
    private static int maxVida = 70;

    private static int minDano = 30;
    private static int maxDano = 100;

    private static int minVelocidad = 50;
    private static int maxVelocidad = 130;

    public Pikachu(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
        super(55, 35, 90, "quickAttack", "thunder");
        this.ataqueDelPokemon = "volt tackle";
        this.counters = "tierra";
    }

    public int esFuerte(int dano, int vida, int velocidad) {
        if (vida > 70 && dano > 80) {
            System.out.println("Pikachu es fuerte, podrias usarlo como bateria electrica para un barco.");
            return 1;
        } else {
            System.out.println("esta muy debil, no te da ni para cargar un celular.");
            return 0;
        }
    }

    public String getAtaqueDelPokemon() {
        return ataqueDelPokemon;
    }

    public void setAtaqueDelPokemon(String ataqueDelPokemon) {
        this.ataqueDelPokemon = ataqueDelPokemon;
    }

    public String getCounters() {
        return counters;
    }

    public void setCounters(String counters) {
        this.counters = counters;
    }

    public void verStats() {
        System.out.println(" El pokemon Pikachu tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo electrico " + getAtaqueExclusivo() +" y el ataque del pokemon " + getAtaqueDelPokemon()
        );
    }

    protected int getMinVida() {
    	return minVida; 
    	}
    protected int getMaxVida() {
    	return maxVida; 
    	}
    protected int getMinDano() {
    	return minDano; 
    	}
    protected int getMaxDano() {
    	return maxDano; 
    	}
    protected int getMinVelocidad() { 
    	return minVelocidad;
    	}
    protected int getMaxVelocidad() {
    	return maxVelocidad; 
    	}
}
