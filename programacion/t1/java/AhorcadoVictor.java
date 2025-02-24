import java.util.Scanner;
public class AhorcadoVictor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al ahorcado, dame la palabrita secretita: ");
        String palabraSecreta = sc.nextLine();

        int numeroIntentos = 7;
        String letrasAdivinadas = "";

        for(int i = 0; i < palabraSecreta.length(); i++)
        {
            // J => i == 0
            // A => i == 1
            // V => i == 2
            // A => i == 3
            char letra = palabraSecreta.charAt(i);

            if(letrasAdivinadas.indexOf(letra) >= 0)
            {
                // HAREMOS ALGO

            }
            else
            {
                System.out.print("_ ");
            }
            
        }

        System.out.println();

        System.out.println("Introduce una letra: ");
        String letraIntento = sc.nextLine();

        if(letrasAdivinadas.indexOf(letraIntento) >= 0)
        {
            System.out.println("Ya has adivinado esta letra");
        }
        else
        {
            // SI LA LETRA EXISTE EN LA PALABRA SECRETA
            for(int i = 0; i < palabraSecreta.length(); i++);
        }
    }
    
}
