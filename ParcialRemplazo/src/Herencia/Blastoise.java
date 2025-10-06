package Herencia;

public class Blastoise extends Agua {
    private String ataqueDelPokemon = "hydro pume";
    private String counters = "electrico y planta";

    private static int minVida = 50;
    private static int maxVida = 120;

    private static int minDano = 50;
    private static int maxDano = 130;

    private static int minVelocidad = 40;
    private static int maxVelocidad = 120;

    public Blastoise(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
        super(83, 79, 78, "waterSpout", "hydro pume");
        this.ataqueDelPokemon = "hydro pume";
        this.counters = "electrico y planta";
    }

    public int esFuerte(int dano, int vida, int velocidad) {
        if (vida > 70 && dano > 80) {
            System.out.println("El pokemon Blastoise es fuerte, mucho gym por este mes.");
            return 1;
        } else {
            System.out.println("blastoise no es fuerte, tiene que entrenar mas.");
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
        System.out.println(" El pokemon Blastoise tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo agua " + getAtaqueExclusivo() +" y el ataque del pokemon " + getAtaqueDelPokemon());
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

