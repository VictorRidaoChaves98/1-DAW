public class Atraccion {
    private String nombre;
    private String zona;
    private double alturaMinima;
    private int edadMinima;
    private boolean enFuncionamiento;
    private boolean requiereVip;
    private int capacidadMaxima;
    private int aforoActual;

    public Atraccion(int aforoActual, double alturaMinima, int capacidadMaxima, int edadMinima, boolean enFuncionamiento, String nombre, boolean requiereVip, String zona) {
        this.aforoActual = 0;
        this.alturaMinima = alturaMinima;
        this.capacidadMaxima = capacidadMaxima;
        this.edadMinima = edadMinima;
        this.enFuncionamiento = true;
        this.nombre = nombre;
        this.requiereVip = requiereVip;
        this.zona = zona;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public boolean isEnFuncionamiento() {
        return enFuncionamiento;
    }

    public void setEnFuncionamiento(boolean enFuncionamiento) {
        this.enFuncionamiento = enFuncionamiento;
    }

    public boolean isRequiereVip() {
        return requiereVip;
    }

    public void setRequiereVip(boolean requiereVip) {
        this.requiereVip = requiereVip;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getAforoActual() {
        return aforoActual;
    }

    public void setAforoActual(int aforoActual) {
        this.aforoActual = aforoActual;
    }
    
    public boolean puedeSubirse(Visitante v){
        if (!enFuncionamiento) return false;
        if (aforoActual >= capacidadMaxima) return false;
        if (v.getEdad() < edadMinima || v.getAltura() < alturaMinima) return false;
        if (requiereVip && v.isEsVip()) return true;
        if (get.zona("Zona de Aventuras") && v.getAltura() > 2.000) return false;
        if (aforoActual >= capacidadMaxima) return false;
        return true;
    }

    public void abrir(){
        enFuncionamiento = true;

    }

    public void cerrar(){
        enFuncionamiento = false;
    }

    public String mostrarEstado(){
        "Nombre de la atracción: " + nombre + 
        "Zona del parque: " + zona +
        "Está funcionando: " + (enFuncionamiento ? "SI" : "NO") +
        "Edad para acceder a la atracción: " + edadMinima +
        "Altura requerida: " + edadMinima +
        "Capacidad de aforo actual: " aforoActual + "/" + capacidadMaxima;
        return null;
    }

    public boolean registrarSubida(){
        if(aforoActual < capacidadMaxima){
            return true;
        }
        return false;
    }

    public boolean reiniciarAforo(){
        aforoActual = 0;
        return enFuncionamiento;
    }

    @Override
    public String toString() {
        return "Atraccion [nombre=" + nombre + ", zona=" + zona + ", alturaMinima=" + alturaMinima + ", edadMinima="
                + edadMinima + ", enFuncionamiento=" + enFuncionamiento + ", requiereVip=" + requiereVip
                + ", capacidadMaxima=" + capacidadMaxima + ", aforoActual=" + aforoActual + "]";
    }

    



}
