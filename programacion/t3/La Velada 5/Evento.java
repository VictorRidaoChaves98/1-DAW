public class Evento {
    private Pelea peleaEstelar;

    // Constructor por defecto (puedes cambiar los nombres/datos si quieres)
    public Evento() {
        Boxeador b1 = new Boxeador("Spartan", 70, 100, 80, 80);
        Boxeador b2 = new Boxeador("Vikingo", 65, 100, 85, 82);
        Arbitro arbitro = new Arbitro("Don Juez");
        this.peleaEstelar = new Pelea(b1, b2, arbitro);
    }

    // Constructor con pelea personalizada
    public Evento(Pelea peleaEstelar) {
        this.peleaEstelar = peleaEstelar;
    }

    // Simula la pelea estelar
    public void iniciarEvento() {
        System.out.println("🎬 ¡Iniciando La Velada 5!");
        peleaEstelar.iniciarCombate();

        // Bucle de combate hasta que alguien pierda o pelea sea detenida
        while (peleaEstelar.isPeleaActiva()) {
            boolean seguir = peleaEstelar.continuarCombate();

            // Simulación artificial de detener la pelea con probabilidad
            if (!seguir || Math.random() < 0.05) {
                peleaEstelar.finalizarCombate();
                break;
            }

            // Pequeña pausa entre rondas (solo decorativa)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("📺 Gracias por asistir a La Velada 5.");
    }
}
