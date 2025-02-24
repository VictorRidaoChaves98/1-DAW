/* 
 * Pedir un numero N, y mostrar todos los numeros del 1 al N.
*/
import java.util.Scanner;

public class CalcularMedia 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número");
        int numero = sc.nextInt();

        int indice = 1;
        
        while(indice <= numero)
        {
            System.out.println(indice);

            indice++;
        }

        sc.close();


    }
    
    
}
