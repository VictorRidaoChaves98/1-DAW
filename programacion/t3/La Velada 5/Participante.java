public abstract class Participante {
    protected String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void presentarse(); // obligatorio en subclases

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
