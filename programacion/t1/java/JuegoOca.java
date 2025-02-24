import java.util.Scanner;
import java.util.Random;

public class JuegoOca
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String nombrePersona = sc.nextLine();
        
        String mensajeMenu = "Bienvenido al juego de la Oca " nombrePersona + "\n";
        mensajeMenu += "Quien comienza?\nOpción 1:" +nombrePersona + "\n" + "Opción 2: maquina";

        System.out.println(mensajeMenu);

        int opcionElegida = sc.nextInt();
        System.out.println("Opcion elegida: " + opcionElegidaComienzo);

        int casillaJugador = 1;
        int casillaMaquina = 1;
        int rondas = 1;

        final int casillaFinal = 63;
        final int casillaOca = 5;
        final int casillaPuente6 = 6;
        final int casillaPuente12 = 12;
        final int casillaMuerte = 58;

        final int opcionLanzarDado = 1;
        final int opcionMostrarCasilla = 2;

        boolean turnoJugador = opcionElegidaComienzo == 1 ? true : false;

        while (casillaJugador != casillaFinal && casillaMaquina != casillaFinal)
        {
            System.out.println("*********RONDA " + rondas + "*********");
            System.out.println(nombrePersona + ": " + casillaJugador);
            System.out.println("Maquina: " + casillaMaquina);
            System.out.println ("1. Lanzar dados\n 2. Ver posiciones");
            
            int opcionElegida = sc.nextInt();

            if (turnoJugador)
            {
                if(opcionElegida == opcionLanzarDado)
                {
                    int dado = (int) (Math.random() * 6 + 1);
                    casillaJugador += dado;
                }
            }
            else
            {

            }
            if(opcionElegida == opcionLanzarDado)
            {
                int dado = (int) (Math.random());
            }
        }

    }
    
}
