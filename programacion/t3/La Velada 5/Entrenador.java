public class Entrenador extends Participante {
    private Boxeador boxeador;

    // Constructor
    public Entrenador(String nombre, Boxeador boxeador) {
        super(nombre);
        this.boxeador = boxeador;
    }

    // Presentación
    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + ", el entrenador de " + boxeador.getNombre() + ".");
    }

    // Motiva al boxeador (mejora sus estadísticas)
    public void motivarBoxeador() {
        System.out.println(nombre + " está motivando a " + boxeador.getNombre() + "...");
        boxeador.mejorarEstadisticas();
    }

    // Getter (opcional)
    public Boxeador getBoxeador() {
        return boxeador;
    }
}
