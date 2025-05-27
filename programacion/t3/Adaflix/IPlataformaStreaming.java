import java.util.List;

public interface IPlataformaStreaming {
    void añadirContenido(Contenido c);
    void eliminarContenido(Contenido c);
    List<Contenido> obtenerTopDiez();
    int obtenerCalidadImagen(); // 720, 1080, 4096
    int obtenerNumeroMaximoPantallas();
    void reproducirAnunciosAleatoriamente();
    void listarContenidos();
}
