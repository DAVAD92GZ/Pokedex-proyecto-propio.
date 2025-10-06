package Herencia;
import java.util.Scanner;

public abstract class Pokemones implements AjustableStats {
    Scanner input = new Scanner(System.in);
    private int dano; 
    private int vida; 
    private int velocidad; 
    private String ataqueRapido;

    public Pokemones(int dano, int vida, int velocidad, String ataqueRapido) {
        this.dano = dano;
        this.vida = vida; 
        this.velocidad = velocidad;
        this.ataqueRapido = ataqueRapido; 
    }

    public int getDano() {
        return dano; 
    }
    public int getVida() {
        return vida;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public String getAtaqueRapido() {
        return ataqueRapido;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void setAtaqueRapido(String ataqueRapido) {
        this.ataqueRapido = ataqueRapido;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }

    public boolean setVidaLim(int vidaConfi) {
        if (vidaConfi >= getMinVida() && vidaConfi <= getMaxVida()) {
            this.vida = vidaConfi;
            return true;
        } else {
            return false;
        }
    }
    public boolean setDanoLim(int danoConfi) {
        if (danoConfi >= getMinDano() && danoConfi <= getMaxDano()) {
            this.dano = danoConfi;
            return true; 
        } else {
            return false;
        }
    }
    public boolean setVelocidadLim(int velocidadConfi) {
        if (velocidadConfi >= getMinVelocidad() && velocidadConfi <= getMaxVelocidad()) {
            this.velocidad = velocidadConfi;
            return true; 
        } else {
            return false;
        }
    }

    public void verStats() {
        System.out.println("vida=" + vida + ", dano=" + dano + ", velocidad=" + velocidad + ", ataqueRapido=" + ataqueRapido);
    }

    public boolean esFuerte() {
        return this.vida > 70 && this.dano > 80;
    }

    public void verLims() {
        System.out.println(
            "Limites -> vida: " + getMinVida() + " - " + getMaxVida()
            + ", dano: " + getMinDano() + " - " + getMaxDano()
            + ", velocidad: " + getMinVelocidad() + " - " + getMaxVelocidad()
        );
    }

    protected abstract int getMinVida();
    protected abstract int getMaxVida();
    protected abstract int getMinDano();
    protected abstract int getMaxDano();
    protected abstract int getMinVelocidad();
    protected abstract int getMaxVelocidad();
}

