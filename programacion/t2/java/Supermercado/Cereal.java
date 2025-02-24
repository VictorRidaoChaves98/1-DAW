package Supermercado;

import java.time.LocalDate;

public class Cereal extends Producto 
{
    private String tipoCereal;
    private LocalDate caducidad;

    public Cereal(String marca, double precio, int id, String tipoCereal, LocalDate caducidad) {

        super(marca, precio, id);

        this.tipoCereal = tipoCereal;
        this.caducidad = caducidad;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public int getCalorias()
    {
        switch (tipoCereal)
        {
            case "Espelta":
                return 5;
                break;
            
            case "Maiz":
                return 8;
                break;

            case "Avena":
                return 15;
                break;

            case "Trigo":
                return 20;
                break;

            case "Resto":
                return 10;
                break;
        }

        
        if(tipoCereal.equals("Espelta"))
        {
            return 5;
        }
        else if(tipoCereal.equals("Maiz"))
        {
            return 8;
        }
        else if(tipoCereal.equals("Avena"))
        {
            return 15;
        }
        else if(tipoCereal.equals("Trigo"))
        {
            return 20;
        }
        else
        {
            return 10;
        }
    }
   
    @Override
    public String toString() {
        return "Cereal [tipoCereal=" + tipoCereal + ", caducidad=" + caducidad + "]";
    }

    

    
}
