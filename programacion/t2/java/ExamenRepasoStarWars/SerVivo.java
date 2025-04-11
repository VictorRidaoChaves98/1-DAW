// Clase abstracta SerVivo
public abstract class SerVivo {
    protected String nombre;
    protected int defensa;
    protected int salud;

    public SerVivo(String nombre, int defensa) {
        this.nombre = nombre;
        this.defensa = defensa;
        this.salud = 10; // Salud por defecto
    }

    public abstract void recibirDanio(int danio);

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDefensa() {
        return defensa;
    }
}
