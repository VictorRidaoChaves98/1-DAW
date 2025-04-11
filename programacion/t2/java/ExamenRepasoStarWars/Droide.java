public class Droide {
    public void repararNave(Transporte nave) {
        if (nave instanceof Nave) {
            ((Nave) nave).activa = true;
            ((Nave) nave).numeroSaltos = 7; // Reparación perfecta
        }
    }

    public void viajarAPlaneta(Transporte nave, Planeta planeta) {
        if (((Nave) nave).getNumeroSaltos() > planeta.getSaltosNecesarios()) {
            nave.despegar();
            nave.aterrizar();
        }
    }
}
