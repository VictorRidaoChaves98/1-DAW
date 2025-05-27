import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario("Pedro", 15.00);

        // Crear plataformas
        PlataformaStreaming basic = new Basic();
        PlataformaStreaming standard = new Standard();
        PlataformaStreaming premium = new Premium();

        // Añadir contenidos
        basic.añadirContenido(new Pelicula("El Código ADA"));
        basic.añadirContenido(new Serie("Aprende Java"));
        basic.añadirContenido(new CanalProfesorado("Clases de POO"));

        standard.añadirContenido(new Pelicula("Algoritmos Mortales"));
        standard.añadirContenido(new Serie("Recursión: El Retorno"));
        standard.añadirContenido(new CanalProfesorado("Canal DAW"));

        premium.añadirContenido(new Pelicula("Hackerman: The Movie"));
        premium.añadirContenido(new Serie("Docker Wars"));
        premium.añadirContenido(new CanalProfesorado("Directos ADA-ITS"));

        int opcion;
        do {
            System.out.println("\n🎬 Bienvenido a ADAFLIX - Gestión de plataformas streaming");
            System.out.println("1. Listar tus suscripciones");
            System.out.println("2. Subscribirse a una plataforma");
            System.out.println("3. Darse de baja de una plataforma");
            System.out.println("4. Listar contenido por tipo");
            System.out.println("5. Mostrar TOP 10 de una plataforma");
            System.out.println("6. Simular visualizaciones aleatorias");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> usuario.listarSuscripcionesPlataformas();

                case 2 -> {
                    System.out.println("Elige plataforma para suscribirte:");
                    System.out.println("1. Basic (Gratis)");
                    System.out.println("2. Standard (3.99€)");
                    System.out.println("3. Premium (9.99€)");
                    int p = sc.nextInt();
                    sc.nextLine();
                    switch (p) {
                        case 1 -> usuario.darAltaPlataforma(basic, 0.0);
                        case 2 -> usuario.darAltaPlataforma(standard, 3.99);
                        case 3 -> usuario.darAltaPlataforma(premium, 9.99);
                        default -> System.out.println("Opción inválida.");
                    }
                }

                case 3 -> {
                    System.out.println("Elige plataforma para darte de baja:");
                    System.out.println("1. Basic");
                    System.out.println("2. Standard");
                    System.out.println("3. Premium");
                    int p = sc.nextInt();
                    sc.nextLine();
                    switch (p) {
                        case 1 -> usuario.darBajaPlataforma(basic);
                        case 2 -> usuario.darBajaPlataforma(standard);
                        case 3 -> usuario.darBajaPlataforma(premium);
                        default -> System.out.println("Opción inválida.");
                    }
                }

                case 4 -> {
                    System.out.print("¿Qué tipo quieres listar? (pelicula/serie/profesorado): ");
                    String tipo = sc.nextLine().toLowerCase();
                    for (PlataformaStreaming ps : List.of(basic, standard, premium)) {
                        System.out.println("\n📺 Plataforma: " + ps.getNombre());
                        for (Contenido c : ps.obtenerTopDiez()) {
                            if ((tipo.equals("pelicula") && c instanceof Pelicula) ||
                                (tipo.equals("serie") && c instanceof Serie) ||
                                (tipo.equals("profesorado") && c instanceof CanalProfesorado)) {
                                System.out.println("- " + c);
                            }
                        }
                    }
                }

                case 5 -> {
                    System.out.println("Elige plataforma para ver el TOP 10:");
                    System.out.println("1. Basic");
                    System.out.println("2. Standard");
                    System.out.println("3. Premium");
                    int p = sc.nextInt();
                    sc.nextLine();

                    PlataformaStreaming elegida = switch (p) {
                        case 1 -> basic;
                        case 2 -> standard;
                        case 3 -> premium;
                        default -> null;
                    };

                    if (elegida != null) {
                        System.out.println("🎖 TOP 10 de " + elegida.getNombre());
                        for (Contenido c : elegida.obtenerTopDiez()) {
                            System.out.println("- " + c);
                        }
                    } else {
                        System.out.println("❌ Plataforma no válida.");
                    }
                }

                case 6 -> simularVisualizaciones(List.of(basic, standard, premium));

                case 7 -> System.out.println("👋 Cerrando ADAFLIX...");

                default -> System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 7);

        sc.close();
    }

    public static void simularVisualizaciones(List<PlataformaStreaming> plataformas) {
        Random rand = new Random();
        for (PlataformaStreaming plataforma : plataformas) {
            for (Contenido c : plataforma.obtenerTopDiez()) {
                int visitas = rand.nextInt(100); // entre 0 y 99
                for (int i = 0; i < visitas; i++) {
                    c.reproducir();
                }
            }
        }
        System.out.println("📈 Visualizaciones simuladas correctamente.");
    }
}
