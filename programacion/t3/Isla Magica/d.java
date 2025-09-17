public class Atraccion {
    private String nombre;
    private String zona;
    private double alturaMinima;
    private int edadMinima;
    private boolean enFuncionamiento;
    private boolean requiereVip;
    private int capacidadMaxima;
    private int aforoActual;

    public Atraccion(String nombre, String zona, double alturaMinima, int edadMinima, boolean requiereVip, int capacidadMaxima) {
        this.nombre = nombre;
        this.zona = zona;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.requiereVip = requiereVip;
        this.capacidadMaxima = capacidadMaxima;
        this.aforoActual = 0;
        this.enFuncionamiento = true;
    }

    public boolean puedeSubirse(Visitante v) {
        if (!enFuncionamiento) return false;
        if (aforoActual >= capacidadMaxima) return false;
        if (v.getEdad() < edadMinima || v.getAltura() < alturaMinima) return false;
        if (requiereVip && !v.isVip()) return false;
        if (zona.equalsIgnoreCase("Zona de Aventuras") && v.getAltura() > 2.00) return false;
        return true;
    }

    public void abrir() {
        enFuncionamiento = true;
    }

    public void cerrar() {
        enFuncionamiento = false;
    }

    public String mostrarEstado() {
        return "🎢 " + nombre + " | Zona: " + zona +
               " | Funcionando: " + (enFuncionamiento ? "Sí" : "No") +
               " | Edad mínima: " + edadMinima +
               " | Altura mínima: " + alturaMinima +
               " | VIP: " + (requiereVip ? "Sí" : "No") +
               " | Aforo: " + aforoActual + "/" + capacidadMaxima;
    }

    public boolean registrarSubida() {
        if (aforoActual < capacidadMaxima) {
            aforoActual++;
            return true;
        }
        return false;
    }

    public void reiniciarAforo() {
        aforoActual = 0;
    }

    // Getters (opcionalmente útiles para simulación)
    public String getNombre() {
        return nombre;
    }

    public boolean isEnFuncionamiento() {
        return enFuncionamiento;
    }

    public int getAforoActual() {
        return aforoActual;
    }
}










public enum TipoProducto {
    BEBIDA,
    COMIDA,
    POSTRE
}



public class Producto {
    private String nombre;
    private double precio;
    private TipoProducto tipo;

    public Producto(String nombre, double precio, TipoProducto tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - " + String.format("%.2f", precio) + " €";
    }
}





import java.util.ArrayList;
import java.util.List;

public class PedidoVisitante {
    private Visitante visitante;
    private List<Producto> productos;

    public PedidoVisitante(Visitante visitante) {
        this.visitante = visitante;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (p == null || p.getPrecio() < 0) {
            throw new IllegalArgumentException("Producto inválido");
        }
        productos.add(p);
    }

    public double calcularTotal() {
        double subtotal = productos.stream().mapToDouble(Producto::getPrecio).sum();

        boolean tieneBebida = productos.stream().anyMatch(p -> p.getTipo() == TipoProducto.BEBIDA);
        boolean tieneComida = productos.stream().anyMatch(p -> p.getTipo() == TipoProducto.COMIDA);
        if (tieneBebida && tieneComida) subtotal -= 1.5;

        if (productos.size() > 4) subtotal *= 0.95; // 5% descuento

        if (visitante.isVip() && visitante.getProvinciaOrigen().equalsIgnoreCase("Sevilla")) {
            subtotal *= 0.80; // 20% VIP Sevilla
        }

        return subtotal * 1.10; // +10% IVA
    }

    public String resumenPedido() {
        StringBuilder sb = new StringBuilder("🍽️ Pedido de " + visitante.getNombre() + ":\n");
        double subtotal = 0;

        for (Producto p : productos) {
            sb.append("- ").append(p).append("\n");
            subtotal += p.getPrecio();
        }

        sb.append("Subtotal: ").append(String.format("%.2f", subtotal)).append(" €\n");

        if (productos.stream().anyMatch(p -> p.getTipo() == TipoProducto.BEBIDA) &&
            productos.stream().anyMatch(p -> p.getTipo() == TipoProducto.COMIDA)) {
            sb.append("Descuento combo bebida+comida: -1.50 €\n");
            subtotal -= 1.5;
        }

        if (productos.size() > 4) {
            sb.append("Descuento por cantidad: -5%\n");
            subtotal *= 0.95;
        }

        if (visitante.isVip() && visitante.getProvinciaOrigen().equalsIgnoreCase("Sevilla")) {
            sb.append("Descuento VIP Sevilla: -20%\n");
            subtotal *= 0.80;
        }

        double totalConIVA = subtotal * 1.10;
        sb.append("IVA (10%): +").append(String.format("%.2f", subtotal * 0.10)).append(" €\n");
        sb.append("TOTAL: ").append(String.format("%.2f", totalConIVA)).append(" €");

        return sb.toString();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Visitante getVisitante() {
        return visitante;
    }
}





public enum TipoDificultad {
    FACIL,
    MEDIA,
    DIFICIL
}





public class Juego {
    private String nombre;
    private int puntuacionMaxima;
    private TipoDificultad dificultad;
    private boolean soloVip;

