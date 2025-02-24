import java.util.Random;
import java.util.Scanner;

public class ElEscondite {
    private static final int NUMERO_DE_JUGADORES = 2;
    private static final int NUMERO_DE_ESCONDITES = 10;

    private static int[] escondites;
    private static int[] jugadores;
    private static Random random;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        escondites = new int[NUMERO_DE_ESCONDITES];
        jugadores = new int[NUMERO_DE_JUGADORES];
        random = new Random();
        scanner = new Scanner(System.in);

        // Inicializar escondites
        for (int i = 0; i < NUMERO_DE_ESCONDITES; i++) {
            escondites[i] = i + 1;
        }

        // Inicializar jugadores
        for (int i = 0; i < NUMERO_DE_JUGADORES; i++) {
            jugadores[i] = 0;
        }
    }

    private static void jugar() {
        while (true) {
            // Mostrar estado del juego
            mostrarEstado();

            // Pedir al jugador 1 que esconda
            System.out.print("Jugador 1, esconda en un escondite: ");
            int escondite = scanner.nextInt() - 1;

            // Verificar si el escondite es válido
            if (escondite < 0 || escondite >= NUMERO_DE_ESCONDITES) {
                System.out.println("Escondite inválido. Intente de nuevo.");
                continue;
            }

            // Esconder al jugador 1
            jugadores[0] = escondite;

            // Pedir al jugador 2 que busque
            System.out.print("Jugador 2, busca al jugador 1: ");
            int busca = scanner.nextInt() - 1;

            // Verificar si el jugador 2 ha encontrado al jugador 1
            if (busca == jugadores[0]) {
                System.out.println("¡Encontrado! Jugador 2 ha ganado.");
                break;
            } else {
                System.out.println("No encontrado. Intente de nuevo.");
            }
        }
    }

    private static void mostrarEstado() {
        System.out.println("Estado del juego:");
        for (int i = 0; i < NUMERO_DE_ESCONDITES; i++) {
            System.out.println("Escondite " + (i + 1) + ": " + escondites[i]);
        }
        for (int i = 0; i < NUMERO_DE_JUGADORES; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + jugadores[i]);
        }
    }
}

/*
 * Este código crea un juego del escondite para dos jugadores.
 * El jugador 1 esconde en un escondite y el jugador 2 busca al jugador 1.
 * El juego se repite hasta que el jugador 2 haya encontrado al jugador 1.
 */