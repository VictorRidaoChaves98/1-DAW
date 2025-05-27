import java.util.Random;

public class Jedi extends SerVivo implements Luchador {
    private int nivelFuerza; // 1=Padawan, 2=Caballero, 3=Maestro
    private Random rand = new Random();

    public Jedi(String nombre, int defensa, int nivelFuerza) {
        super(nombre, defensa);
        this.nivelFuerza = nivelFuerza;
    }

    private int calcularDanioDefensivo() {
        int superataque = rand.nextInt(5) + 1; // 1 a 5
        return nivelFuerza + superataque;
    }

    @Override
    public void recibirDanio(int danio) {
        int habilidad = rand.nextInt(4) + 1; // 1 a 4
        if (habilidad == 3) { // Reflejo de la Fuerza
            System.out.println(nombre + " bloqueó el ataque con Reflejo de la Fuerza.");
        } else {
            salud -= danio;
            System.out.println(nombre + " recibió " + danio + " de daño. Salud actual: " + salud);
            if (salud <= 0) {
                System.out.println(nombre + " se ha ido a otro planeta con su maestro Jedi.");
            }
        }
    }

    @Override
    public void luchar(SerVivo oponente) {
        int danio = calcularDanioDefensivo();
        System.out.println(nombre + " ataca con defensa calculada: " + danio);
        oponente.recibirDanio(danio);
    }
}
