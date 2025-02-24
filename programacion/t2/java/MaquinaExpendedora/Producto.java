public class Producto
{
    private String nombre;
    private String precio;
    private int calorias;
    private boolean caducado;

    public Producto(String nombre, String precio, int calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.caducado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean getCaducado() {
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }

    public void aplicarDescuento(double porcentajeorcentaje)
    {
        if(porcentaje > 0 && porcentaje <= 100)
        {
            double descuento = (precio * porcentaje) / 100;

            double precioDescuento = precio - descuento;

            setPrecio(precioDescuentoAplicado);
        }
    }

    /*
    * Compara el precio de este producto con otro.

    * @param otroProducto(parámetro)

    * @ return Devuelve TRUE si el producto es más barato que el producto recibido.
    
    */
    public boolean esMasBaratoQueOtro(ProductoP)
    {

    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + ", caducado=" + caducado
                + "]";
    }
}