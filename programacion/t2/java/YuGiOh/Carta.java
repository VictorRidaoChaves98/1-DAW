package YuGiOh;

import java.util.Arrays;

public class Carta
{
    private String nombre;
    private int ataque;
    private int defensa;
    private String posicion;
    private boolean oculto;
    private atacar[] atacar;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public boolean isOculto() {
        return oculto;
    }
    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }

    public atacar[] getAtacar() {
        return atacar;
    }

    public void setAtacar(atacar[] atacar) {
        this.atacar = atacar;
    }
    @Override
    public String toString() {
        return "Carta [nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", posicion=" + posicion
                + ", oculto=" + oculto + ", atacar=" + Arrays.toString(atacar) + "]";
    }
    
    

    
}


