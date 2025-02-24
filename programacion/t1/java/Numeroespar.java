public class Numeroespar
{
    public static void main(String[] args)
    {
        String primerArgumento = args[0];

        int numero = Integer.parseInt(primerArgumento);

        if(numero % 2 == 0)
        {
            System.out.println("El numero " + numero + " es par");
        }
        else
        {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}