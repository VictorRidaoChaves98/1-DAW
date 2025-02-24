import java.util.Arrays;

public class MaquinaExpendedora
{
    private boolean disponible;
    private Producto[] productos;
    private boolean pagoConTarjeta;

    public MaquinaExpendedora(boolean pagoConTarjeta, int capacidadProductos) {
        
        this.disponible = disponible;
        this.productos = new Producto[capacidadProductos];
        this.pagoConTarjeta = pagoConTarjeta;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public boolean isPagoConTarjeta() {
        return pagoConTarjeta;
    }

    public void setPagoConTarjeta(boolean pagoConTarjeta) {
        this.pagoConTarjeta = pagoConTarjeta;
    }

    public double getSaldoMaquina()
    {
        return saldoMaquina;
    }

    public void setSaldoMaquina(double saldoMaquina)
    {
        this.saldoMaquina = saldoMaquina;
    }

    public void insertarDinero(double cantidad)
    {
        if(cantidad > 0)
        {
            saldoMaquina += cantidad;
        }

    }

    public void reponerProductos(Producto[] productos)
    {
        for (int i = 0; i < getProductos().length; i++)
        {
            if (getProductos() [i] == null)
            {
                getProductos()[i] = productoAReponer;

                break;
            }    
        }
    }

    public void comprarProducto(Producto producto)
    {
        if (isDisponible() && getSaldoMaquina() >= producto.getPrecio())
        {
            boolean productoDisponible = false;

            for(int i = 0; i < getProductos().length; i++)
            {
                if(getProductos() [i].getNombre() == producto.getNombre())
                {
                    productoDisponible = true;

                    break;
                }
            }

            if(productoDisponible)
            {
                saldoMaquina -= producto.getPrecio();
            }
        }
    }

    @Override
    public String toString() {
        return "MaquinaExpendedora [disponible=" + disponible + ", productos=" + Arrays.toString(productos)
                + ", pagoConTarjeta=" + pagoConTarjeta + "]";
    }

    

    
}
