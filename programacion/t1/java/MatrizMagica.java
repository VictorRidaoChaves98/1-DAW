/*
 * Una matriz mágica es una matriz cuadrada en la que la suma de los números en cada fila, cada columna 
 * y ambas diagonales principales es la misma. En otras palabras, todos los totales suman lo mismo.
 * 
 * Para que una matriz sea considerada mágica, debe cumplir las siguientes condiciones:
 * 
 * 1. La suma de sus elementos en cada fila debe ser igual.
 * 2. La suma de los elementos en cada columna debe ser igual.
 * 3. La suma de los elementos de la diagonal principal (de izquierda a derecha) debe ser igual.
 * 4. La suma de los elementos de la diagoal secundaria (de derecha a izquierda) debe ser igual.
 * 
 * Todos los números de la matriz deben ser números enteros positivos y distintos.
 * 
 *      8 1 6
 *      3 5 7
 *      4 9 2
 */

public class MatrizMagica
{
    public static void main(String[] args)
    {
        int [][] matriz = {{8, 1, 6},{3, 5, 7},{4, 9, 2}};
        
        boolean magica = true;

        int tamanyoMatriz = matriz.length;

        int[] sumas = new int[matriz.length * 2 + 2];

        for (int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < tamanyoMatriz; j++)
            {
                // 1. (posiciones: 0 - 2 ==> SUMA DE FILAS) => i = 0; sumas[0] = 15

                sumas[i] = sumas[i] + matriz[i] [j];

                // 2. SUMA DE COLUMNAS

                sumas[i + tamanyoMatriz] += matriz [i] [j];

                // 3. SUMA DE DIAGONAL PRINCIPAL

                if(i == j)
                {
                    sumas[tamanyoMatriz * 2] += matriz [i] [j];
                }

                // 4. SUMA DE DIAGONAL SECUNDARIA

                if (i + j == tamanyoMatriz - 1)
                {
                    sumas[tamanyoMatriz * 2 + 1] += matriz [i] [j];
                }


            }
        }


        int sumaPrimeraFila = sumas[0];

        for (int i = 1; i < sumas.length; i++)
        {
            if(sumas[i] != sumaPrimeraFila)
            {
                magica = false;
                break;
            }
        }
        // DEVOLVER EL RESULTADO SI LA MATRIZ ES MÁGICA

        if (magica)
        {
            System.out.println("La matriz es mágica.");
        }
        else
        {
            System.out.println("La matriz no es mágica.");
        }
    }   
}
