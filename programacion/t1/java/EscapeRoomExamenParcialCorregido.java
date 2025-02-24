import java.util.*;

public class EscapeRoomExamenParcialCorregido
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos al Escape Room ADA ITS.\n" + "Introduzca su nombre: ");

        String nombreJugador = sc.nextLine();

        System.out.println("Dame la palabra");

        String palabra = sc.nextLine();

        String palabraResuelta = "";

        for(int indice = 0; indice < palabra.length(); indice +=2)
        {
            // ANAKIN => NAKANI =>
            // 0 => 1 y 1 => 0
            // 2 => 3 y 3 => 2
            // 4 => 5 y 5 => 4

            //ESTO LO HACEMOS PARA CONTROLAR LAS PALABRAS IMPARES

            if (indice + 2 > palabra.length())
            {
                palabraResuelta += "";
                palabraResuelta += palabra.charAt(indice);
            }
            else
            {
                palabraResuelta += palabra.charAt(indice + 1);
                palabraResuelta += palabra.charAt(indice);
            }
        }

        System.out.println(palabraResuelta);

        //COMPROBAMOS QUE LA PALABRA SEA CORRECTA Y PASAMOS A LA SIGUIENTE SALA

        if ("NAKANI".equals(palabraResuelta))
        {
            //SALA 2

            int numeroIntentos = 15;
            int pasos = 0;
            final int pasosMeta = 10;

            while (numeroIntentos > 0 && pasos < pasosMeta)
            {
                System.out.println("Intentos restantes: " + numeroIntentos);
                System.out.println("Pasos actuales: " + pasos);
                System.out.println("Elige un color (1. Rojo, 2. Verde, 3. Azul): ");

                int opcionColor = sc.nextInt();
                int probabilidad = Random.nextInt(100) + 1;

                switch (opcionColor)
                {
                    case rojo:
                        if(probabilidad < 30)
                        {
                            System.out.println("Escudo mágico activado. No pierdes pasos.");
                        }
                        else
                        {
                            pasos--;
                            System.out.println("Retrocedes 1 paso.");
                        }
                        break;

                    case verde:
                        if(probabilidad < 50)
                        {
                            pasos--;
                            System.out.println("Has caído en la trampa, retrocedes 1 paso.");
                        }
                        else
                        {
                            pasos+= 2;
                            System.out.println("Avanzas 2 pasos.");
                        }

                        break;

                    case azul;
                        if(probabilidad < 80)
                        {
                            pasos+= 3;
                            System.out.println("Hechizo activado, avanzas 3 pasos");
                        }
                        else
                        {
                            pasos = 0;
                            System.out.println("Regresas al inicio");
                        }
                        break;

                    default:

                        System.out.println("Color no válido. Pierdes un intento por tonto.");

                        numeroIntentos--;
                        
                        break;
                }

                //LE QUITAMOS UN INTENTO

                numeroIntentos--;
                
            }

        }
        
    }
}
