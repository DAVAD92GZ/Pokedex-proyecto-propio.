package Herencia;

public class Snivy extends Planta {
    private String ataqueDelPokemon = "frenzy plant";
    private String counters = "fuego, hielo, volador, veneno";

    private static int minVida = 30;
    private static int maxVida = 80;

    private static int minDano = 30;
    private static int maxDano = 80;

    private static int minVelocidad = 30;
    private static int maxVelocidad = 100;

    public Snivy(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
        super(45, 45, 63, "vineWhip", "leafStorm");
        this.ataqueDelPokemon = "frenzy plant";
        this.counters = "fuego, hielo, volador, veneno";
    }

    public int esFuerte(int dano, int vida, int velocidad) {
        if (vida > 70 && dano > 80) {
            System.out.println("Snivy es fuerte, dejalo descansar.");
            return 1;
        } else {
            System.out.println("Sacalo a tomar el sol porque esta debil.");
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
        System.out.println(" El pokemon Snivy tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo planta " + getAtaqueExclusivo() +" y el ataque del pokemon " + getAtaqueDelPokemon());
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
    	return maxDano; }
    protected int getMinVelocidad() {
    	return minVelocidad; 
    	}
    protected int getMaxVelocidad() {
    	return maxVelocidad; 
    	}
}
