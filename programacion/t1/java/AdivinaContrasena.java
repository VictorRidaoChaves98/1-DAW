import java.util.Scanner;

public class AdivinaContrasena
{
    public static void main(String[] args)
    {
        String passwordGuardado = "Victor";

        Scanner sc = new Scanner(System.in);

        String passwordUsuario;

        do
        {
            System.out.println("Dime la contraseña: ");
            passwordUsuario = sc.nextLine();
            
            if (!passwordGuardado.equals(passwordUsuario))
            {
                System.out.println("La contraseña es incorrecta, prueba otra vez");
            }

        }
        while (!passwordGuardado.equals(passwordUsuario));

        System.out.println("Contraseña correcta");

        sc.close();        

    }
}