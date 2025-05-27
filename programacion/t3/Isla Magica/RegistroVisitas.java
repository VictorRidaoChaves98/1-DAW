import java.io.*;
import java.time.*;

public class RegistroVisitas {
    private static final String FILE_PREFIX = "islamagica-";

    private static String getFileName() {
        LocalDate hoy = LocalDate.now();
        return FILE_PREFIX + hoy + ".csv"; // formato yyyy-MM-dd.csv
    }

    public static void guardarEvento(String tipoEvento, String descripcion) {
        LocalDateTime ahora = LocalDateTime.now();
        String linea = ahora.toLocalDate() + "," + ahora.toLocalTime().withNano(0) + "," + tipoEvento + "," + descripcion;

        try (PrintWriter out = new PrintWriter(new FileWriter(getFileName(), true))) {
            out.println(linea);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar el evento: " + e.getMessage());
        }
    }

    public static void mostrarHistorial() {
        String file = getFileName();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("📄 Historial completo:");
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("⚠️ No se pudo leer el historial: " + e.getMessage());
        }
    }

    public static void filtrarPorFecha(LocalDate fecha) {
        String file = FILE_PREFIX + fecha + ".csv";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("📆 Eventos del " + fecha + ":");
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("⚠️ Archivo no encontrado para esa fecha.");
        }
    }

    public static void filtrarPorTipo(String tipoEvento) {
        String file = getFileName();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("🔍 Eventos tipo: " + tipoEvento);
            br.lines()
              .filter(l -> l.split(",")[2].equalsIgnoreCase(tipoEvento))
              .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("⚠️ No se pudo acceder al archivo.");
        }
    }
}