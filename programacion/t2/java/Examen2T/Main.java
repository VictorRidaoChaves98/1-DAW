import java.util.Scanner;
public class Main {
    
    @SuppressWarnings({ "ConvertToTryWithResources", "resource", "unused" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n----BIENVENIDOS AL QUINTO COMBATE DE LA VELADA----\n\n----Tomen sus asientos, el combate está a punto de empezar----");

        //---------------SE PRESENTAN LOS PARTICIPANTES-----------------//

        System.out.println("\nLos participantes de esta noche son:");

        Boxeador b1 = new Boxeador("Vladimir,", 27, "Ruso", 80, 40, 0, 97.45);
        Boxeador b2 = new Boxeador("Javier,", 24, "Españolito", 20, 35, 0, 70.10);

        System.out.println("\n!!!Que comience el combate¡¡¡");

        if (b1.getNombre()){
            System.out.println("El boxeador" + b1.getNombre() + " se alza con la victoria");
        }
        else{
            System.out.println("El boxeador" + b1.getNombre() + " ha perdido y es un paquete");
        }

        System.out.println(b1.toString());

        if (b2.getNombre()){
            System.out.println("El boxeador" + b2.getNombre() + " se alza con la victoria");
        }
        else{
            System.out.println("El boxeador" + b2.getNombre() + " ha perdido y es un paquete");
        }

        System.out.println(b2.toString());

    }


}
