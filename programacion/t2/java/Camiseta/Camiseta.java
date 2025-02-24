public class Camiseta
{
    private String marca;
    private String talla;
    private String color;

    public Camiseta(String marca, String talla, String color)
    {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public String getMarca()
    {
        return this.marca;
    }

    public String getColor()
    {
        return this.color;
    }

    public String getTalla()
    {
        return this.talla;
    }

    @Override

    public String toString()
    {
        return this.marca + ", " + this.talla + ", " + this.color;
    }
    
}