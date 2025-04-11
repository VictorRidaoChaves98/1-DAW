public interface Combate {
    
    void iniciarCombate();
    boolean continuarCombate();
    void registrarGolpe(Boxeador atacante, Boxeador defensivo);
    Boxeador determinarGanador();
    void finalizarCombate();
}
