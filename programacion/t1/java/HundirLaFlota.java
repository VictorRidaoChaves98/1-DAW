import java.util.Random;
import java.util.Scanner;

public class HundirLaFlota {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final int NUMERO_DE_BARCOS = 5;

    private static char[][] tablero;
    private static boolean[][] barcos;
    private static Random random;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        tablero = new char[FILAS][COLUMNAS];
        barcos = new boolean[FILAS][COLUMNAS];
        random = new Random();
        scanner = new Scanner(System.in);

        // Inicializar tablero con agua
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = '~';
            }
        }

        // Colocar barcos aleatoriamente
        for (int i = 0; i < NUMERO_DE_BARCOS; i++) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);
            barcos[fila][columna] = true;
        }
    }

    private static void jugar() {
        while (true) {
            // Mostrar tablero
            mostrarTablero();

            // Pedir coordenadas al jugador
            System.out.print("Ingrese la fila y columna (separadas por espacio): ");
            int fila = scanner.nextInt() - 1;
            int columna = scanner.nextInt() - 1;

            // Verificar si la coordenada es válida
            if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
                System.out.println("Coordenada inválida. Intente de nuevo.");
                continue;
            }

            // Verificar si hay un barco en la coordenada
            if (barcos[fila][columna]) {
                System.out.println("¡Barco hundido!");
                tablero[fila][columna] = 'X';
                barcos[fila][columna] = false;
            } else {
                System.out.println("Agua.");
                tablero[fila][columna] = 'O';
            }

            // Verificar si el juego ha terminado
            if (hasGanado()) {
                System.out.println("¡Felicidades! Has ganado.");
                break;
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < FILAS; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean hasGanado() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (barcos[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
 * Este código crea un tablero de 10x10 y coloca 5 barcos aleatoriamente.
 * El jugador puede ingresar coordenadas para intentar hundir los barcos.
 * Si el jugador acierta un barco, se marca con una 'X' en el tablero.
 * Si el jugador no acierta, se marca con una 'O' en el tablero.
 * El juego termina cuando el jugador ha hundido todos los barcos.
 */