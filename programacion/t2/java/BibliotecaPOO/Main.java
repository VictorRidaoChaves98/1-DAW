package BibliotecaPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Mostrar libros disponibles");
            System.out.println("5. Mostrar préstamos");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("ID del libro: ");
                    int idLibro = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    biblioteca.registrarLibro(new Libro(idLibro, titulo, autor));
                    System.out.println("Libro registrado exitosamente.");
                }
                case 2 -> {
                    System.out.print("ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    biblioteca.registrarUsuario(new Usuario(idUsuario, nombre));
                    System.out.println("Usuario registrado exitosamente.");
                }
                case 3 -> {
                    System.out.print("ID del libro: ");
                    int idLibro = scanner.nextInt();
                    System.out.print("ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    biblioteca.prestarLibro(idLibro, idUsuario);
                }
                case 4 -> biblioteca.mostrarLibrosDisponibles();
                case 5 -> biblioteca.mostrarPrestamos();
                case 6 -> {
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
