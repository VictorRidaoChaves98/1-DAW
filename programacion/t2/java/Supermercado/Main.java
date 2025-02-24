package Supermercado;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("MERCADOONAAA...MERCADONAAAA...");

        Detergente detergente = new Detergente("Ariel", 10, 1, "Ariel", 10, 0);

        Cereal cereal = new Cereal("Chocapic", 3.99, 2, "Trigo", fecha):

        System.out.println("Las calorías de los Chocapic son: " + cereal.getCalorias());

        Vino vino = new Vino("Alto de Valdoso", 21, 10000, "dulce", 15, 1995);

        if(vino.esVinoDulce())
        {
            System.out.println("El vino es dulce");
        }

        if(vino.esDeAltaGama())
        {
            System.out.println("Es de alta gama");
        }
    }
}
