import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Batalla batalla = new Batalla();
        while (true) {
            System.out.println("1. Prepararse antes de la batalla");
            System.out.println("2. Comenzar la batalla");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    batalla.prepararBatalla();
                    break;
                case 2:
                    batalla.comenzarBatalla();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
            }
        }
    }
}
