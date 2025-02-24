import java.util.Scanner;
public class OrdenArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length -10; i++)
        {
            System.out.println("Dame un número: " + (i + 1) + " : ");

            numeros[i] = sc.nextInt();
        }
        for (int numero : numeros)
        {
               
        }
    }   
}
