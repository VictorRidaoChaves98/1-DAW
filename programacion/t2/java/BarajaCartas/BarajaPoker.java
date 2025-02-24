
public class BarajaPoker extends Baraja {

    public BarajaPoker() {
        String[] palos = {"Corazon", "Diamante", "Trebol", "Pica"};

        for (String palo : palos) {

            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(palo, valor));

            }

        }
    }
}
