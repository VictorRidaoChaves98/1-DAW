package Armas;

public class Melee
{
    private String nombre;
    private int daño;
    private int tamaño;
    private int desgaste;
    public Melee(String nombre, int daño, int tamaño, int desgaste) {
        this.nombre = nombre;
        this.daño = daño;
        this.tamaño = tamaño;
        this.desgaste = desgaste;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public int getDesgaste() {
        return desgaste;
    }
    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }
    @Override
    public String toString() {
        return "Melee [nombre=" + nombre + ", daño=" + daño + ", tamaño=" + tamaño + ", desgaste=" + desgaste + "]";
    }

    
}
