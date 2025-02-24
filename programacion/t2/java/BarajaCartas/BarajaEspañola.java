public class BarajaEspañola extends Baraja{
    
    public BarajaEspañola(boolean incluyeComodines){

        String[] palos = {"Oro", "Copa", "Espada", "Basto"};
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for(String palo : palos){

            for(int valor : valores){

                cartas.add(new Carta(palo, valor));
            }
        }

        if(incluyeComodines){

            cartas.add(new Carta("Comodín", 0));
            cartas.add(new Carta("Comodín", 0));
        }
    }
}
