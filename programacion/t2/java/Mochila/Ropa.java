public class Ropa extends Objeto {
    
    private String talla;

    public Ropa(String nombre, String talla) {
        super(nombre);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa [talla=" + talla + "]";
    }

    
}
