package Supermercado;

public class Detergente extends Producto
{
    private double volumen;
    private String tipoEnvase;
    private int descuento;

    public Detergente(int descuento, String tipoEnvase, double volumen, String marca, double precio, int id) {

        super(marca, precio, id);

        this.descuento = descuento;
        this.tipoEnvase = tipoEnvase;
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecioDescuento(){
        double descuentoAplicado = (getPrecio() * getDescuento() / 100)
        {
            return getPrecio() - descuentoAplicado;
        }
    }

    @Override
    public String toString() {
        return "Detergente [volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + ", descuento=" + descuento + "]";
    }

    
}
