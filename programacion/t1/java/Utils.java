import java.util.Arrays;

package lib;

public class Utils
{
    public static int[] pop(int[] numeros)
    {
        return pop(numeros, numeros.length -1);

    }
    
    public static int[] pop(int[] numeros, int index)
    {
        int[] nuevoArray = new int[numeros.length -1];

        for(int i = 0; i < index; i++)
        {
            nuevoArray[i] = numeros[i];
        }
        for (int i = index +1; i < numeros.length; i++)
        {
            nuevoArray[i - 1] = numeros[i];
        }
        
        return nuevoArray;
    }
}
