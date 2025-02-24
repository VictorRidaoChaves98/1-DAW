import java.util.Scanner;

public class CajaDeCambioFuncional {
    private static final int[] VALORES_MONEDAS = {1, 2, 5, 10, 20, 50, 100, 200, 500};
    private static final int[] VALORES_BILETES = {5, 10, 20, 50, 100, 200, 500};
    private static final int CANTIDAD_MONEDAS = VALORES_MONEDAS.length;
    private static final int CANTIDAD_BILETES = VALORES_BILETES.length;
    private static final int MONEDA_2_EUROS = 0;
    private static final int MONEDA_1_EURO = 1;
    private static final int MONEDA_50_CENTS = 2;
    private static final int MONEDA_20_CENTS = 3;
    private static final int MONEDA_10_CENTS = 4;
    private static final int MONEDA_5_CENTS = 5;
    private static final int MONEDA_2_CENTS = 6;
    private static final int MONEDA_1_CENT = 7;
    private static final int BILLETE_5_EUROS = 0;
    private static final int BILLETE_10_EUROS = 1;
    private static final int BILLETE_20_EUROS = 2;
    private static final int BILLETE_50_EUROS = 3;
    private static final int BILLETE_100_EUROS = 4;
    private static final int BILLETE_200_EUROS = 5;
    private static final int BILLETE_500_EUROS = 6;

    private static int[] monedas;
    private static int[] billetes;
    private static Scanner scanner;

    public static void main(String[] args) {
        inicializarCajaDeCambio();
        mostrarMenu();
    }

    private static void inicializarCajaDeCambio() {
        monedas = new int[CANTIDAD_MONEDAS];
        billetes = new int[CANTIDAD_BILETES];
        scanner = new Scanner(System.in);

        // Inicializar monedas
        for (int i = 0; i < CANTIDAD_MONEDAS; i++) {
            monedas[i] = 0;
        }

        // Inicializar billetes
        for (int i = 0; i < CANTIDAD_BILETES; i++) {
            billetes[i] = 0;
        }
    }

    private static void mostrarMenu() {
        while (true) {
            System.out.println("Menú");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Ingresar billetes");
            System.out.println("3. Realizar compra");
            System.out.println("4. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarMonedas();
                    break;
                case 2:
                    ingresarBilletes();
                    break;
                case 3:
                    realizarCompra();
                    break;
                case 4:
                    System.out.println("Adiós");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private static void ingresarMonedas() {
        while (true) {
            System.out.println
        }
    }
}