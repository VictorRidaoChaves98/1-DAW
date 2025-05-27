public class Participacion {
    private static final String FACIL = null;
    private static final String MEDIA = null;
    private static final String DIFICL = null;
    private Visitante jugador;
    private int juego;
    private Puntuacion puntuacion;

    public Participacion(int juego, Visitante jugador, Puntuacion puntuacion) {
        this.juego = juego;
        this.jugador = jugador;
        this.puntuacion = puntuacion;
    }

    public Participacion(String mensaje) {
        //TODO Auto-generated constructor stub
    }

    public Visitante getJugador() {
        return jugador;
    }

    public void setJugador(Visitante jugador) {
        this.jugador = jugador;
    }

    public int getJuego() {
        return juego;
    }

    public void setJuego(int juego) {
        this.juego = juego;
    }

    public Puntuacion getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Puntuacion puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean esGanador(){
        switch (juego.getDificultad()){
            case FACIL -> {
                int porcentaje;
                return porcentaje >= 70;
            }

            case MEDIA -> {
                int porcentaje;
                return porcentaje >= 80;
            }

            case DIFICL -> {
                int porcentaje;
                return porcentaje >= 90 || (jugador.isEsVip() && porcentaje >= 80);
            }

        }
        return false;
    }

    public String mostrarResultado(){
        return "Participación de: " + jugador.getNombre() + " en " + juego.getNombre() + " y con una puntuación de: " + puntuacion + "¿Ha ganado? " + (esGanador()? + "SI" : "NO");
    }

    @Override
    public String toString() {
        return "Participacion [jugador=" + jugador + ", juego=" + juego + ", puntuacion=" + puntuacion + "]";
    }

    
}
