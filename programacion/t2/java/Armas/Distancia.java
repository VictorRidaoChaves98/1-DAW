package Armas;

public class Distancia
{
    private String nombre;
    private int danio;
    private double rango;
    private int municion;
    private int capacidad;

    public Distancia(String nombre, int daño, double rango, int municion, int capacidad) {
        this.nombre = nombre;
        this.danio = danio;
        this.rango = rango;
        this.municion = municion;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return danio;
    }

    public void setDaño(int danio) {
        this.danio = danio;
    }

    public double getRango() {
        return rango;
    }

    public void setRango(double rango) {
        this.rango = rango;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Distancia [nombre=" + nombre + ", danio=" + danio + ", rango=" + rango + ", municion=" + municion
                + ", capacidad=" + capacidad + "]";
    }

    
}
