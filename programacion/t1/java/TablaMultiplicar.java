import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++)
        {
            int multiplicacion = numero * i;
            System.out.println(numero + " X " + i + " = " + multiplicacion);
        }
    }
    
}
