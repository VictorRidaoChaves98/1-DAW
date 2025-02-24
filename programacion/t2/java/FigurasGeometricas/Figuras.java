public abstract class Figuras
{
    private String nombre;

    public Figuras(String nombre)
    {
        this.nombre = nombre;
    }

    abstract double calcularArea();

    abstract double calcularPerimetro();

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;

    }

    public void ImprimirDetalle()
    {
        System.out.println("Figura" + getNombre());
        System.out.println("Area" + calcularArea());
        System.out.println("Perimetro" + calcularPerimetro());

    }
}