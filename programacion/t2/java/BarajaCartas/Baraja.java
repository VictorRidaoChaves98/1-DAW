
import java.util.*;

public class Baraja{
    protected  ArrayList<Carta> cartas = new ArrayList<>();

    public void barajar(){
        Collections.shuffle(cartas);
    }

    public void mostrarBaraja(){
        for (Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public void mezclaAmericana(){
        for (Carta carta : cartas){
            System.out.println(carta);
        }
    }

    
}