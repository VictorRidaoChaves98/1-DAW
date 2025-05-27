public class Droide {
    private String nombre;

    public Droide(String nombre) {
        this.nombre = nombre;
    }

    public void repararNave(Transporte nave) {
        if (nave instanceof Nave) {
            Nave n = (Nave) nave;
            n.activar();
            System.out.println("🔧 " + nombre + " ha reparado y activado la nave " + n.getModelo());
        } else {
            System.out.println("❌ " + nombre + " no puede reparar este tipo de transporte.");
        }
    }

    public void viajarAPlaneta(Transporte nave, Planeta planeta) {
        if (nave instanceof Nave) {
            Nave n = (Nave) nave;
            if (n.getNumeroSaltos() >= planeta.getSaltosNecesarios()) {
                n.despegar();
                n.aterrizar(planeta.getSaltosNecesarios());
                System.out.println("🪐 " + nombre + " ha viajado exitosamente a " + planeta.getNombre());
            } else {
                System.out.println("⚠️ La nave no tiene suficientes saltos para llegar a " + planeta.getNombre());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Droide: " + nombre;
    }
}
