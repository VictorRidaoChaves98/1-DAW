import java.util.Arrays;

public class Cuenta {
    
    public String DNI_USER;
    public double Saldo;
    public String NumeroCuenta;
    public Movimiento Movimientos[];

    public Cuenta(String DNI_USER, Movimiento Movimientos[], String NumeroCuenta, double Saldo) {
        this.DNI_USER = DNI_USER;
        this.Movimientos = Movimientos;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
    }

    public String getDNI_USER() {
        return DNI_USER;
    }

    public void setDNI_USER(String DNI_USER) {
        this.DNI_USER = DNI_USER;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public Movimiento[] getMovimientos() {
        return Movimientos;
    }

    public void setMovimientos(Movimiento[] Movimientos) {
        this.Movimientos = Movimientos;
    }

    @Override
    public String toString() {
        return "User [DNI_USER=" + DNI_USER + ", Saldo=" + Saldo + ", NumeroCuenta=" + NumeroCuenta + ", Movimientos="
                + Arrays.toString(Movimientos) + "]";
    }

}