    public Juego(String nombre, int puntuacionMaxima, TipoDificultad dificultad, boolean soloVip) {
        this.nombre = nombre;
        this.puntuacionMaxima = puntuacionMaxima;
        this.dificultad = dificultad;
        this.soloVip = soloVip;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public TipoDificultad getDificultad() {
        return dificultad;
    }

    public boolean isSoloVip() {
        return soloVip;
    }

    @Override
    public String toString() {
        return nombre + " (" + dificultad + ", Máx: " + puntuacionMaxima + ", Solo VIP: " + soloVip + ")";
    }
}






public class Participacion {
    private Visitante jugador;
    private Juego juego;
    private int puntuacion;

    public Participacion(Visitante jugador, Juego juego, int puntuacion) {
        if (puntuacion > juego.getPuntuacionMaxima()) {
            throw new IllegalArgumentException("La puntuación supera el máximo permitido.");
        }
        this.jugador = jugador;
        this.juego = juego;
        this.puntuacion = puntuacion;
    }

    public boolean esGanador() {
        if (juego.isSoloVip() && !jugador.isVip()) return false;

        double porcentaje = (puntuacion * 100.0) / juego.getPuntuacionMaxima();
        switch (juego.getDificultad()) {
            case FACIL: return porcentaje >= 70;
            case MEDIA: return porcentaje >= 80;
            case DIFICIL:
                return porcentaje >= 90 || (jugador.isVip() && porcentaje >= 80);
        }
        return false;
    }

    public String mostrarResultado() {
        return "🎮 Participación de " + jugador.getNombre() + " en '" + juego.getNombre() + "' - Puntuación: " + puntuacion +
               " | ¿Ganador? " + (esGanador() ? "✅ SÍ" : "❌ NO");
    }

    public Visitante getJugador() {
        return jugador;
    }

    public Juego getJuego() {
        return juego;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
}





import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

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






import java.util.*;

public class Parque {
    private List<Visitante> visitantes = new ArrayList<>();
    private List<Atraccion> atracciones = new ArrayList<>();
    private List<PedidoVisitante> pedidos = new ArrayList<>();
    private List<Juego> juegos = new ArrayList<>();
    private List<Participacion> participaciones = new ArrayList<>();
    private Random random = new Random();

    public void simularDia() {
        generarVisitantesAleatorios(10);
        generarAtracciones();
        generarJuegos();

        for (Visitante v : visitantes) {
            // Entrada
            TipoEntrada tipo = v.isVip() ? TipoEntrada.VIP : (v.getEdad() < 12 ? TipoEntrada.INFANTIL : TipoEntrada.GENERAL);
            Entrada e = new Entrada(v, tipo);
            RegistroVisitas.guardarEvento("Entrada", e.resumenEntrada());

            // Atracciones
            for (Atraccion a : atracciones) {
                if (a.puedeSubirse(v)) {
                    a.registrarSubida();
                    RegistroVisitas.guardarEvento("Atracción", v.getNombre() + " se subió a " + a.getNombre());
                    break; // solo una por ahora
                }
            }

            // Pedido
            PedidoVisitante pedido = new PedidoVisitante(v);
            pedido.agregarProducto(new Producto("Agua", 1.5, TipoProducto.BEBIDA));
            pedido.agregarProducto(new Producto("Hamburguesa", 5.5, TipoProducto.COMIDA));
            if (random.nextBoolean()) pedido.agregarProducto(new Producto("Helado", 2.0, TipoProducto.POSTRE));
            pedidos.add(pedido);
            RegistroVisitas.guardarEvento("Pedido", pedido.resumenPedido());

            // Juego
            Juego juego = juegos.get(random.nextInt(juegos.size()));
            int puntuacion = random.nextInt(juego.getPuntuacionMaxima() + 1);
            try {
                Participacion participacion = new Participacion(v, juego, puntuacion);
                participaciones.add(participacion);
                RegistroVisitas.guardarEvento("Juego", participacion.mostrarResultado());
            } catch (IllegalArgumentException ex) {
                RegistroVisitas.guardarEvento("Error", "Puntuación inválida para juego de " + v.getNombre());
            }
        }
    }

    public void generarVisitantesAleatorios(int cantidad) {
        String[] nombres = {"Ana", "Pedro", "Luis", "Lucía", "Carlos", "Marta", "Elena", "Javier", "Sara", "David"};
        String[] provincias = {"Sevilla", "Cádiz", "Huelva", "Málaga"};

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = 5 + random.nextInt(20); // 5–24
            double altura = 1.0 + random.nextDouble() * 1.2; // 1.0–2.2 m
            boolean vip = random.nextBoolean();
            String provincia = provincias[random.nextInt(provincias.length)];

            visitantes.add(new Visitante(nombre, edad, altura, vip, provincia));
        }
    }

