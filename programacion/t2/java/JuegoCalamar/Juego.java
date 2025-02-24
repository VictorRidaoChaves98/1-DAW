public class Juego {


    private double premio;
    private Jugador[] jugadores;
    private MiniJuego[] minijuegos;

    public Juego(double premio){

        this.premio = premio;
    }

    public double getPremio(){

        return this.premio;
    }

    public void setPremio(double premio){

        this.premio = premio;
    }

    public MiniJuego[] getMiniJuegos(){

        return this.minijuegos;
    }

    public void setMiniJuegos(MiniJuego[] minijuegos){

        
    }
}
