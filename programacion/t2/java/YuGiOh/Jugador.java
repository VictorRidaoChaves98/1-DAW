package YuGiOh;

import java.awt.SystemColor;
import java.util.Arrays;

public class Jugador
{
    private String nombre;
    private Carta[] mano;
    private Carta[] baraja;
    private Carta[] robarCarta;
    private Carta[] jugarCarta;
    private Carta[] atacar;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void setMano(Carta[] mano) {
        this.mano = mano;
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void setBaraja(Carta[] baraja) {
        this.baraja = baraja;
    }

    public Carta[] getRobarCarta() {
        return robarCarta;
    }

    public void setRobarCarta(Carta[] robarCarta) {
        this.robarCarta = robarCarta;
    }

    public Carta[] getJugarCarta() {
        return jugarCarta;
    }

    public void setJugarCarta(Carta[] jugarCarta) {
        this.jugarCarta = jugarCarta;
    }

    public Carta[] getAtacar() {
        return atacar;
    }

    public void setAtacar(Carta[] atacar) {
        this.atacar = atacar;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + ", baraja=" + Arrays.toString(baraja)
                + ", robarCarta=" + Arrays.toString(robarCarta) + ", jugarCarta=" + Arrays.toString(jugarCarta)
                + ", atacar=" + Arrays.toString(atacar) + "]";
    }

    
    

}

