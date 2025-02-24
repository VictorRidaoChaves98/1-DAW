import java.util.Scanner;

public class Warhammer {
    private static final int NUMERO_DE_JUGADORES = 2;
    private static final int NUMERO_DE_UNIDADES = 10;

    private static int[][] unidades;
    private static int[][] tablero;
    private static int[][] movimientos;
    private static int[][] ataques;
    private static int[][] daños;
    private static int[][] vida;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        unidades = new int[NUMERO_DE_JUGADORES][NUMERO_DE_UNIDADES];
        tablero = new int[10][10];
        movimientos = new int[NUMERO_DE_JUGADORES][NUMERO_DE_UNIDADES];
        ataques = new int[NUMERO_DE_JUGADORES][NUMERO_DE_UNIDADES];
        daños = new int[NUMERO_DE_JUGADORES][NUMERO_DE_UNIDADES];
        vida = new int[NUMERO_DE_JUGADORES][NUMERO_DE_UNIDADES];
        scanner = new Scanner(System.in);

        // Inicializar unidades
        for (int i = 0; i < NUMERO_DE_JUGADORES; i++) {
            for (int j = 0; j < NUMERO_DE_UNIDADES; j++) {
                unidades[i][j] = i * NUMERO_DE_UNIDADES + j + 1;
                movimientos[i][j] = 1;
                ataques[i][j] = 1;
                daños[i][j] = 1;
                vida[i][j] = 100;
            }
        }

        // Inicializar tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = -1;
            }
        }
    }

    private static void jugar() {
        while (true) {
            // Mostrar estado del juego
            mostrarEstado();

            // Pedir al jugador que haga una acción
            System.out.print("Ingresa una acción: ");
            String accion = scanner.nextLine().toLowerCase();

            // Verificar si la acción es válida
            if (accion.equals("atacar")) {
                atacar();
            } else if (accion.equals("mover")) {
                mover();
            } else {
                System.out.println("Acción inválida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarEstado() {
        System.out.println("Estado del juego:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void atacar() {
        // Pedir al jugador que seleccione una unidad
        System.out.print("Seleccione una unidad: ");
        int unidad = scanner.nextInt() - 1;

        // Verificar si la unidad es válida
        if (unidad < 0 || unidad >= NUMERO_DE_UNIDADES) {
            System.out.println("Unidad inválida. Intente de nuevo.");
            return;
        }

       