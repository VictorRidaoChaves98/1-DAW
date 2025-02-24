import java.util.Random;
import java.util.Scanner;

public class Oca {
    private static final int NUMERO_DE_CASILLAS = 63;
    private static final int NUMERO_DE_JUGADORES = 2;

    private static int[] tablero;
    private static int[] jugador1;
    private static int[] jugador2;
    private static Random random;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        tablero = new int[NUMERO_DE_CASILLAS];
        jugador1 = new int[NUMERO_DE_JUGADORES];
        jugador2 = new int[NUMERO_DE_JUGADORES];
        random = new Random();
        scanner = new Scanner(System.in);

        // Inicializar tablero
        for (int i = 0; i < NUMERO_DE_CASILLAS; i++) {
            tablero[i] = i + 1;
        }
    }

    private static void jugar() {
        while (true) {
            // Mostrar tablero
            mostrarTablero();

            // Pedir al jugador 1 que tire un dado
            System.out.print("Jugador 1, presiona Enter para tirar un dado: ");
            scanner.nextLine();
            int dadoTirado = random.nextInt(6) + 1;

            // Mover jugador 1
            jugador1[0] += dadoTirado;
            if (jugador1[0] > NUMERO_DE_CASILLAS) {
                jugador1[0] = NUMERO_DE_CASILLAS;
            }

            // Verificar si jugador 1 ha llegado a la meta
            if (jugador1[0] == NUMERO_DE_CASILLAS) {
                System.out.println("¡Felicidades! Jugador 1 ha ganado.");
                break;
            }

            // Pedir al jugador 2 que tire un dado
            System.out.print("Jugador 2, presiona Enter para tirar un dado: ");
            scanner.nextLine();
            dadoTirado = random.nextInt(6) + 1;

            // Mover jugador 2
            jugador2[0] += dadoTirado;
            if (jugador2[0] > NUMERO_DE_CASILLAS) {
                jugador2[0] = NUMERO_DE_CASILLAS;
            }

            // Verificar si jugador 2 ha llegado a la meta
            if (jugador2[0] == NUMERO_DE_CASILLAS) {
                System.out.println("¡Felicidades! Jugador 2 ha ganado.");
                break;
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("  +---------------------------------------+");
        for (int i = 0; i < NUMERO_DE_CASILLAS; i++) {
            System.out.print("  | " + tablero[i]);
            if (jugador1[0] == i + 1) {
                System.out.print(" (J1)");
            }
            if (jugador2[0] == i + 1) {
                System.out.print(" (J2)");
            }
            System.out.println();
        }
        System.out.println("  +---------------------------------------+");
    }
}

/*
 * Este código crea un juego de la Oca para dos jugadores.
 * Cada jugador tiene un token que se mueve por el tablero según el resultado de un dado.
 * El objetivo es llegar a la meta (la casilla 63) antes que el otro jugador.
 */