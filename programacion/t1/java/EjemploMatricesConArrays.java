public class EjemploMatricesConArrays {
    public static void main(String[] args) {
        // Declarar una matriz de enteros
        int[][] miMatriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        System.out.println("Matriz original:");
        imprimirMatriz(miMatriz);

        // Sumar 2 a cada elemento de la matriz
        sumarAlaMatriz(miMatriz, 2);

        // Imprimir la matriz modificado
        System.out.println("Matriz modificado:");
        imprimirMatriz(miMatriz);

        // Calcular la suma de los elementos de la matriz
        int suma = sumarElementosDeLaMatriz(miMatriz);

        // Imprimir la suma
        System.out.println("Suma de los elementos de la matriz: " + suma);
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para sumar un valor a cada elemento de una matriz
    public static void sumarAlaMatriz(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] += valor;
            }
        }
    }

    // Función para calcular la suma de los elementos de una matriz
    public static int sumarElementosDeLaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}

//En este ejemplo, se declaran tres funciones:

// 1.imprimirMatriz: imprime los elementos de una matriz.
// 2.sumarAlaMatriz: suma un valor a cada elemento de una matriz.
// 3.sumarElementosDeLaMatriz: calcula la suma de los elementos de una matriz.

// La función main crea una matriz de enteros, la imprime, suma 2 a cada elemento,
// la vuelve a imprimir y calcula la suma de los elementos.

// El resultado de la ejecución del programa será:

//Matriz original:
//  1 2 3 
//  4 5 6 
//  7 8 9 
//Matriz modificado:
//  3 4 5 
//  6 7 8 
//  9 10 11 
// Suma de los elementos de la matriz: 66