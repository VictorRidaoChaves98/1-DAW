
import java.time.LocalDate;

public abstract class Servicio {
    public Persona trabajador;
    public LocalDate fechaInicio;
    public String Cliente;

    public Servicio(Persona trabajador, LocalDate fechaInicio, String Cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.Cliente = Cliente;
    }

    public Persona getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Persona trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    @Override
    public String toString() {
        return "Servicio [trabajador=" + trabajador + ", fechaInicio=" + fechaInicio + ", Cliente=" + Cliente + "]";
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();
}