package BibliotecaPOO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;
    private List<Usuario> listaUsuarios;

    public Biblioteca() {
        listaLibros = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void prestarLibro(int idLibro, int idUsuario) {
        Libro libro = listaLibros.stream().filter(l -> l.getId() == idLibro && l.isDisponible()).findFirst().orElse(null);
        Usuario usuario = listaUsuarios.stream().filter(u -> u.getId() == idUsuario).findFirst().orElse(null);

        if (libro != null && usuario != null) {
            libro.setDisponible(false);
            usuario.prestarLibro(libro);
            System.out.println("El libro \"" + libro.getTitulo() + "\" fue prestado a " + usuario.getNombre());
        } else {
            System.out.println("No se pudo realizar el préstamo. Verifica los IDs o la disponibilidad del libro.");
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        listaLibros.stream().filter(Libro::isDisponible).forEach(System.out::println);
    }

    public void mostrarPrestamos() {
        System.out.println("Préstamos actuales:");
        listaUsuarios.forEach(usuario -> {
            System.out.println(usuario.getNombre() + " ha prestado:");
            usuario.getLibrosPrestados().forEach(libro -> System.out.println("  - " + libro.getTitulo()));
        });
    }
}
