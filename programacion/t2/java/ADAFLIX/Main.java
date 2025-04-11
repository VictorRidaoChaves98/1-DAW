import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos plataformas de streaming
        PlataformaStreaming adaFlixBasic = new PlataformaStreaming(1, "ADAFLIX BASIC", 0.0, true);
        PlataformaStreaming adaFlixStandard = new PlataformaStreaming(2, "ADAFLIX STANDARD", 3.99, false);
        PlataformaStreaming adaFlixPremium = new PlataformaStreaming(3, "ADAFLIX PREMIUM", 9.99, false);

        // Crear algunos contenidos de ejemplo
        Pelicula peli1 = new Pelicula(1, "Peli A", 120, 12, 100, "Acción");
        Serie serie1 = new Serie(2, "Serie B", 60, 7, 50, "Drama", 10, 2);
        CanalProfesor canal1 = new CanalProfesor(3, "Canal Profesor C", 30, 0, 200, new Profesor(4, "Profesor X", LocalDate.of(1980, 5, 10), LocalDate.of(2025, 5, 9)), true);

        // Añadir contenido a las plataformas
        adaFlixBasic.añadirContenido(peli1);
        adaFlixStandard.añadirContenido(serie1);
        adaFlixPremium.añadirContenido(canal1);

        // Crear un usuario
        Usuario usuario = new Usuario(1, "Juan Pérez", LocalDate.of(1990, 5, 15), new ArrayList<>(), 50.0, new ArrayList<>());

        // Menú de interacción
        int opcion;
        do {
            System.out.println("\nBienvenido a ADAFLIX: Gestión de plataformas streaming");
            System.out.println("1. Listar las distintas suscripciones que existen de una plataforma");
            System.out.println("2. Suscribirse a una plataforma");
            System.out.println("3. Darse de baja de una plataforma");
            System.out.println("4. Listar el contenido según el tipo (película, serie o canal profesorado)");
            System.out.println("5. Mostrar el TOP 10 de los contenidos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Listar suscripciones
                    System.out.println("\nSuscripciones disponibles:");
                    System.out.println(adaFlixBasic);
                    System.out.println(adaFlixStandard);
                    System.out.println(adaFlixPremium);
                }
                case 2 -> {
                    // Suscribirse a una plataforma
                    System.out.println("\nSeleccione la plataforma a la que desea suscribirse:");
                    System.out.println("1. ADAFLIX BASIC");
                    System.out.println("2. ADAFLIX STANDARD");
                    System.out.println("3. ADAFLIX PREMIUM");
                    System.out.print("Seleccione una opción: ");
                    int subscripcion = scanner.nextInt();

                switch (subscripcion) {
                    case 1 -> usuario.darAltaPlataforma(adaFlixBasic);
                    case 2 -> usuario.darAltaPlataforma(adaFlixStandard);
                    case 3 -> usuario.darAltaPlataforma(adaFlixPremium);
                    default -> System.out.println("Opción no válida.");
                }
                }
                case 3 -> {
                    // Darse de baja de una plataforma
                    System.out.println("\nSeleccione la plataforma de la que desea darse de baja:");
                    System.out.println("1. ADAFLIX BASIC");
                    System.out.println("2. ADAFLIX STANDARD");
                    System.out.println("3. ADAFLIX PREMIUM");
                    System.out.print("Seleccione una opción: ");
                    int baja = scanner.nextInt();

                switch (baja) {
                    case 1 -> usuario.darBajaPlataforma(adaFlixBasic);
                    case 2 -> usuario.darBajaPlataforma(adaFlixStandard);
                    case 3 -> usuario.darBajaPlataforma(adaFlixPremium);
                    default -> System.out.println("Opción no válida.");
                }
                }
                case 4 -> {
                    // Listar contenidos según tipo
                    System.out.println("\nSeleccione el tipo de contenido a listar:");
                    System.out.println("1. Películas");
                    System.out.println("2. Series");
                    System.out.println("3. Canal Profesor");
                    System.out.print("Seleccione una opción: ");
                    int tipo = scanner.nextInt();

                    switch (tipo) {
                        case 1 -> System.out.println(peli1);
                        case 2 -> System.out.println(serie1);
                        case 3 -> System.out.println(canal1);
                        default -> System.out.println("Opción no válida.");
                    }
                }
                case 5 -> {
                    // Mostrar TOP 10 de contenidos
                    System.out.println("\nTOP 10 de contenidos más reproducidos:");
                    ArrayList<Contenido> top10 = adaFlixPremium.obtenerTopDiez();
                    for (Contenido c : top10) {
                        System.out.println(c);
                    }
                }
                case 6 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
