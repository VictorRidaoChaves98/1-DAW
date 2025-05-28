public class Entrada {
    private Visitante visitante;
    private TipoEntrada tipoEntrada;
    private double precio;
    private int base;
    private double altura;
    private int edad;
    
    public Entrada(Visitante visitante, TipoEntrada tipoEntrada) {
        this.visitante = visitante;
        this.tipoEntrada = tipoEntrada;
        this.precio = calcularPrecio();
    }
    public double getPrecio() {
        return precio;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Entrada [visitante=" + visitante + ", tipoEntrada=" + tipoEntrada + ", precio=" + precio + "]";
    }

    public double calcularPrecio() {
        if (visitante.isEsVip()) return 0;

        if (edad < 12) {
            base = altura < 1.20 ? 10;
            base = altura >= 1.20 ? 15;

        } else if (edad < 18) {
            base = 20;
        } else {
            base = 25;
            if (altura > 1.85 && visitante.isEsVip()) {
                base = 20;
            }
        }

        if (visitante.getProvinciaOrigen().equalsIgnoreCase("Sevilla")) {
            base *= 0.85;
        }
        return base;
    }

    public boolean esTipoValido() {
        int edad = visitante.getEdad();
        double altura = visitante.getAltura();
        boolean vip = visitante.isEsVip();

        return switch (tipoEntrada) {
            case INFANTIL -> edad < 12 && altura < 1.40;
            case GENERAL -> edad >= 12 || (altura >= 1.40 && !vip);
            case VIP -> vip;
        };
    }

    public String resumenEntrada() {
        return "Nombre: " + visitante.getNombre() + 
        "Edad: " + visitante.getEdad() + " años" + 
        "Tipo: " + tipoEntrada + 
        "Provincia: " + visitante.getProvinciaOrigen() + 
        "Precio: " + String.format("%.2f", precio) + "€";
    }


    
}
