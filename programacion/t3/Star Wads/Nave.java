import java.util.List;

public class Nave implements Transporte {
    private String modelo;
    private int velocidadMaxima;
    private boolean activa;
    private int numeroSaltos;
    private List<String> tripulantes;

    public Nave(String modelo, int velocidadMaxima, List<String> tripulantes) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tripulantes = tripulantes;
        this.activa = false;
        this.numeroSaltos = 0;
    }

    @Override
    public void despegar() {
        if (activa) {
            System.out.println("🚀 La nave " + modelo + " ha despegado.");
        } else {
            System.out.println("⚠️ La nave " + modelo + " no está activa. No puede despegar.");
        }
    }

    @Override
    public void aterrizar(int saltosConsumidos) {
        if (numeroSaltos >= saltosConsumidos) {
            numeroSaltos -= saltosConsumidos;
            System.out.println("🛬 La nave " + modelo + " ha aterrizado. Saltos restantes: " + numeroSaltos);
        } else {
            System.out.println("❌ No hay suficientes saltos disponibles para aterrizar.");
        }
    }

    public void activar() {
        activa = true;
        numeroSaltos = 7;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isActiva() {
        return activa;
    }

    public int getNumeroSaltos() {
        return numeroSaltos;
    }

    public List<String> getTripulantes() {
        return tripulantes;
    }

    @Override
    public String toString() {
        return "Nave " + modelo + " [VelMax: " + velocidadMaxima + ", Saltos: " + numeroSaltos + ", Activa: " + activa + "]";
    }
}
