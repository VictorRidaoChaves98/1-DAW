public class Arbitro extends Participante {

    // Constructor
    public Arbitro(String nombre) {
        super(nombre);
    }

    // Presentación
    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + ", el árbitro de la pelea.");
    }

    // Detiene la pelea (llama a finalizarCombate)
    public void detenerPelea(Pelea pelea) {
        System.out.println(nombre + " ha detenido la pelea.");
        pelea.finalizarCombate();
    }
}
