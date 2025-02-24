import java.util.*;

public class EscapeRoomExamenParcial
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenidos al Escape Room ADA ITS.\nPor favor, introduzca su nombre: ");
        String nombreJugador = sc.nextLine();
        String eleccionJugador = sc.nextLine();
        
        /*ESTA ES LA PRIMERA SALA DEL ESCAPE ROOM */
        
        System.out.println("Bienvenido " + nombreJugador + "," + " vamos al lío.\n-----------------------------------\n**** Sala 1: Encuentro con Darth Vader ****");
        
        System.out.println("Para derrotarme, debes encontrar la fuerza oculta en las palabras.\nSolo si logras descifrar el código secreto podrás escapar de esta sala.\nEl Lord Sith te exige que le des una palabra:\n");
        String palabra = sc.nextLine();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabra.length(); i += 2)
        {

            if (i + 1 < palabra.length())
            {
                resultado.append(palabra.charAt(i + 1));  
                resultado.append(palabra.charAt(i));
            }
            else
            {
                resultado.append(palabra.charAt(i));
            }
        }

        System.out.println(resultado.toString());
        System.out.println("¡Es una palabra válida, has logrado pasar a la siguiente sala!");
        
        //*ESTA ES LA SEGUNDA SALA DEL ESCAPE ROOM */

       System.out.println("No fue para tanto, ¿ no, " + nombreJugador + "?" + " sigamos.\n-----------------------------------\n**** Sala 2: El Laberinto de los Colores ****");

       System.out.println("¡Bienvenido al Laberinto de los Colores!\nObjetivo: Alcanzar exactamente 10 pasos antes de que se acaben los 15 intentos.");

        boolean jugarOtraVez = true;

       int numeroIntentos = 0;
       int totalIntentos = 15;

       int numeroPasos = 0;
       int totalPasos = 10;

       int rondas = 1;

       int CaminoRojo = 1;
       int CaminoVerde = 2;
       int CaminoAzul = 3;

       boolean seguirJugando = true;

    


       //*ESTA ES LA SALA FINAL DEL ESCAPE ROOM */

       System.out.println("Enhorabuenaaa has llegado al final del Escape Room.\n¿Quieres jugar de nuevo? (Y/N)");
            String respuesta = sc.next();

            if(respuesta.toUpperCase().equals("N"))
            {
                jugarOtraVez = false;
            }



      
      







    }  

}
