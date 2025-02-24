import java.util.Scanner;

public class Bang 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego de los vaqueros. Inserte su nombre: ");
        String nombreJugador = sc.nextLine();

        System.out.println("El juego esta a punto de comenzar, agarrense los machos");

        boolean vidaJugador = true;
        boolean vidaMaquina = true;

        int balasJugador = 0;
        int balasMaquina = 0;
        int rondas = 1;

        final int recargar = 1;
        final int bloquear = 2;
        final int disparar = 3;

        boolean jugarOtraVez = true;

        while (jugarOtraVez) 
        {
            while(vidaJugador && vidaMaquina)
            {
                System.out.println("*** Ronda " + rondas + " ***");

                System.out.println(" 1. Recargar\n 2. Bloquear\n 3. Disparar");

                int movimientoJugador;
                int movimientoMaquina = rondas == 1 ? recargar : (int) (Math.random() * 3 + 1);

                boolean jugadorDisparadoConBala = true;
                boolean maquinaDisparadoConBala = true;

                do
                {
                    System.out.print("Selecciona un movimiento: ");
                    movimientoJugador = sc.nextInt();

                    if(movimientoJugador == disparar && balasJugador == 0)
                    {
                        System.out.println("No puedes disparar sin balas. Selecciona otra opcion.");
                    }
                    else if(movimientoJugador == bloquear && balasMaquina == 0)
                    {
                        System.out.println("No bloquees porque la maquina no tiene balas.");
                    }
                }
                while (movimientoJugador == disparar && balasJugador == 0
                    || balasMaquina == 0 && movimientoJugador == bloquear);

                switch (movimientoJugador) {
                    case recargar:

                        balasJugador++;
                        System.out.println(nombreJugador + " ha recargado una bala.");
                        break;

                    case bloquear:

                        System.out.println(nombreJugador + " ha bloqueado.");
                        break;

                    case disparar:

                        if (balasJugador > 0) {
                            balasJugador--;
                            System.out.println(nombreJugador + " ha disparado.");
                        } else {
                            jugadorDisparadoConBala = false;
                            System.out.println(nombreJugador + "ha intentado disparar pero no tenia balas.");
                        }
                        break;

                    default:

                        System.out.println("Movimiento no valido.");
                        break;
                }
                
                if (rondas != 1)
                {
                    do
                    {
                        System.out.print("Selecciona un movimiento: ");
                        movimientoMaquina = (int) (Math.random() * 3) + 1;
    
                        if(movimientoMaquina == disparar && balasMaquina == 0)
                        {
                            System.out.println("No puedes disparar sin balas. Selecciona otra opcion.");
                        }
                    }
                    while(movimientoMaquina == disparar && balasMaquina == 0
                        || balasJugador == 0 && movimientoMaquina == bloquear);
                }

                switch (movimientoMaquina) 
                {
                    case recargar:

                        balasMaquina++;
                        System.out.println("La maquina ha recargado una bala.");
                        break;

                    case bloquear:

                        System.out.println("La maquina ha bloqueado.");
                        break;

                    case disparar:

                        if (balasMaquina > 0) 
                        {
                            balasMaquina--;
                            System.out.println("La maquina ha disparado.");
                        } 
                        else 
                        {
                            maquinaDisparadoConBala = false;
                            System.out.println("La maquina ha intentado disparar pero no tenia balas.");
                        }
                        break;

                    default:

                        System.out.println("Movimiento no valido.");
                        break;
                }

                // ¿QUE HA PASADO?
                if ( (jugadorDisparadoConBala && movimientoJugador == disparar && movimientoMaquina == recargar) ||
                        (jugadorDisparadoConBala && movimientoJugador == disparar && movimientoMaquina == disparar && !maquinaDisparadoConBala)) 
                {
                    System.out.println("Has ganado a la maquina");
                    vidaMaquina = false;
                } 
                else if ( (maquinaDisparadoConBala && movimientoMaquina == disparar && movimientoJugador == recargar) ||
                        (maquinaDisparadoConBala && movimientoMaquina == disparar && movimientoJugador == disparar && !jugadorDisparadoConBala)) 
                {
                    System.out.println("Ha gana la maquina");
                    vidaJugador = false;
                } 
                else 
                {
                    System.out.println("El juego continua ...");
                }

                rondas++;
            }
            
            System.out.println("Quieres jugar de nuevo? (Y/N)");
            String respuesta = sc.next();

            if(respuesta.toUpperCase().equals("N"))
            {
                jugarOtraVez = false;
            }

            // Restear todas las variables
            vidaJugador = true;
            vidaMaquina = true;

            balasJugador = 0;
            balasMaquina = 0;
            rondas = 1;
        }
    }
}