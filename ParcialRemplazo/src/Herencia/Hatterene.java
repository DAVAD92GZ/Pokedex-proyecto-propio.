package Herencia;

public class Hatterene extends Hada {
    private String ataqueDelPokemon = "psychoCut";
    private String counters = "acero y veneno";

    private static int minVida = 40;
    private static int maxVida = 100;

    private static int minDano = 60;
    private static int maxDano = 130;

    private static int minVelocidad = 20;
    private static int maxVelocidad = 80;

    public Hatterene() {
        super(90, 57, 29, "fairyWind", "dazzlingGleam");
        this.ataqueDelPokemon = "psychoCut";
        this.counters = "acero y veneno";
    }

    public Hatterene(int dano, int vida, int velocidad, String ataqueRapido, String ataqueExclusivo) {
        super(dano, vida, velocidad, ataqueRapido, ataqueExclusivo);
        this.ataqueDelPokemon = "psychoCut";
        this.counters = "acero y veneno";
    }

    public int esFuerte(int dano, int vida, int velocidad) {
        if (vida > 70 && dano > 80) {
            System.out.println(" es fuerte, dejalo descansar un poco no ?");
            return 1;
        } else {
            System.out.println("Pon a trabajar a ese pokemon que esta gordo.");
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
        System.out.println(" El pokemon Hatterene tiene Vida = " + getVida() +" Daño = " + getDano() +" Velocidad = " + getVelocidad() + " con el ataque Exclusivo del tipo hada " + getAtaqueExclusivo() +" y el ataque del pokemon " + getAtaqueDelPokemon());
    }

    protected int getMinVida() { return minVida; }
    protected int getMaxVida() { return maxVida; }
    protected int getMinDano() { return minDano; }
    protected int getMaxDano() { return maxDano; }
    protected int getMinVelocidad() { return minVelocidad; }
    protected int getMaxVelocidad() { return maxVelocidad; }
}

