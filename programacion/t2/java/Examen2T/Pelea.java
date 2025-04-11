public class Pelea implements Combate {
    private Boxeador b1;
    private Boxeador b2;
    private Arbitro arbitro;
    
    public Pelea(Boxeador b1, Boxeador b2, Arbitro arbitro) {
        this.b1 = b1;
        this.b2 = b2;
        this.arbitro = arbitro;
    }
    
    public Boxeador getB1() {
        return b1;
    }

    public void setB1(Boxeador b1) {
        this.b1 = b1;
    }

    public Boxeador getB2() {
        return b2;
    }

    public void setB2(Boxeador b2) {
        this.b2 = b2;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public void iniciarCombate() {
        System.out.println("¡Empieza la pelea entre " + b1.getNombre() + " y " + b2.getNombre() + "!");
    }
    
    @Override
    public boolean continuarCombate() {
        return !b1.estaDerrotado() && !b2.estaDerrotado();
    }
    
    @Override
    public void registrarGolpe(Boxeador atacante, Boxeador defensivo) {
        defensivo.recibirGolpe(atacante.getPotencia());
    }
    
    @Override
    public Boxeador determinarGanador() {
        return b1.estaDerrotado() ? b2 : b1;
    }
    
    @Override
    public void finalizarCombate() {
        System.out.println("¡Fin del combate! Ganador: " + determinarGanador().getNombre());
    }

    @Override
    public String toString() {
        return "Pelea [b1=" + b1 + ", b2=" + b2 + ", arbitro=" + arbitro + "]";
    }

    
}