    public void generarAtracciones() {
        atracciones.add(new Atraccion("Dragón Volador", "Zona de Aventuras", 1.3, 10, false, 20));
        atracciones.add(new Atraccion("Río Lento", "Zona Infantil", 1.0, 5, false, 15));
        atracciones.add(new Atraccion("Torre del Miedo", "Zona de Aventuras", 1.5, 14, true, 10));
    }

    public void generarJuegos() {
        juegos.add(new Juego("Tiro al blanco", 100, TipoDificultad.FACIL, false));
        juegos.add(new Juego("Escape Room", 150, TipoDificultad.MEDIA, false));
        juegos.add(new Juego("Simulador Sith", 200, TipoDificultad.DIFICIL, true));
    }

    public void mostrarResumenFinal() {
        System.out.println("📊 Resumen del día:");
        System.out.println("- Visitantes: " + visitantes.size());
        System.out.println("- Pedidos realizados: " + pedidos.size());
        System.out.println("- Participaciones en juegos: " + participaciones.size());

        int totalSubidas = atracciones.stream().mapToInt(Atraccion::getAforoActual).sum();
        System.out.println("- Subidas a atracciones: " + totalSubidas);
    }
}









public class ExcepcionProductoInvalido extends Exception {
    public ExcepcionProductoInvalido(String mensaje) {
        super(mensaje);
    }
}








public class ExcepcionPuntuacionExcedida extends Exception {
    public ExcepcionPuntuacionExcedida(String mensaje) {
        super(mensaje);
    }
}






public void agregarProducto(Producto p) throws ExcepcionProductoInvalido {
    if (p == null || p.getPrecio() < 0) {
        throw new ExcepcionProductoInvalido("❌ Producto inválido: nulo o con precio negativo.");
    }
    productos.add(p);
}











public Participacion(Visitante jugador, Juego juego, int puntuacion) throws ExcepcionPuntuacionExcedida {
    if (puntuacion > juego.getPuntuacionMaxima()) {
        throw new ExcepcionPuntuacionExcedida("❌ Puntuación excede el máximo permitido.");
    }
    this.jugador = jugador;
    this.juego = juego;
    this.puntuacion = puntuacion;
}













// PEDIDO
PedidoVisitante pedido = new PedidoVisitante(v);
try {
    pedido.agregarProducto(new Producto("Agua", 1.5, TipoProducto.BEBIDA));
    pedido.agregarProducto(new Producto("Hamburguesa", 5.5, TipoProducto.COMIDA));
    if (random.nextBoolean()) {
        pedido.agregarProducto(new Producto("Helado", 2.0, TipoProducto.POSTRE));
    }
    pedidos.add(pedido);
    RegistroVisitas.guardarEvento("Pedido", pedido.resumenPedido());
} catch (ExcepcionProductoInvalido ex) {
    RegistroVisitas.guardarEvento("Error", "Producto inválido para " + v.getNombre() + ": " + ex.getMessage());
}

// PARTICIPACIÓN
Juego juego = juegos.get(random.nextInt(juegos.size()));
int puntuacion = random.nextInt(juego.getPuntuacionMaxima() + 50); // intencionadamente puede exceder
try {
    Participacion participacion = new Participacion(v, juego, puntuacion);
    participaciones.add(participacion);
    RegistroVisitas.guardarEvento("Juego", participacion.mostrarResultado());
} catch (ExcepcionPuntuacionExcedida ex) {
    RegistroVisitas.guardarEvento("Error", "Puntuación inválida para " + v.getNombre() + ": " + ex.getMessage());
}








import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parque parque = new Parque();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n🎢 BIENVENIDO A ISLA MÁGICA 🎢");
            System.out.println("1. Simular un día completo en el parque");
            System.out.println("2. Mostrar historial completo del día");
            System.out.println("3. Filtrar historial por tipo de evento");
            System.out.println("4. Filtrar historial por fecha");
            System.out.println("5. Mostrar resumen final del día");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> parque.simularDia();
                case 2 -> RegistroVisitas.mostrarHistorial();
                case 3 -> {
                    System.out.print("Tipo de evento (Entrada, Atracción, Pedido, Juego, Error): ");
                    String tipo = sc.nextLine();
                    RegistroVisitas.filtrarPorTipo(tipo);
                }
                case 4 -> {
                    System.out.print("Fecha (YYYY-MM-DD): ");
                    String fechaStr = sc.nextLine();
                    try {
                        LocalDate fecha = LocalDate.parse(fechaStr);
                        RegistroVisitas.filtrarPorFecha(fecha);
                    } catch (Exception e) {
                        System.out.println("⚠️ Formato de fecha inválido.");
                    }
                }
                case 5 -> parque.mostrarResumenFinal();
                case 6 -> System.out.println("👋 Gracias por visitar Isla Mágica.");
                default -> System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}








