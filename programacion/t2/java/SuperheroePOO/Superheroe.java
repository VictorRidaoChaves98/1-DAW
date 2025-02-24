public class Superheroe
{
    //PROPIEDADES

    private String nombre;
    private String descripcion;
    private boolean capa;

    //CONSTRUCTORES

    public Superheroe(String nombre)
    {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    //MÉTODOS GET Y SET

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDimension(String dimension)
    {
        this.dimension = dimension;
    }

    public boolean isCapa()
    {
        return capa;
    }

    public void setCapa(boolean capa)
    {
        this.capa = capa;
    }

    //MÉTODO TOSTRING
    
    @Override
    public String toString()
    {
        return "Nombre: " + nombre + "Descripción: " + descripcion + "Capa:" + capa;
    }
}
