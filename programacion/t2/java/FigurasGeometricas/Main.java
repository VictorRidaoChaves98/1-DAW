
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Figuras> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));

        for(Figuras figura : figuras)
        {
            figura.ImprimirDetalle();
            System.out.println();
        }
    }    
}
