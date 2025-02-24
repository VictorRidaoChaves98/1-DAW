public class Rectangulo extends Figuras
{
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho)
    {
        super("Rectangulo");

        this.largo = largo;
        this.ancho = ancho;

    }

    @Override
    public double calcularArea()
    {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro()
    {
        return 2 * (largo + ancho);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo [largo=" + largo + ", ancho=" + ancho + "]";
    }

    

}
