import java.time.LocalDate;

public class Persona {
    public String nombre;
    public String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(int id, String nombre2, LocalDate fechaNacimiento) {
        //TODO Auto-generated constructor stub
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }
}