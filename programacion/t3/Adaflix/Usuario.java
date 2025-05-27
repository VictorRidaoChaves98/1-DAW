import java.util.*;

public class Usuario {
    private String nombre;
    private double saldo;
    private List<PlataformaStreaming> suscripciones;
    private List<Contenido> favoritos;

    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.suscripciones = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }

    // Dar de alta en plataforma
    public void darAltaPlataforma(PlataformaStreaming plataforma, double coste) {
        for (PlataformaStreaming p : suscripciones) {
            if (p.getClass().equals(plataforma.getClass())) {
                System.out.println("❌ Ya estás suscrito a " + p.getNombre() + ". Se dará de baja automáticamente.");
                darBajaPlataforma(p);
                break;
            }
        }

        if (saldo >= coste) {
            saldo -= coste;
            suscripciones.add(plataforma);
            System.out.println("✅ Te has suscrito a " + plataforma.getNombre());
        } else {
            System.out.println("❌ Saldo insuficiente para suscribirte a " + plataforma.getNombre());
        }
    }

    // Baja de plataforma
    public void darBajaPlataforma(PlataformaStreaming plataforma) {
        if (suscripciones.remove(plataforma)) {
            System.out.println("🗑️ Baja en " + plataforma.getNombre() + " realizada.");
        } else {
            System.out.println("❌ No estabas suscrito a esa plataforma.");
        }
    }

    // Compartir contenido con otro usuario
    public void compartirContenido(Contenido contenido, Usuario otroUsuario) {
        System.out.println("📨 " + nombre + " ha compartido " + contenido.getTitulo() + " con " + otroUsuario.nombre);
        otroUsuario.añadirContenidoFavorito(contenido);
    }

    // Añadir favorito
    public void añadirContenidoFavorito(Contenido contenido) {
        if (!favoritos.contains(contenido)) {
            favoritos.add(contenido);
            System.out.println("📌 Añadido a favoritos: " + contenido.getTitulo());
        } else {
            System.out.println("ℹ️ Ya lo tienes en favoritos.");
        }
    }

    // Eliminar favorito
    public void eliminarContenidoFavorito(Contenido contenido) {
        if (favoritos.remove(contenido)) {
            System.out.println("🗑️ Eliminado de favoritos: " + contenido.getTitulo());
        } else {
            System.out.println("❌ El contenido no estaba en favoritos.");
        }
    }

    // Listar favoritos
    public void listarContenidoFavoritos() {
        System.out.println("⭐ Favoritos de " + nombre + ":");
        for (Contenido c : favoritos) {
            System.out.println("- " + c);
        }
    }

    // Listar suscripciones agrupadas
    public void listarSuscripcionesPlataformas() {
        System.out.println("📦 Suscripciones de " + nombre + ":");
        for (PlataformaStreaming p : suscripciones) {
            System.out.println("- " + p.getNombre());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " | Saldo: " + saldo + "€";
    }
}
