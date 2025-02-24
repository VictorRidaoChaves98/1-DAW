import java.util.Scanner;
import java.util.Random;

public class JuegoPiedraPapelTijera
{
    public static void main(String[] args)
    {
        final int opcionPiedra = 1;
        final int opcionPapel = 2;
        final int opcionTijera = 3;

        Scanner sc = new Scanner(System.in);
        String salida = "";
        

        String mensaje = "Elige una opción: \n" +
        "1. Piedra\n" +
        "2. Papel\n" +
        "3. Tijera\n";

        System.out.println(mensaje);

        Random rand = new Random();
        int opcionUsuario = sc.nextInt();
        int opcionMaquina = rand.nextInt(3) + 1;

        //Opción usuario
        if(opcionUsuario == opcionPiedra)
        {
            System.out.println("Usuario ha elegido: Piedra");
        }
        else if(opcionUsuario == opcionPapel)
        {
            System.out.println("Usuario ha elegido: Papel");
        }
        else
        {
            System.out.println("Usuario ha elegido: Tijera");
        }

        //Opción máquina
        if(opcionUsuario == opcionPiedra)
        {
            System.out.println("Máquina ha elegido: Piedra");
        }
        else if(opcionUsuario == opcionPapel)
        {
            System.out.println("Máquina ha elegido: Papel");
        }
        else
        {
            System.out.println("Máquina ha elegido: Tijera");
        }

        //Determina el ganador
        if (opcionUsuario == opcionMaquina)
        {
            System.out.println("Es un empate");
        }
        //Las opciones que tiene el usuario para ganar
        else if( (opcionUsuario == opcionPiedra && opcionMaquina == opcionTijera)
            ||  (opcionUsuario == opcionPapel && opcionMaquina == opcionPiedra)
            ||  (opcionUsuario == opcionTijera && opcionMaquina == opcionPapel))
        {
            System.out.println("El usuario ha ganado");
        }
        else
        {
            System.out.println("La máquina ha ganado");
        }

        String mensajeSalida = "¿Quieres seguir jugando? (Y/N)";
        System.out.println(mensajeSalida);

        salida = sc.next();
    }

}