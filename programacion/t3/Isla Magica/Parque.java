
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.List;

public class Parque {
    private List<Visitante> visitantes = new ArrayList<>();
    private List<Atraccion> atracciones = new ArrayList<>();
    private List<Producto> pedidos = new ArrayList<>();
    private List<Juego> juegos = new ArrayList<>();
    private List<Participacion> participaciones = new ArrayList();
    private Object random;

    public void simularDia(){
        simularVisitantes(3);
        simularAtracciones();
        simularJuegos();

        for (Visitante v : visitantes){
            TipoEntrada tipo = null;
            Entrada e = new Entrada(v, tipo);
            RegistroVisitas.guardarEvento("Entrada", e.resumenEntrada());

            for (Atraccion a : atracciones) {
                if (a.puedeSubirse(v)){
                    a.registrarSubida();
                }

            }


        }

        PedidoVisitante pedido = new PedidoVisitante(v);
        pedido.agregarProducto(new Producto("Hamburguesa", 3.5, TipoProducto.COMIDA));
        pedido.agregarProducto(new Producto("Coca-cola", 1.5, TipoProducto.BEBIDA));

    }

        Juego juego = juegos.get(random.nextInt(juegos.size()));
                int puntuacion = random.nextInt(juego.getPuntuacionMaxima() + 1);

        private void simularVisitantes(int i) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void simularAtracciones() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void simularJuegos() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
        try {
            Participacion participacion = new Participacion(v, juego, puntuacion);
            participaciones.add(participacion);
            RegistroVisitas.guardarEvento("Juego", participacion.mostrarResultado());
        } catch (IllegalArgumentException ex) {
            RegistroVisitas.guardarEvento("Error", "Puntuación inválida para juego de " + v.getNombre());
        }
    

    public void generarVisitantes(int cantidad) {
        String[] nombres = {"Victor", "Javier", "Luis"};
        String[] provincias = {"Sevilla", "Cádiz", "Huelva"};

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = 5 + random.nextInt(20);
            double altura = 1.0 + random.nextDouble() * 1.2;
            boolean vip = random.nextBoolean();
            String provincia = provincias[random.nextInt(provincias.length)];

            visitantes.add(new Visitante(nombre, edad, altura, vip, provincia));
        }
        
    }

    public void generarAtracciones() {
        atracciones.add(new Atraccion("El Desafío", "Zona de Aventuras", 1.5, 13, false, 20));
        atracciones.add(new Atraccion("Capitán Bala", "Zona Infantil", 1.0, 7, false, 15));
        atracciones.add(new Atraccion("Jaguar", "Zona Salvaje", 1.7, 16, true, 10));
    }

    public void generarJuegos() {
        juegos.add(new Juego("Tiro al blanco", 100, TipoDificultad.FACIL, false));
        juegos.add(new Juego("Hundir la flota", 120, TipoDificultad.MEDIA, false));
        juegos.add(new Juego("Encuentra el cofre del tesoro", 200, TipoDificultad.DIFICIL, true));
    }

    public void mostrarResumenFinal() {
        System.out.println("====Resumen del día====: ");
        System.out.println("Visitantes: " + visitantes.size());
        System.out.println("Pedidos realizados: " + pedidos.size());
        System.out.println("Participaciones en juegos: " + participaciones.size());

    }
}



