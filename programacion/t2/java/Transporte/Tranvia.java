public class Tranvia extends TransportePublico {

    private boolean electrico;
    private String linea;

    public Tranvia(boolean electrico, String linea, int capacidad, String ruta, double velocidadMaxima) {
        super(capacidad, ruta, velocidadMaxima);

        this.electrico = electrico;
        this.linea = linea;
    }

    public boolean isElectrico() {
        return electrico;
    }
    
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    
    public String getLinea() {
        return linea;
    }
    
    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    @Override
    public void arrancar() {
        
        System.out.println("El tranvía se nos va...");
    }

    @Override
    public void parar() {

        System.out.println("El tranvía se ha parado.");
    }

    @Override
    public void mostarInformacion() {

        super.mostarInformacion();

        System.out.println("Electrico: " + (electrico ? "SI" : "NO"));

        System.out.println("Linea: " + linea);
    }
    
    
    

    
}
