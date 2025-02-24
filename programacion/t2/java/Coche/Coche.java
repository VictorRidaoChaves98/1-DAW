package Coche;

public class Coche
{
    private String matricula;
    private String marca;
    private String modelo;
    private int deposito; // se pone en porcentaje " % "

    public Coche(String matricula, String marca, String modelo, int deposito)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;
    }

    public Coche(String matricula, String marca, String modelo)
    {
        this(matricula, marca, modelo, 100);
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo()
    {
        this.modelo = modelo;
    }

    public int getDeposito()
    {
        return deposito;
    }

    @Override

    public String toString()
    {
        return "Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Deposito: " + deposito;
    }
}