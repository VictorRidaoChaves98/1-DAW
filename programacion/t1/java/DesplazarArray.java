//ROTAR LOS ARRAYS
// El array es: [1, 2, 3, 4, 5, 6, 7, 8, 0, 0]
// El usuario debe introducir un número ==> Ejemplo 23 (usar el escaner)
// Así debe quedar ^[23, 1, 2, 3, 4, 5, 6, 7, 8, 0]
// Un array de 10 posiciones en donde coloquemos un nuevo número al principio que empuje hacia delante los siguientes y así sucesivo.
// PRIMERO DESPLAZAR VALORES
// Guardar N en arr[0]

import java.util.Arrays;
import java.util.Scanner;

public class DesplazarArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //int[] numeros ={1, 2, 3, 4, 5, 6, 7, 8, 0, 0};

        int[] numeros = new int[10];

        System.out.println("Dime un número: ");
        
        for (int i = 0; i < numeros.length - 2; i++)
        { 
            numeros[i] = i + 1;
        }

        System.out.println(Arrays.toString(numeros));
        
        int random = (int) (Math.random() * 100) + 1;

        System.out.println("El número generado es: " + random);

        // Desplazo los valores

        for (int i = numeros.length - 1; i >= 1; i--)
        {
            numeros[i] = numeros[i - 1];    
        }

        // Guardo el Número en la primera posición

        numeros[0] = random;
        
        System.out.println(Arrays.toString(numeros));
        
    }   

}
