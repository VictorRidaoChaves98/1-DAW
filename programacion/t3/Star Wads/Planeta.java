public class Planeta {
    private String nombre;
    private int saltosNecesarios;

    public Planeta(String nombre, int saltosNecesarios) {
        this.nombre = nombre;
        this.saltosNecesarios = saltosNecesarios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaltosNecesarios() {
        return saltosNecesarios;
    }

    @Override
    public String toString() {
        return nombre + " (Saltos necesarios: " + saltosNecesarios + ")";
    }
}
