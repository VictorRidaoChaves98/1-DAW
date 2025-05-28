import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parque parque = new Parque();
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("====BIENVENIDO A ISLA MÁGICA====");
                System.out.println("1. Un día en el parque");
                System.out.println("2. Mostrar lo que se ha hecho durante todo el día");
                System.out.println("3. Mostrar evento concreto del parque");
                System.out.println("4. Filtrar por fecha concreta");
                System.out.println("5. Resumen del día");
                System.out.println("6. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    case 1 -> parque.simularDia();
                    case 2 -> RegistroVisitas.mostrarHistorial();
                    case 3 -> {
                        System.out.print("Tipo de evento (Entrada, Atracción, Pedido, Juego, Error): ");
                    }
                    case 4 -> {
                        System.out.print("Fecha (aaaa-mm-dd): ");
                        String fechaStr = sc.nextLine();
                        try {
                            LocalDate fecha = LocalDate.parse(fechaStr);
                            RegistroVisitas.filtrarPorFecha(fecha);
                        } catch (Exception e) {
                            System.out.println("Fecha errónea, \n por favor pruebe de neuvo");
                        }
                    }
                    case 5 -> parque.mostrarResumenFinal();
                    case 6 -> System.out.println("Gracias por su visita");
                }
                
            } while (opcion != 6);
        }
    }
}