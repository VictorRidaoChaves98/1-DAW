import java.util.Scanner;

public class EscapeRoom {
    private static final int NUMERO_DE_PUERTAS = 5;
    private static final int NUMERO_DE_OBJETOS = 10;

    private static String[] puertas;
    private static String[] objetos;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        puertas = new String[NUMERO_DE_PUERTAS];
        objetos = new String[NUMERO_DE_OBJETOS];
        scanner = new Scanner(System.in);

        // Inicializar puertas
        for (int i = 0; i < NUMERO_DE_PUERTAS; i++) {
            puertas[i] = "Cerrada";
        }

        // Inicializar objetos
        for (int i = 0; i < NUMERO_DE_OBJETOS; i++) {
            objetos[i] = "Objeto " + (i + 1);
        }
    }

    private static void jugar() {
        while (true) {
            // Mostrar estado del juego
            mostrarEstado();

            // Pedir al jugador que haga algo
            System.out.print("Ingresa una acción: ");
            String accion = scanner.nextLine().toLowerCase();

            // Verificar si la acción es válida
            if (accion.equals("abrir")) {
                abrirPuerta();
            } else if (accion.equals("tomar")) {
                tomarObjeto();
            } else {
                System.out.println("Acción inválida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarEstado() {
        System.out.println("Estado del juego:");
        for (int i = 0; i < NUMERO_DE_PUERTAS; i++) {
            System.out.println("Puerta " + (i + 1) + ": " + puertas[i]);
        }
        for (int i = 0; i < NUMERO_DE_OBJETOS; i++) {
            System.out.println("Objeto " + (i + 1) + ": " + objetos[i]);
        }
    }

    private static void abrirPuerta() {
        // Pedir al jugador que seleccione una puerta
        System.out.print("Seleccione una puerta: ");
        int puerto = scanner.nextInt() - 1;

        // Verificar si la puerta está cerrada
        if (!puertas[portu].equals("Cerrada")) {
            System.out.println("La puerta ya está abierta.");
        } else {
            // Abrir la puerta
            puertas[portu] = "Abierta";
            System.out.println("La puerta " + (puerto + 1) + " está abierta.");
        }
    }

    private static void tomarObjeto() {
        // Pedir al jugador que seleccione un objeto
        System.out.print("Seleccione un objeto: ");
        int objeto = scanner.nextInt() - 1;

        // Verificar si el objeto está disponible
        if (objetos[objeto].equals("Objeto " + (objeto + 1))) {
            System.out.println("El objeto ya está tomado.");
        } else {
            // Tomar el objeto
            objetos[objeto] = "Tomado";
            System.out.println("Ha tomado el objeto " + (objeto + 1) + ".");
        }
    }
}

/*
 * Este código crea un escape room donde el jugador debe abrir puertas y tomar objetos para escapar.
 * El juego se repite hasta que el jugador haya abierto todas las puertas y
 * tomado todos los objetos necesarios para escapar.
 */