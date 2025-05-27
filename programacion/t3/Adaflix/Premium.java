public class Premium extends PlataformaStreaming {
    public Premium() {
        super("ADAFLIX PREMIUM");
    }

    @Override
    public int obtenerCalidadImagen() {
        return 4096;
    }

    @Override
    public int obtenerNumeroMaximoPantallas() {
        return Integer.MAX_VALUE;
    }
}
