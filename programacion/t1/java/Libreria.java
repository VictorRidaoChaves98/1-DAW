import java.util.Arrays;

import lib.Utils;

public class Libreria
{
    public static void main (String[] args)
    {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(numeros));

        numeros = Utils.add(numeros, 10);
        System.out.println(Arrays.toString(numeros));

        numeros = Utils.pop(numeros, 0);
        System.out.println(Arrays.toString(numeros));
    }    
}
