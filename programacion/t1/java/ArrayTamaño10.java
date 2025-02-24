// CREAR ARRAY TAMAÑO 10 CON 5 VALORES ORDENADOS
// INSERTAR UN VALOR Y AÑADIRLO PARA QUE SIGA EL ORDEN

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTamaño10
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int[] numeros ={1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        
        
        // 1. Pedir o generar número

        System.out.println("Introduce un número: ");
        
        int newNumber = 4;

        // 2. Encontrar índice donde insertar

        int posicion = 2;

        boolean found = false;

        for(int i = 0; i < numeros.length && !found; i++)
        {
            if(newNumber < numeros[i] || numeros[i] = 0)
            {
                posicion = i;
            }
        }

        // 3. Rotar los valores para hacer espacio para el nuevo valor

        for (int i = numeros.length - 1; i > posicion; i--)
        {
            numeros[i] = numeros[i - 1];
        }

        // 4. Insertar nuevo valor en la posición indicada

        numeros[posicion] = newNumber;

        System.out.println(Arrays.toString(numeros));

    }   
}
