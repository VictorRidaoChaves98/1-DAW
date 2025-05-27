import java.util.*;

public abstract class PlataformaStreaming implements IPlataformaStreaming {
    protected String nombre;
    protected List<Contenido> contenidos;

    public PlataformaStreaming(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    @Override
    public void añadirContenido(Contenido c) {
        if (!contenidos.contains(c)) {
            contenidos.add(c);
        }
    }

    @Override
    public void eliminarContenido(Contenido c) {
        contenidos.remove(c);
    }

    @Override
    public List<Contenido> obtenerTopDiez() {
        return contenidos.stream()
                .sorted((a, b) -> b.getVisualizaciones() - a.getVisualizaciones())
                .limit(10)
                .toList();
    }

    @Override
    public void listarContenidos() {
        System.out.println("📺 Contenidos de " + nombre + ":");
        for (Contenido c : contenidos) {
            System.out.println("- " + c);
        }
    }

    @Override
    public void reproducirAnunciosAleatoriamente() {
        List<String> anuncios = List.of("¡Compra ya!", "Oferta limitada", "¿Cansado de anuncios?", "Suscríbete a Premium");
        System.out.println("🟡 Anuncio: " + anuncios.get(new Random().nextInt(anuncios.size())));
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
