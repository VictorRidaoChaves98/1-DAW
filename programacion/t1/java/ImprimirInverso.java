import java.util.*;

public class ImprimirInverso
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final int N = Integer.parseInt(args[0]);
        int[] numeros = new int[N];

        for(int i = 0; i < numeros.length; i++)
        {
            numeros[i] = i + 1;
        }
        for(int i= 0; i < numeros.length / 2; i++)
        {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
        if(numeros.length % 2 != 0)
        {
            System.out.print(numeros[numeros.length/2] + " ");
        }
    
    }
}
