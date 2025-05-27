
public class Pelea {
    private Boxeador boxeador1;
    private Boxeador boxeador2;
    private Arbitro arbitro;
    private boolean peleaActiva;

    public Pelea(Boxeador boxeador1, Boxeador boxeador2, Arbitro arbitro) {
        this.boxeador1 = boxeador1;
        this.boxeador2 = boxeador2;
        this.arbitro = arbitro;
        this.peleaActiva = false;
    }

    public void iniciarCombate() {
        peleaActiva = true;
        System.out.println("🔔 ¡Comienza la pelea entre " + boxeador1.getNombre() + " y " + boxeador2.getNombre() + "!");
    }

    public boolean continuarCombate() {
        if (!peleaActiva) return false;

        Boxeador atacante, defensor;

        // Determinar quién ataca según velocidad * aleatorio
        double valor1 = boxeador1.getVelocidad() * Math.random();
        double valor2 = boxeador2.getVelocidad() * Math.random();

        if (valor1 > valor2) {
            atacante = boxeador1;
            defensor = boxeador2;
        } else {
            atacante = boxeador2;
            defensor = boxeador1;
        }

        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre());
        registrarGolpe(atacante, defensor);

        return !defensor.estaDerrotado();
    }

    public void registrarGolpe(Boxeador atacante, Boxeador defensor) {
        if (defensor.esquivarGolpe()) {
            System.out.println(defensor.getNombre() + " esquivó el golpe.");
        } else {
            defensor.recibirGolpe(atacante.getPotencia());
            System.out.println(defensor.getNombre() + " recibió un golpe. Resistencia actual: " + defensor.getResistencia());
        }
    }

    public Boxeador determinarGanador() {
        if (boxeador1.estaDerrotado() && boxeador2.estaDerrotado()) return null; // empate

        if (boxeador1.estaDerrotado()) return boxeador2;
        if (boxeador2.estaDerrotado()) return boxeador1;

        // Si nadie está derrotado, gana el que tenga más resistencia
        return (boxeador1.getResistencia() > boxeador2.getResistencia()) ? boxeador1 : boxeador2;
    }

    public void finalizarCombate() {
        peleaActiva = false;
        Boxeador ganador = determinarGanador();

        System.out.println("🏁 Combate finalizado.");
        if (ganador == null) {
            System.out.println("🤝 ¡La pelea terminó en empate!");
        } else {
            System.out.println("🏆 El ganador es: " + ganador.getNombre());
        }
    }

    // Getters opcionales
    public boolean isPeleaActiva() {
        return peleaActiva;
    }
}
