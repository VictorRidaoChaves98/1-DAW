
import java.util.Random;

public class Jugador{


    //Propiedades o atributos
    private String nombre;
    private int numero;
    private double deuda;
    private int juegosGanados;
    private boolean vivo;
    private int rondaEliminada;


    //Constructor
    public Jugador(String nombre, int numero, double deuda, int juegosGanados, boolean vivo){

        this.nombre = nombre;
        this.numero = numero;
        this.deuda = deuda;
        this.juegosGanados = juegosGanados;
        this.vivo = vivo;
        this.rondaEliminada = 0; // La de ronda eliminada no se pone porque no sabemos cuando será eliminado.
    }


    //Getters y Setters
    public String getNombre(){

        return this.nombre;
    }
    
    public int getNumero(){

        return this.numero;
    }

    public double getDeuda(){

        return this.deuda;
    }

    public int getJuegosGanados(){

        return this.juegosGanados;
    }

    public boolean getVivo(){

        return this.vivo;
    }

    public int getRondaEliminado(){

        return this.rondaEliminada;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public void setNumero(int numero){

        this.numero = numero;
    }

    public void setDeuda(double deuda){

        this.deuda = deuda;
    }

    public void setJuegosGanados(int juegosGanados){

        this.juegosGanados = juegosGanados;
    }

    public void setVivo(boolean vivo){

        this.vivo = vivo;
    }

    public void setRondaEliminada(int rondaEliminada){

        this.rondaEliminada = rondaEliminada;
    }

    public void jugar(){

        Random random = new Random();

        int numero = random.nextInt(100) + 1;

        if (numero > 50){

            setVivo(false);
        }
    }

    public void asesinar(Jugador jugador){
        
        if(this.getVivo() && jugador.getVivo()){

            jugador.setVivo(false);
        }
    }

    @Override // Sirve para sobreescribir
    public String toString(){
        return "Nombre: " + getNombre() + " - " + "Deuda: " + getDeuda() + " - " + "Vivo: " + (getVivo() ? "Si" : "No");
    }
}