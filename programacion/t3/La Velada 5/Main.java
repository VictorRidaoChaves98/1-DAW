public class Main {
    public static void main(String[] args) {
        // Crear boxeadores
        Boxeador b1 = new Boxeador("Spartan", 70, 90, 80, 80);
        Boxeador b2 = new Boxeador("Vikingo", 65, 95, 85, 82);

        // Entrenadores
        Entrenador e1 = new Entrenador("Carlos", b1);
        Entrenador e2 = new Entrenador("Luis", b2);

        // Motivación (mejoran estadísticas)
        e1.motivarBoxeador();
        e2.motivarBoxeador();

        // Presentaciones
        System.out.println();
        b1.presentarse();
        b2.presentarse();
        e1.presentarse();
        e2.presentarse();

        // Árbitro
        Arbitro arbitro = new Arbitro("Don Juez");
        arbitro.presentarse();

        // Pelea
        Pelea pelea = new Pelea(b1, b2, arbitro);

        // Evento
        Evento evento = new Evento(pelea);
        evento.iniciarEvento(); // 🔥 Aquí comienza la Velada 5
    }
}
