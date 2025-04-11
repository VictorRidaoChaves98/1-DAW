import java.util.ArrayList;

public interface iPlataformaStreaming {
    
    boolean añadirContenido(Contenido c);
    boolean eliminarContenido(Contenido c);
    ArrayList<Contenido> obtenerTopDiez();
    int obtenerCalidadImagen();
    int obtenerNumeroMaximoPantallas();
    String reproducirAnunciosAleatoriamente();
    String listarContenidos();



}
