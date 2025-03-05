import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<IVehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Autobus(4, 0, 20, "Centro - Aeropuerto", 100));

        vehiculos.add(new Tranvia(false, "Ecija", 20, "Circular", 30));

        for (IVehiculo vehiculo : vehiculos){

            vehiculo.mostarInformacion();
            vehiculo.arrancar();
            vehiculo.parar();
        }

    }
}
