public class Boxeador extends Participante {
    private int velocidad;
    private int resistencia; // 0 a 100
    private int potencia;
    private double peso;
    private Categoria categoria;

    // Constructor
    public Boxeador(String nombre, int velocidad, int resistencia, int potencia, double peso) {
        super(nombre);
        this.velocidad = velocidad;
        this.resistencia = Math.min(resistencia, 100); // máximo 100
        this.potencia = potencia;
        this.peso = peso;
        calcularCategoria();
    }

    // Calcular categoría según el peso
    private void calcularCategoria() {
        if (peso <= 57) {
            categoria = Categoria.PESO_PLUMA;
        } else if (peso <= 70) {
            categoria = Categoria.PESO_LIGERO;
        } else if (peso <= 85) {
            categoria = Categoria.PESO_MEDIO;
        } else {
            categoria = Categoria.PESO_PESADO;
        }
    }

    // Presentarse
    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + ", boxeador de " + peso + " kg y compito en " + categoria + ".");
    }

    // Recibir golpe: pierde 10% de la potencia del atacante
    public void recibirGolpe(int potenciaGolpe) {
        int reduccion = (int) (potenciaGolpe * 0.10);
        resistencia -= reduccion;
        if (resistencia < 0) resistencia = 0;
    }

    // ¿Está derrotado?
    public boolean estaDerrotado() {
        return resistencia <= 0;
    }

    // ¿Esquiva el golpe?
    public boolean esquivarGolpe() {
        double probabilidad = (velocidad * 0.4) + (resistencia * 0.5);
        return Math.random() * 100 < probabilidad;
    }

    // Mejorar estadísticas: sube potencia y velocidad según resistencia
    public void mejorarEstadisticas() {
        double porcentaje = 3 + ((resistencia / 100.0) * 4); // entre 3% y 7%
        this.potencia += (int) (potencia * (porcentaje / 100.0));
        this.velocidad += (int) (velocidad * (porcentaje / 100.0));
        if (resistencia > 100) resistencia = 100;
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre +
            ", Velocidad: " + velocidad +
            ", Resistencia: " + resistencia +
            ", Potencia: " + potencia);
    }

    // Getters
    public int getVelocidad() {
        return velocidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public double getPeso() {
        return peso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    // toString opcional para depurar
    @Override
    public String toString() {
        return nombre + " (" + categoria + ") - Vel: " + velocidad +
            ", Pot: " + potencia + ", Res: " + resistencia + ", Peso: " + peso;
    }
}
