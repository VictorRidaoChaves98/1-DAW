import java.util.Scanner;

public class ArrayIntercalado
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

    //Crear con ARRAY valores directamente
       int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    //Crear con 
       int[] numeros2 = new int[numeros.length];
       int[] numeros3 = new int[numeros.length];

       for (int i = 0; i < numeros2.length; i++)
       {
        numeros2[i] = numeros[i]*10;
       }
       /*
        * numeros = [1,2,3,4]
        * numeros2 = [10,20,30,40]
        */

        //Sumar los arrays
        for(int i = 0; i < numeros3.length; i++)
        {
            numeros3[i] = numeros[i] + numeros2[i];
        }
        //Mostrar los valores de array
        for(int i = 0; i < numeros3.length; i++)
        {
            System.out.println(numeros3[i]);
        }
        
    }
    
}
