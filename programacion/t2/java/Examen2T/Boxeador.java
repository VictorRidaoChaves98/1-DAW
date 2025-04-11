public class Boxeador extends Participante {

    private String nacionalidad;
    private int potencia;
    private int resistencia; 
    private int velocidad;
    private double peso;
    private final CategoriaPeso categoria;

    public Boxeador(String nombre, int edad, String nacionalidad, int potencia, int resistencia, int velocidad, double peso) {
        super(nombre, edad);
        this.nacionalidad = nacionalidad;
        this.potencia = potencia;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.peso = peso;
        this.categoria = calcularCategoria();
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private CategoriaPeso calcularCategoria() {

       if(peso<57) return CategoriaPeso.PESO_PLUMA;
       else if (peso<70) return CategoriaPeso.PESO_LIGERO;
       else if (peso<85) return CategoriaPeso.PESO_MEDIO;
       else return CategoriaPeso.PESO_PESADO;
    }

    public void recibirGolpe(int potenciaGolpe) {
        resistencia += potenciaGolpe;
    }
    
    public boolean estaDerrotado() {
        return resistencia <= 0;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Soy " + getNombre() + ", y estoy en la categoría de: " + categoria);
    }

    @Override
    public String toString() {
        return "Boxeador [nacionalidad=" + nacionalidad + ", potencia=" + potencia + ", resistencia=" + resistencia
                + ", velocidad=" + velocidad + ", peso=" + peso + ", categoria=" + categoria + "]";
    }

    public void boxear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }



    
}