package Supermercado;

public class Producto {
    private int id;
    private String marca;
    private double precio;

    public Producto(String marca, double precio, int id) {
        this.marca = marca;
        this.precio = precio;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto [marca=" + marca + ", precio=" + precio + "]";
    }


}