public class Standard extends PlataformaStreaming {
    public Standard() {
        super("ADAFLIX STANDARD");
    }

    @Override
    public int obtenerCalidadImagen() {
        return 1080;
    }

    @Override
    public int obtenerNumeroMaximoPantallas() {
        return 2;
    }
}
