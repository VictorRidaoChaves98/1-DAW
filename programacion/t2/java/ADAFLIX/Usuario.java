import java.util.ArrayList;
import java.time.LocalDate;

public class Usuario extends Persona {
    
    private ArrayList<PlataformaStreaming> plataformasStreaming;
    private double saldo;
    private ArrayList<Contenido> contenidoFavoritos;

    public Usuario(int id, String nombre, LocalDate fechaNacimiento, ArrayList<PlataformaStreaming> plataformasStreaming,
            double saldo, ArrayList<Contenido> contenidoFavoritos) {

        super(id, nombre, fechaNacimiento);
        this.plataformasStreaming = plataformasStreaming;
        this.saldo = saldo;
        this.contenidoFavoritos = contenidoFavoritos;
    }

    public ArrayList<PlataformaStreaming> getPlataformasStreaming() {
        return plataformasStreaming;
    }

    public void setPlataformasStreaming(ArrayList<PlataformaStreaming> plataformasStreaming) {
        this.plataformasStreaming = plataformasStreaming;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Contenido> getContenidoFavoritos() {
        return contenidoFavoritos;
    }

    public void setContenidoFavoritos(ArrayList<Contenido> contenidoFavoritos) {
        this.contenidoFavoritos = contenidoFavoritos;
    }

   public void darAltaPlataforma(PlataformaStreaming p) {
        if (!plataformasStreaming.contains(p)) {
            plataformasStreaming.add(p);
        }
    }

    public void darBajaPlataforma(PlataformaStreaming p) {
        plataformasStreaming.remove(p);
    }

    public void compartirContenido(Usuario u, Contenido c) {
        if (contenidoFavoritos.contains(c)) {
            u.añadirContenidoFavorito(c);
        }
    }

    public boolean añadirContenidoFavorito(Contenido c) {
        if (!contenidoFavoritos.contains(c)) {
            contenidoFavoritos.add(c);
            return true;
        }
        return false;
    }

    public boolean eliminarContenidoFavorito(Contenido c) {
        return contenidoFavoritos.remove(c);
    }

    public String listarContenidoFavoritos() {
        StringBuilder sb = new StringBuilder("Contenidos favoritos:\n");
        for (Contenido c : contenidoFavoritos) {
            sb.append("- ").append(c.getNombre()).append("\n");
        }
        return sb.toString();
    }

    public String listarSuscripciones() {
        StringBuilder sb = new StringBuilder("Suscripciones:\n");
        for (PlataformaStreaming p : plataformasStreaming) {
            sb.append("- ").append(p.getNombre()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Usuario [plataformasStreaming=" + plataformasStreaming + ", saldo=" + saldo + ", contenidoFavoritos="
                + contenidoFavoritos + "]";
    }

    

    
}
