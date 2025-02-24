/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
import java.util.Scanner;
public class NumeroDigitos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();

        int numeroDigitos = 1;

        while(numero > 10)
        {
            numeroDigitos++;

            numero = numero / 10;

        }

        System.out.println("El número de dígitos es: " + numeroDigitos);

        sc.close();


    }
    
}
