import java.time.LocalDate;

public class Profesor extends Persona {
    
    private LocalDate horario;

    public Profesor(int id, String nombre, LocalDate fechaNacimiento, LocalDate horario) {
        super(id, nombre, fechaNacimiento);
        this.horario = horario;
    }

    public LocalDate getHorario() {
        return horario;
    }

    public void setHorario(LocalDate horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Profesor [horario=" + horario + "]";
    }

    
}
