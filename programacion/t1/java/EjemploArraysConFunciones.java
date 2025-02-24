public public class EjemploArraysConFunciones {
    public static void main(String[] args) {
        // Declarar un array de enteros
        int[] miArray = {1, 2, 3, 4, 5};

        // Imprimir el array
        System.out.println("Array original:");
        imprimirArray(miArray);

        // Sumar 2 a cada elemento del array
        sumarAlArray(miArray, 2);

        // Imprimir el array modificado
        System.out.println("Array modificado:");
        imprimirArray(miArray);

        // Calcular la suma de los elementos del array
        int suma = sumarElementosDelArray(miArray);

        // Imprimir la suma
        System.out.println("Suma de los elementos del array: " + suma);
    }

    // Función para imprimir un array
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Función para sumar un valor a cada elemento de un array
    public static void sumarAlArray(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            array[i] += valor;
        }
    }

    // Función para calcular la suma de los elementos de un array
    public static int sumarElementosDelArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
} 
    

