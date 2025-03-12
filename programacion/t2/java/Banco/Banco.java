import java.util.ArrayList;

public class Banco {
    
    private User Users[];
    private Cuenta Cuentas[];
    private Movimento Movimientos[];

    void CrearDatos(){

        Users = new ArrayList<User>();
        Cuentas = new ArrayList<Cuenta>();
        Movimientos = new ArrayList<Movimiento>();
        Users.add(new User());
        

    }

    public Banco(){

        crearDatos();
    }

}
