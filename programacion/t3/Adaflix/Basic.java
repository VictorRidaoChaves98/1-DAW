public class Basic extends PlataformaStreaming {
    public Basic() {
        super("ADAFLIX BASIC");
    }

    @Override
    public int obtenerCalidadImagen() {
        return 720;
    }

    @Override
    public int obtenerNumeroMaximoPantallas() {
        return 1;
    }
}
