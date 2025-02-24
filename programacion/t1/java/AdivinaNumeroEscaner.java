import java.util.Scanner;
import java.util.Random;

public class AdivinaNumeroEscaner
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");

        int numeroIntentos=0;
        int numeroUsuario = sc.nextInt();

        Random random = new Random();
        int numeroMaquina = random.nextInt(100) + 1;

        System.out.println("El número de la máquina ha sido: " + numeroMaquina);

        while(numeroMaquina != numeroUsuario && numeroIntentos < 10)
        {
            if(numeroMaquina > numeroUsuario)
            {
                System.out.println("Muy bajo");
            }
            else
            {
                System.out.println("Muy alto");
            }

            numeroIntentos++; // numeroIntentos = numeroIntentos + 1;

            System.out.println("Llevas " + numeroIntentos + " intentos.");

            // Hacemos esto porque por argumentos ya no recibimos nada
            System.out.println("Introduce otro número");
            numeroUsuario = sc.nextInt();

            System.out.println("Mi número es: " + numeroUsuario);
        }
        // Comprobar si el usuario ha adivinado el número
        if (numeroUsuario == numeroMaquina) 
        {
            System.out.println("¡Enhorabuena! Has acertado el número " + numeroUsuario);
        } 
        else 
        {
            System.out.println("El número era: " + numeroMaquina);
        }

    }
}