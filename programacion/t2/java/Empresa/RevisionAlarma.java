
import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
    public int alarmasARevisar;

    public RevisionAlarma(int alarmasARevisar, Persona trabajador, LocalDate fechaInicio, String Cliente) {
        super(trabajador, fechaInicio, Cliente);
        this.alarmasARevisar = alarmasARevisar;
    }

    public int getAlarmasARevisar() {
        return alarmasARevisar;
    }

    public void setAlarmasARevisar(int alarmasARevisar) {
        this.alarmasARevisar = alarmasARevisar;
    }

    @Override
    public String toString() {
        return "RevisionAlarma [alarmasARevisar=" + alarmasARevisar + "]";
    }

    public double costeMaterial() {
        return 0;
    }

    public double costeManoObra() {
        return (alarmasARevisar / 3) * 40;
    }

    public double costeTotal() {
        return costeManoObra();
    }

    public String detalleServicio() {
        return "REVISIÓN PERIÓDICA ALARMAS\r\n" + //
                        "CONTRAINCENDIOS Cliente: (" + getCliente() + ")\r\n" + //
                        "Fecha revisión: (" + getFechaInicio() + ")\r\n" + //
                        "----------------------------------------\r\n" + //
                        "TOTAL: ....... (" + costeTotal() + ")\r\n" + //
                        "--------------------------------------";
    }
}