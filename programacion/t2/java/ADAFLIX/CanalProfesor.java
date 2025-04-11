public class CanalProfesor extends Contenido {
    
    private Profesor profesor;
    private boolean enDirecto;
    
    public CanalProfesor(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas,
            Profesor profesor, boolean enDirecto) {
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.profesor = profesor;
        this.enDirecto = enDirecto;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public boolean isEnDirecto() {
        return enDirecto;
    }

    public void setEnDirecto(boolean enDirecto) {
        this.enDirecto = enDirecto;
    }

    @Override
    public String toString() {
        return "CanalProfesor [profesor=" + profesor + ", enDirecto=" + enDirecto + "]";
    }

    
}
