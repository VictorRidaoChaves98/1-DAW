public abstract class TransportePublico implements IVehiculo{
    
    private int capacidad;
    private String ruta;
    private double velocidadMaxima;

    public TransportePublico(int capacidad, String ruta, double velocidadMaxima) {
        this.capacidad = capacidad;
        this.ruta = ruta;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostarInformacion() {
        
        System.out.println("Capacidad: " + capacidad + " personas");
        System.out.println("Ruta: " + ruta);
        System.out.println("Vel. máx.: " + velocidadMaxima + "Km/h");
    }

    

    
}
