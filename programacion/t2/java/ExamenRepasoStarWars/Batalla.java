import java.lang.reflect.Array;
import java.util.ArrayList;

public class Batalla {
    private ArrayList<Luchador> jedis;
    private ArrayList<Luchador> siths;

    public void prepararBatalla() {
        // Preparar Jedi y Sith
        jedis = Array.asList(new Jedi("Luke Skywalker", 5, 3), new Jedi("Obi-Wan Kenobi", 5, 2), new Jedi("Yoda", 5, 3));
        siths = Array.asList(new Sith("Darth Vader", 6, "Influence"), new Sith("Darth Sidious", 7, "Hatred"), new Sith("Darth Maul", 8, "Strangulation"));
    }

    public void comenzarBatalla() {
        // Simulación de batalla por rondas
        int ronda = 1;
        while (!jedis.isEmpty() && !siths.isEmpty()) {
            System.out.println("Ronda " + ronda);
            Luchador jedi = jedis.get(0);
            Luchador sith = siths.get(0);
            System.out.println(jedi + " VS " + sith);

            // Luchan hasta que uno caiga
            jedi.luchar((SerVivo) sith);
            if (((SerVivo) sith).getSalud() <= 0) {
                siths.remove(0);
                System.out.println(sith + " ha caído.");
            }

            if (!siths.isEmpty()) {
                sith.luchar((SerVivo) jedi);
                if (((SerVivo) jedi).getSalud() <= 0) {
                    jedis.remove(0);
                    System.out.println(jedi + " ha caído.");
                }
            }
            ronda++;
        }

        // Ver quién ganó
        if (jedis.isEmpty()) {
            System.out.println("Los Siths han ganado la batalla!");
        } else {
            System.out.println("Los Jedis han ganado la batalla!");
        }
    }
}
