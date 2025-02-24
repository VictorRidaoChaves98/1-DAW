import java.util.Scanner;

public class DarkSouls {
    private static final int MAX_VIDA = 100;
    private static final int MAX_MANA = 100;
    private static final int MAX_EXPERIENCIA = 1000;
    private static final int NIVEL_INICIAL = 1;
    private static final int PUNTOS_DE_HABILIDAD_INICIALES = 10;

    private static int vida;
    private static int mana;
    private static int experiencia;
    private static int nivel;
    private static int puntosDeHabilidad;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarJuego();
        mostrarMenu();
    }

    private static void inicializarJuego() {
        vida = MAX_VIDA;
        mana = MAX_MANA;
        experiencia = 0;
        nivel = NIVEL_INICIAL;
        puntosDeHabilidad = PUNTOS_DE_HABILIDAD_INICIALES;
        scanner = new Scanner(System.in);
    }

    private static void mostrarMenu() {
        while (true) {
            System.out.println("Menú");
            System.out.println("1. Explorar");
            System.out.println("2. Luchar");
            System.out.println("3. Descansar");
            System.out.println("4. Ver estadísticas");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    explorar();
                    break;
                case 2:
                    luchar();
                    break;
                case 3:
                    descansar();
                    break;
                case 4:
                    verEstadísticas();
                    break;
                case 5:
                    System.out.println("Adiós");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private static void explorar() {
        // Simula la exploración de un área
        System.out.println("Estás explorando un área...");
        int resultado = (int) (Math.random() * 10);
        if (resultado < 5) {
            System.out.println("Encontraste un enemigo");
            luchar();
        } else {
            System.out.println("No encontraste nada");
        }
    }

    private static void luchar() {
        // Simula una batalla
        System.out.println("Estás luchando contra un enemigo...");
        int vidaEnemigo = (int) (Math.random() * 100);
        while (vidaEnemigo > 0) {
            System.out.println("Vida enemigo: " + vidaEnemigo);
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Huir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int daño = (int) (Math.random() * 20);
                    vidaEnemigo -= daño;
                    System.out.println("Le hiciste " + daño + " de daño");
                    break;
                case 2:
                    System.out.println("Te defendiste");
                    break;
                case 3:
                    System.out.println("Huiste");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
        System.out.println("Ganaste la batalla");
        experiencia += 100;
        if (experiencia >= MAX_EXPERIENCIA) {
            nivel++;
            experiencia = 0;
            puntosDeHabilidad += 10;
        }
    }

    private static void descansar() {
        // Simula el descanso
        System.out.println("Estás descansando...");
        vida = MAX_VIDA;
        mana = MAX_MANA;
    }

    private static void verEstadísticas() {
        // Muestra las estadísticas del personaje
        System.out.println("Estadísticas:");
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de habilidad: " + puntosDeHabilidad);
    }
}