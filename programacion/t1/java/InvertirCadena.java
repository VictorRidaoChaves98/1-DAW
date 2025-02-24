import java.util.Scanner;

public class InvertirCadena
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();
        String palabraInvertida = "";

        int indice = palabra.length() - 1;

        while (indice >= 0)
        {
            palabraInvertida += palabra.charAt(indice);
            indice--;
        }

        System.out.println("La palabra invertida es: " + palabraInvertida);

        sc.close();
    }

    
}
