public class Planeta {
    private String nombre;
    private int numeroSaltosRequeridos;

    // Constructor
    public Planeta(String nombre, int numeroSaltosRequeridos) {
        this.nombre = nombre;
        this.numeroSaltosRequeridos = numeroSaltosRequeridos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSaltosRequeridos() {
        return numeroSaltosRequeridos;
    }

    public void setNumeroSaltosRequeridos(int numeroSaltosRequeridos) {
        this.numeroSaltosRequeridos = numeroSaltosRequeridos;
    }

    @Override
    public String toString() {
        return nombre + " (Saltos requeridos: " + numeroSaltosRequeridos + ")";
    }
}
