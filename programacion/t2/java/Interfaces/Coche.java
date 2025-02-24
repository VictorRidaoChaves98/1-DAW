import java.util.Random;

public class Coche implements Vehiculo
{
    @Override
    public void arrancar()
    {
        System.out.println("Arrancando...");
    }
    
    @Override
    public void detener()
    {
        System.out.println("Deteniendo...");

    }

    @Override
    public int velocidadActual()
    {
        Random random = new Random();

        return random.nextInt(120);
    }
}
