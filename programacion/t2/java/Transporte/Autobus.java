public class Autobus extends TransportePublico {

    private int numeroParadas;
    private double tarifa;

    public Autobus(int numeroParadas, double tarifa, int capacidad, String ruta, double velocidadMaxima) {
        super(capacidad, ruta, velocidadMaxima);

        this.numeroParadas = numeroParadas;
        this.tarifa = tarifa;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void arrancar() {
        System.out.println("Me lleva a la peda");
    }

    @Override
    public void parar() {
        System.out.println("Se paró");
    }

    
}
