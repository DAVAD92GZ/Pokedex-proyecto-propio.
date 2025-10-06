package Herencia;

public class Charizard extends Fuego {
    private String ataqueDelPokemon = "Blast Burn";
    private String counters = "Agua, Roca";

    private static int minVida = 50;
    private static int maxVida = 120;

    private static int minDano = 50;
    private static int maxDano = 130;

    private static int minVelocidad = 40;
    private static int maxVelocidad = 120;

    public Charizard(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
        super(84, 78, 100, "ember", "Sacred Fire");
        this.ataqueDelPokemon = "Blast Burn";
        this.counters = "Agua, Roca";
    }

    public int esFuerte(int dano, int vida, int velocidad) {
        if (vida > 70 && dano > 80) {
            System.out.println("Es demaciado fuerte, tienes que echarle un poco de agua.");
            return 1;
        } else {
            System.out.println("Charizard tiene que entrenar mas, esta flacom y debil.");
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
        System.out.println(" El pokemon Charizard tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() +" con el ataque Exclusivo del tipo fuego " + getAtaqueExclusivo() +" y el ataque del pokemon " + getAtaqueDelPokemon());
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
