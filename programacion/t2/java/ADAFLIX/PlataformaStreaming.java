import java.util.ArrayList;
import java.util.Comparator;

public class PlataformaStreaming implements iPlataformaStreaming {
    private int id;
    private String nombre;
    private double precioSuscripcion;
    private boolean contieneAnuncios;
    private ArrayList<Contenido> contenidos;

    public PlataformaStreaming(int id, String nombre, double precioSuscripcion, boolean contieneAnuncios) {
        this.id = id;
        this.nombre = nombre;
        this.precioSuscripcion = precioSuscripcion;
        this.contieneAnuncios = contieneAnuncios;
        this.contenidos = new ArrayList<>();
    }

    // Implementación de los métodos de la interfaz
    
    @Override
    public boolean añadirContenido(Contenido c) {
        if (!contenidos.contains(c)) {
            return contenidos.add(c);
        }
        return false;
    }

    @Override
    public boolean eliminarContenido(Contenido c) {
        return contenidos.remove(c);
    }

    @Override
    public ArrayList<Contenido> obtenerTopDiez() {
        ArrayList<Contenido> top10 = new ArrayList<>(contenidos);
        top10.sort(Comparator.comparingDouble(Contenido::getNumeroHorasReproducidas).reversed());
        return new ArrayList<>(top10.subList(0, Math.min(10, top10.size())));
    }

    @Override
    public int obtenerCalidadImagen() {
        return contieneAnuncios ? 720 : 1080;  // Ejemplo: si tiene anuncios, menor calidad
    }

    @Override
    public int obtenerNumeroMaximoPantallas() {
        return (precioSuscripcion >= 15.0) ? 4 : 2;  // Ejemplo: más pantallas si la suscripción es más cara
    }

    @Override
    public String reproducirAnunciosAleatoriamente() {
        if (contieneAnuncios) {
            String[] anuncios = {"Compra el nuevo Smartphone X!", "Viaja con descuentos exclusivos!", "Prueba nuestro servicio premium!"};
            return anuncios[(int) (Math.random() * anuncios.length)];
        }
        return "Sin anuncios.";
    }

    @Override
    public String listarContenidos() {
        StringBuilder lista = new StringBuilder("Contenidos en " + nombre + ":\n");
        for (Contenido c : contenidos) {
            lista.append(c.toString()).append("\n");
        }
        return lista.toString();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioSuscripcion() {
        return precioSuscripcion;
    }

    public void setPrecioSuscripcion(double precioSuscripcion) {
        this.precioSuscripcion = precioSuscripcion;
    }

    public boolean isContieneAnuncios() {
        return contieneAnuncios;
    }

    public void setContieneAnuncios(boolean contieneAnuncios) {
        this.contieneAnuncios = contieneAnuncios;
    }

    public ArrayList<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    @Override
    public String toString() {
        return String.format("PlataformaStreaming [ID: %d, Nombre: %s, Precio: %.2f€, Contiene Anuncios: %b, Número de Contenidos: %d]", 
                id, nombre, precioSuscripcion, contieneAnuncios, contenidos.size());
    }

}
