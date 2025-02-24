

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    public double superficie;
    public double precioPintura;

    public TrabajoPintura(Persona trabajador, LocalDate fechaInicio, String Cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, Cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }
    
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    public String toString() {
        return "TrabajoPintura [superficie=" + superficie + ", precioPintura=" + precioPintura + "]";
    }

    @Override
    public double costeMaterial(){
        return (getSuperficie() / 7.8) * getPrecioPintura();
    }

    @Override
    public double costeManoObra(){
        return (getSuperficie() / 10) * 9.5;
        
    }

    @Override
    public double costeTotal(){
        double costeTotal = costeMaterial() + costeManoObra();
        if (getSuperficie() < 50){
            costeTotal += ((costeMaterial() + costeManoObra()) * 15) / 100;
        }
        return costeTotal;
    }

    @Override
    public String detalleServicio(){
        return "TRABAJO DE PINTURA\r\n" + //
                        "Cliente: (" + getCliente() + ")\r\n" + //
                        "Fecha de inicio: (" + getFechaInicio() + ")\r\n" + //
                        "----------------------------------------\r\n" + //
                        "Pintor: (" + getTrabajador() + ")\r\n" + //
                        "Coste Material..... (" + costeMaterial() + ")\r\n" + //
                        "Coste Mano Obra.... (" + costeManoObra() + ")\r\n" + //
                        "Coste Adicional.... (coste adicional)\r\n" + //
                        "TOTAL: ............ (" + costeTotal() + "\r\n" + //
                        "servicio)\r\n" + //
                        "--------------------------------------";
    }
}