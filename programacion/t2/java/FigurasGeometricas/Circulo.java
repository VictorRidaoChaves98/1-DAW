public class Circulo extends Figuras
{
    private double radio;

    public Circulo(double radio)
    {
        super("Circulo");
        this.radio = radio;
        
    }

    @Override
    public double calcularArea()
    {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro()
    {
        return 2 * Math.PI * radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }




    
}
