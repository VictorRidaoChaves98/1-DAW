public class User{

    public String DNI;
    public int Codigo;
    public String Nombre;

    public User(int Codigo, String DNI, String Nombre) {
        this.Codigo = Codigo;
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "User [DNI=" + DNI + ", Codigo=" + Codigo + ", Nombre=" + Nombre + "]";
    }

    
}