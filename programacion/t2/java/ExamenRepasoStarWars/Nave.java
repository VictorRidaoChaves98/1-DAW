// Clase Nave
public class Nave implements Transporte {
    private String modelo;
    private int velocidadMaxima;
    private boolean activa;
    private final int numeroSaltos;
    private int tripulantes;

    public Nave(String modelo, int velocidadMaxima, int numeroSaltos, int tripulantes) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.activa = true;
        this.numeroSaltos = numeroSaltos;
        this.tripulantes = tripulantes;
    }


    
    public boolean esActiva() {
        return activa;
    }

    public int getNumeroSaltos() {
        return numeroSaltos;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isActiva() {
        return activa;
    }
    
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getTripulantes() {
        return tripulantes;
    }
    
    public void setTripulantes(int tripulantes) {
        this.tripulantes = tripulantes;
    }

    @Override
    public void despegar() {
        System.out.println(modelo + " despegando.");
    }
    
    @Override
    public void aterrizar() {
        System.out.println(modelo + " aterrizando.");
    }
}
