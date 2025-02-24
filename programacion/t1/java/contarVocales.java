import java.util.Scanner;

public class contarVocales
{

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame un nombre");
    String nombre = sc.nextLine();

    int numeroVocales = contarVocales(nombre);
    
    // caso base

    if (palabra.isEmpty())
    {
        return 0;
    }

    palabra = 

    // caso recursivo

    char caracter = palabra.charAt(0);

    int suma = (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter =='u') ? 1 : 0;

    return suma + contarVocales(palabra.substring(1));
}

}