public class Visitante {
    private String nombre;
    private int edad;
    private double altura;
    private boolean esVip;
    private String provinciaOrigen;

    public Visitante(String nombre, int edad, double altura, boolean esVip, String provinciaOrigen) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.esVip = esVip;
        this.provinciaOrigen = provinciaOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }

    @Override
    public String toString() {
        return "Visitante [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", esVip=" + esVip
                + ", provinciaOrigen=" + provinciaOrigen + "]";
    }

    

    
}
