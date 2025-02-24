public class Lavadora extends Electrodomestico
{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia)
    {
        super("Lavadora", marca, potencia);

        this.precio =0.0;
        this.aguaCaliente= false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente)
    {
        super("Lavadora", marca, potencia);

        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public double getConsumo(int horas)
    {
        double resultado;
        if(!aguaCaliente)
        {
            resultado = super.getConsumo(horas);
        }
        else
        {
            resultado = horas * (super.getPotencia() + super.getPotencia() * 0.20);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Lavadora [precio=" + precio + ", aguaCaliente=" + aguaCaliente + "]";
    }

    



    
}
