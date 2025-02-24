public class MiniJuego{

    //Propiedades o atributos, se ponen en PRIVATE  para que los usuarios no accedan a ellas
    private String nombre;
    private String reglas;
    private double tiempo;
    private boolean esGrupal;
    private int numeroJugadores;

    //Constructores
    public MiniJuego(String nombre, String reglas, double tiempo, boolean esGrupal, int numeroJugadores){

        this.nombre = nombre;
        this.reglas = reglas;
        this.tiempo = tiempo;
        this.esGrupal = esGrupal;
        this.numeroJugadores = numeroJugadores;
    }

    //Getters y Setters
    public String nombre(){

        return this.nombre;
    }

    public String reglas(){

        return this.reglas;
    }

    public double tiempo(){

        return this.tiempo;
    }

    public boolean esGrupal(){

        return this.esGrupal;
    }

    public int numeroJugadores(){

        return this.numeroJugadores;
    }

    public void setNombre(String nuevoNombre){

        this.nombre = nuevoNombre;
    }

    public void setReglas(String nuevoReglas){

        this.reglas = nuevoReglas;
    }

    public void setTiempo(double nuevoTiempo){

        this.tiempo = nuevoTiempo;
    }

    public void setEsGrupal(boolean nuevoEsGrupal){

        this.esGrupal = nuevoEsGrupal;
    }

    public void setNumeroJugadores(int numeroJugadores){

        this.numeroJugadores = numeroJugadores;
    }

    @Override // Sirve para sobreescribir
    public String toString(){
        return this.nombre + " - " + this.tiempo;
    }

}