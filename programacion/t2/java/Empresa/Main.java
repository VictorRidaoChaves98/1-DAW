
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona trabajador = new Persona("Juan", "Pérez");

        Servicio trabajoPintura = new TrabajoPintura(trabajador, LocalDate.of(2021, 10, 1), "Ana", 100, 10);

        Servicio revisionAlarma = new RevisionAlarma(10, trabajador, LocalDate.of(2021, 10, 1), "Ana");

        System.out.println(trabajoPintura.detalleServicio());

        System.out.println(revisionAlarma.detalleServicio());
    }
}