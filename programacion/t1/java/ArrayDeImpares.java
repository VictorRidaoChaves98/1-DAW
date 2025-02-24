public class ArrayDeImpares {
    public static void main(String[] args) {
        // Declarar un array de enteros para almacenar los números impares
        int[] impares = new int[10];

        // Inicializar el array con los 10 primeros números impares
        for (int i = 0; i < 10; i++) {
            impares[i] = 2 * i + 1;
        }

        // Imprimir el array de impares
        System.out.println("Array de impares:");
        for (int i = 0; i < 10; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}