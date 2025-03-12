import java.util.Date;

public class Movimiento {
    
    public String NumeroCuenta;
    public double Valor;
    public Date Fecha;
    public String Accion;
    public String ID_Transaccion;

    public Movimiento(String Accion, Date Fecha, String ID_Transaccion, String NumeroCuenta, double Valor) {
        this.Accion = Accion;
        this.Fecha = Fecha;
        this.ID_Transaccion = ID_Transaccion;
        this.NumeroCuenta = NumeroCuenta;
        this.Valor = Valor;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public String getID_Transaccion() {
        return ID_Transaccion;
    }

    public void setID_Transaccion(String ID_Transaccion) {
        this.ID_Transaccion = ID_Transaccion;
    }

    @Override
    public String toString() {
        return "Movimiento [NumeroCuenta=" + NumeroCuenta + ", Valor=" + Valor + ", Fecha=" + Fecha + ", Accion="
                + Accion + ", ID_Transaccion=" + ID_Transaccion + "]";
    }

    

}
