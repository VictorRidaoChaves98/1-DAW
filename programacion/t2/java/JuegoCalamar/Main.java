public class Main {
    
    public static void main(String[] args) {

        Juego juegoCalamar = new Juego(100000000,  , null)
        MiniJuego primerJuego = new MiniJuego("Green light, Red light", "Como tem muevas te matan", 7, false, 250);

        System.out.println(primerJuego.toString());

        Jugador j1 = new Jugador("El viejo,", 1, 45454, 1, true);
        Jugador j2 = new Jugador("El joven", 2, 454546, 0, true);
        j1.jugar();

        if (j1.getVivo()){

            System.out.println("El jugador " + j1.getNombre() + " sigue vivo.");
        }
        else{

            System.out.println("El jugador " + j1.getNombre() + " lo han matado.");
        }

        System.out.println(j1.toString());
    }
}
