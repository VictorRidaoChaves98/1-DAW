public class Arbitro extends Participante {
    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public void detenerCombate(Pelea pelea) {
        System.out.println("¡¡¡El Árbitro ha detenido el combate!!!");
        pelea.finalizarCombate();
    }
    
    @Override
    public void presentarse() {
        System.out.println("Buenas tardes, me llamo " + getNombre() + " y soy el arbitro de este combate.");
    }

    @Override
    public String toString() {
        return "Arbitro []";
    }

}