import java.util.Scanner;

public class Palindromo


{
    /**
     * COMPROBAR SI UNA PALABRA ES O NO UN PALINDROMO (SE PUEDE LEER IGUAL ADELANTE QUE ATRÁS)
     * ANA
     * OSO
     * ANITA LAVA LA TINA
     */
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la palabra");

        String palabra = sc.nextLine();

        boolean esPalindromo = true;
        int longitudPalabra = palabra.length();

        for(int indice = 0; indice < palabra.length() / 2; indice++)
        {
            if(palabra.charAt(indice) != palabra.charAt(longitudPalabra - indice - 1))
            {
                esPalindromo = false;
            }


        }

        if(esPalindromo)
        {
            System.out.println("La palabra " + palabra +  " es un palindromo");
        }
        else
        {
            System.out.println("La palabra " + palabra +  " no es un palindromo");
        }

        sc.close();


    }
}