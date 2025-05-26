import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Olimpo {
    private ArrayList<Deidad> deidades;

    // Constructor
    public Olimpo() {
        this.deidades = new ArrayList<>();
    }

    // Añadir una deidad
    public void añadirDeidad(Deidad d) {
        deidades.add(d);
    }

    // Eliminar deidad por nombre
    public void eliminarDeidadPorNombre(String nombre) {
        boolean eliminada = deidades.removeIf(d -> d.getNombre().equalsIgnoreCase(nombre));
        if (eliminada) {
            System.out.println(nombre + " ha sido eliminada del Olimpo.");
        } else {
            System.out.println("No se encontró ninguna deidad con ese nombre.");
        }
    }

    // Buscar deidad más poderosa
    public Deidad buscarDeidadMasPoderosa() {
        if (deidades.isEmpty()) return null;

        Deidad masPoderosa = deidades.get(0);
        for (Deidad d : deidades) {
            if (d.getPoder() > masPoderosa.getPoder()) {
                masPoderosa = d;
            }
        }
        return masPoderosa;
    }

    // Filtrar por dominio
    public List<Deidad> filtrarPorDominio(String dominio) {
        List<Deidad> resultado = new ArrayList<>();
        for (Deidad d : deidades) {
            if (d.getDominio().equalsIgnoreCase(dominio)) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    // Calcular media de poder
    public double calcularMediaPoder() {
        if (deidades.isEmpty()) return 0;

        int suma = 0;
        for (Deidad d : deidades) {
            suma += d.getPoder();
        }
        return (double) suma / deidades.size();
    }

    // IMPORTAR DEIDADES DESDE UN ARCHIVO CSV

      // IMPORTAR DEIDADES DESDE UN ARCHIVO CSV
    public void importarDesdeCSV(String rutaFichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    String nombre = partes[0];
                    String dominio = partes[1];
                    int poder = Integer.parseInt(partes[2]);
                    int edad = Integer.parseInt(partes[3]);
                    boolean inmortal = Boolean.parseBoolean(partes[4]);

                    Deidad nueva = new Deidad(nombre, dominio, poder, edad, inmortal);
                    añadirDeidad(nueva);
                }
            }
            System.out.println("✅ Deidades importadas correctamente.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("❌ Error al importar el archivo: " + e.getMessage());
        }
    }

    // EXPORTAR DEIDADES A UN ARCHIVO CSV

    public void exportarACSV(String rutaFichero) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaFichero))) {
            for (Deidad d : deidades) {
                pw.println(d.getNombre() + "," + d.getDominio() + "," + d.getPoder() + "," +
                        d.getEdadEterna() + "," + d.isEsInmortal());
            }
            System.out.println("✅ Deidades exportadas correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al exportar el archivo: " + e.getMessage());
        }
    }

    public Map<String, List<Deidad>> agruparPorDominio() {
        Map<String, List<Deidad>> mapaDominio = new HashMap<>();

        for (Deidad d : deidades) {
            String dominio = d.getDominio().toLowerCase(); // clave agrupadora
            mapaDominio.putIfAbsent(dominio, new ArrayList<>());
            mapaDominio.get(dominio).add(d);
        }

        return mapaDominio;
    }

    public List<Deidad> obtenerTodas() {
    return new ArrayList<>(deidades); // Devolvemos una copia por seguridad
}


}


