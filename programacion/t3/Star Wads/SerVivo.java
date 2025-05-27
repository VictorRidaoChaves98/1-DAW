public abstract class SerVivo {
    protected String nombre;
    protected int defensa;
    protected int salud = 10;

    public SerVivo(String nombre, int defensa) {
        this.nombre = nombre;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = Math.max(0, salud);
    }

    public abstract void recibirDanio(int danio);

    @Override
    public String toString() {
        return nombre + " (" + salud + " salud)";
    }
}
