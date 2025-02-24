import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Adiós");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicacion(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + division(num1, num2));
                    } else {
                        System.out.println("Error: no se puede dividir por cero");
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}

/*
 * Esta calculadora permite realizar operaciones básicas de suma,
 * resta, multiplicación y división.
 * El usuario puede ingresar los números y seleccionar la operación que desea realizar.
 * El programa mostrará el resultado de la operación.
 */