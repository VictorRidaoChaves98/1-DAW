package Supermercado;

public class Vino extends Producto
{
    private String tipoVino;
    private double graduacion;
    private in anyoCosecha;

    public Vino(String marca, double precio, int id, String tipoVino, double graduacion, in anyoCosecha) {

        super(marca, precio, id);

        this.tipoVino = tipoVino;
        this.graduacion = graduacion;
        this.anyoCosecha = anyoCosecha;
    }

    public boolean esDeAltaGama()
    {
       return getGraduacion() > 12 && getPrecio() > 20 && getAnyoCosecha() < 2000;
    }

    public boolean esVinoDulce()
    {
        return.getTipoVino().contains("Dulce");
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }

    public in getAnyoCosecha() {
        return anyoCosecha;
    }

    public void setAnyoCosecha(in anyoCosecha) {
        this.anyoCosecha = anyoCosecha;
    }

    @Override
    public String toString() {
        return "Vino [tipoVino=" + tipoVino + ", graduacion=" + graduacion + ", anyoCosecha=" + anyoCosecha + "]";
    }

}
