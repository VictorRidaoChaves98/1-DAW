// Tenemos que borrar un número de la lista, el que el usuario diga
// Le preguntamos al usuario qué número quiere eliminar
// La lista siempre tendrá el mismo número (10), cuando eliminemos uno de ellos tendrá que aparecer un 0 al final de la fila.

import java.util.Arrays;
import java.util.Scanner;


public class ArrayBorrarNumero
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print(Arrays.toString(numeros));

        // 1. Pedir posición al usuario

        System.out.println("Qué número quieres borrar: ");
        
        int indice = Integer.parseInt(console.nextLine());

        int numerosAMover = numeros[indice];
        
        if(indice < numeros.length && indice > 0)
        {
            // 2. Desplazar los números hacia la izquierda hasta la posición indicada
            for (int i = indice; i < numeros.length - 1; i++)
            {
                 numeros[i] = numeros[i - 1];
            }
        }
     

       // 3. Rellenar con un 0 la última posición

       numeros[numeros.length - 1] = numerosAMover;

       System.out.println(Arrays.toString(numeros));

    
    
    
    
    
    
    
    
    }   

}