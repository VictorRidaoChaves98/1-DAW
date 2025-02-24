import java.util.Random;
import java.util.Scanner;

public class Parchis {
    private static final int NUMERO_DE_JUGADORES = 2;
    private static final int NUMERO_DE_DADOS = 25;
    private static final int NUMERO_DE_CARTAS = 5;

    private static int[] dados;
    private static int[] jugador1;
    private static int[] jugador2;
    private static Random random;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        dados = new int[NUMERO_DE_DADOS];
        jugador1 = new int[NUMERO_DE_CARTAS];
        jugador2 = new int[NUMERO_DE_CARTAS];
        random = new Random();
        scanner = new Scanner(System.in);

        // Inicializar dados
        for (int i = 0; i < NUMERO_DE_DADOS; i++) {
            dados[i] = i + 1;
        }

        // Barajar dados
        for (int i = 0; i < NUMERO_DE_DADOS; i++) {
            int posicion = random.nextInt(NUMERO_DE_DADOS);
            int temp = dados[i];
            dados[i] = dados[posicion];
            dados[posicion] = temp;
        }
    }

    private static void jugar() {
        while (true) {
            // Mostrar dados
            mostrarDados();

            // Pedir al jugador 1 que tire un dado
            System.out.print("Jugador 1, presiona Enter para tirar un dado: ");
            scanner.nextLine();
            int dadoTirado = dados[random.nextInt(NUMERO_DE_DADOS)];

            // Mostrar resultado
            System.out.println("Dado tirado: " + dadoTirado);

            // Verificar si el jugador 1 ha ganado
            if (haGanadoJugador1(dadoTirado)) {
                System.out.println("¡Felicidades! Jugador 1 ha ganado.");
                break;
            }

            // Pedir al jugador 2 que tire un dado
            System.out.print("Jugador 2, presiona Enter para tirar un dado: ");
            scanner.nextLine();
            dadoTirado = dados[random.nextInt(NUMERO_DE_DADOS)];

            // Mostrar resultado
            System.out.println("Dado tirado: " + dadoTirado);

            // Verificar si el jugador 2 ha ganado
            if (haGanadoJugador2(dadoTirado)) {
                System.out.println("¡Felicidades! Jugador 2 ha ganado.");
                break;
            }
        }
    }

    private static void mostrarDados() {
        System.out.println("Dado 1: " + jugador1[0]);
        System.out.println("Dado 2: " + jugador1[1]);
        System.out.println("Dado 3: " + jugador1[2]);
        System.out.println("Dado 4: " + jugador1[3]);
        System.out.println("Dado 5: " + jugador1[4]);
    }

    private static boolean haGanadoJugador1(int dadoTirado) {
        // Verificar si el jugador 1 ha ganado
        if (jugador1[0] == dadoTirado) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean haGanadoJugador2(int dadoTirado) {
        // Verificar si el jugador 2 ha ganado
        if (jugador2[0] == dadoTirado) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 * Este código crea un juego de Parchís para dos jugadores.
 * Cada jugador tiene 5 dados y el objetivo es obtener el número más alto posible.
 * El juego se repite hasta que uno de los jugadores gane.
 */
