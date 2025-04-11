public class Ocio extends Objeto{

    private String categoria;

    public Ocio(String nombre, String categoria) {
        super(nombre);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Ocio [categoria=" + categoria + "]";
    }

    
}