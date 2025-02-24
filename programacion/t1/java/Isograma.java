import java.util.Scanner;
public class Isograma
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una palabra: ");

        String letra = sc.nextLine();
        String palabra = sc.nextLine();
        String indice = sc.nextLine();

        boolean esIsograma = true;
        int longitudPalabra = palabra.length();

        for(int letra = 0; letra < palabra.length() -1; letra++)
        {
            if(palabra.charAt(indice) != palabra.charAt(longitudPalabra - indice - 1))
            {
                esIsograma = false;
                break;
            }

        }
        if (esIsograma)
        {
            System.out.println("La palabra " + palabra +  " es un Isograma");
        }
        else
        {
            System.out.println("La palabra " + palabra +  " no es un Isograma");
        }

        sc.close();

        
    }
    
}
