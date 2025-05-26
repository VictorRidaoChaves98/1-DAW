import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Olimpo olimpo = new Olimpo();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n⚡ MENÚ DEL OLIMPO ⚡");
            System.out.println("1. Añadir nueva deidad");
            System.out.println("2. Mostrar todas las deidades");
            System.out.println("3. Buscar deidad más poderosa");
            System.out.println("4. Filtrar por dominio");
            System.out.println("5. Importar deidades desde CSV");
            System.out.println("6. Exportar deidades a CSV");
            System.out.println("7. Agrupar deidades por dominio");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Dominio: ");
                    String dominio = sc.nextLine();
                    System.out.print("Poder (0-100): ");
                    int poder = sc.nextInt();
                    System.out.print("Edad eterna: ");
                    int edad = sc.nextInt();
                    System.out.print("¿Es inmortal? (true/false): ");
                    boolean inmortal = sc.nextBoolean();
                    sc.nextLine();

                    Deidad nueva = new Deidad(nombre, dominio, poder, edad, inmortal);
                    olimpo.añadirDeidad(nueva);
                    System.out.println("✅ Deidad añadida.");
                    break;

                case 2:
                    System.out.println("\n📜 Lista de deidades:");
                    List<Deidad> lista = olimpo.obtenerTodas();
                    if (lista.isEmpty()) {
                        System.out.println("⚠️ No hay deidades registradas.");
                    } else {
                        for (Deidad d : lista) {
                            d.mostrarInformacion();
                            System.out.println();
                        }
                    }
                    break;


                case 3:
                    Deidad poderosa = olimpo.buscarDeidadMasPoderosa();
                    if (poderosa != null) {
                        System.out.println("💥 Deidad más poderosa:");
                        poderosa.mostrarInformacion();
                    } else {
                        System.out.println("No hay deidades registradas.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce dominio a filtrar: ");
                    String dom = sc.nextLine();
                    List<Deidad> filtradas = olimpo.filtrarPorDominio(dom);
                    if (filtradas.isEmpty()) {
                        System.out.println("❌ No hay deidades con ese dominio.");
                    } else {
                        for (Deidad d : filtradas) {
                            System.out.println(d);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Ruta del archivo CSV: ");
                    String rutaImport = sc.nextLine();
                    olimpo.importarDesdeCSV(rutaImport);
                    break;

                case 6:
                    System.out.print("Ruta para guardar el CSV: ");
                    String rutaExport = sc.nextLine();
                    olimpo.exportarACSV(rutaExport);
                    break;

                case 7:
                    Map<String, List<Deidad>> grupos = olimpo.agruparPorDominio();
                    for (String key : grupos.keySet()) {
                        System.out.println("\n🔹 Dominio: " + key.toUpperCase());
                        for (Deidad d : grupos.get(key)) {
                            System.out.println("  - " + d);
                        }
                    }
                    break;

                case 8:
                    System.out.println("👋 Saliendo del Olimpo...");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 8);

        sc.close();
    }
}
