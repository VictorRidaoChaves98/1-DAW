import java.util.Random;

public class Sith extends SerVivo implements Luchador {
    private int nivelFuerza; // 1=Aprendiz, 2=Lord, 3=Darth
    private Random rand = new Random();

    public Sith(String nombre, int defensa, int nivelFuerza) {
        super(nombre, defensa);
        this.nivelFuerza = nivelFuerza;
    }

    private int calcularDanioAgresivo() {
        int habilidadOscura = rand.nextInt(3) + 1; // 1 a 3
        return nivelFuerza + habilidadOscura;
    }

    @Override
    public void recibirDanio(int danio) {
        int habilidad = rand.nextInt(3) + 1; // 1 a 3
        if (habilidad == 1) { // Influencia Oscura (bloqueo)
            System.out.println(nombre + " usó Influencia Oscura y bloqueó el daño.");
        } else {
            salud -= danio;
            System.out.println(nombre + " recibió " + danio + " de daño. Salud actual: " + salud);
            if (salud <= 0) {
                System.out.println(nombre + " se ha unido a Darth Vader en el más allá.");
            }
        }
    }

    @Override
    public void luchar(SerVivo oponente) {
        int danio = calcularDanioAgresivo();
        System.out.println(nombre + " ataca agresivamente con daño: " + danio);
        oponente.recibirDanio(danio);
    }
}
