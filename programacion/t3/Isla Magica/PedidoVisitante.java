import java.util.ArrayList;
import java.util.List;

public class PedidoVisitante {
    private Visitante visitante;
    private List <Producto> productos;

    public PedidoVisitante(List productos, Visitante visitante) {
        this.productos = new ArrayList<>();
        this.visitante = visitante;
    
    }
    
    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p) {
        if (p == null || p.getPrecio() < 0) {
            throw new IllegalArgumentException("Este producto no está en la lista");
        }
        productos.add(p);
    }

    public double CalcularTotal(){
        boolean tieneBebida = productos.add(TipoProducto.BEBIDA);
        boolean tieneComida = productos.add(TipoProducto.COMIDA);
        double subtotal;
        if(tieneBebida && tieneComida) subtotal = 1.50;

        if(productos.size() > 4) subtotal = 0.95;

        if(visitante.isEsVip() && visitante.getProvinciaOrigen() equalsIgnoreCase("Sevilla")) = subtotal = 0.80;

    }

    public String resumenPedido(){
        return "Pedido de: " + visitante.getNombre() +
        "Productos totales: " + getProductos() +
        "Subtotal: " + 
        "Descuentos aplicados: " +



    }

    private void equalsIgnoreCase(String sevilla) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
