import java.util.Scanner;

public class ConvertirDollarAEuro
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de Dollar:");

        double Dollar = sc.nextInt();

        double Euro = 0.91;
        
        System.out.println("Euros: " + Dollar * Euro);

    }
}