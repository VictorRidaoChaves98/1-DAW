public abstract class Participante{

    private String nombre;
    private int edad;
    private String pais;
    
    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void presentarse();

    public Participante(String pais) {
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Participante [nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + "]";
    }
    
    
    
}