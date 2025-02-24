/*
 * Matriz 9x9x9. Creamos un cubo con las caras
 * puestas a 1 y el interior sea 0.
 */

public class MatrizMarcoCubo
{
    public static void main(String[] args)
    {
        // Crear una matriz de 9x9x9
        
        int[][] matriz = new int[9][9][9];

        // Llenar la matriz con el valor 1
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    cubo[i][j][k] = 1;  // Asignar el valor 1 en cada posición
                }
            }
        }

        // Imprimir la matriz en formato de cubo (cada capa por separado)
        for (int i = 0; i < 9; i++) {
            System.out.println("Capa " + (i + 1) + ":");
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    System.out.print(cubo[i][j][k] + " ");  // Imprimir el valor de la matriz
                }
                System.out.println();  // Salto de línea después de cada fila
            }
            System.out.println();  // Salto de línea después de cada capa
        }
    }
}
  

