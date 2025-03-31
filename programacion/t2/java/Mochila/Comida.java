
import java.util.Date;

public class Comida extends Objeto {

    private Date fechaCaducidad;

    public Comida(String nombre, Date fechaCaducidad) {
        super(nombre);
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Comida [fechaCaducidad=" + fechaCaducidad + "]";
    }

    
    
}
