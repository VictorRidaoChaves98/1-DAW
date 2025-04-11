// Clase Sith
public class Sith extends SerVivo implements Luchador {
    private String habilidadOscura;

    public Sith(String nombre, int defensa, String habilidadOscura) {
        super(nombre, defensa);
        this.habilidadOscura = habilidadOscura;
    }

    @Override
    public void recibirDanio(int danio) {
        if (Math.random() < 0.1) { // 10% probabilidad de bloquear daño
            System.out.println(nombre + " bloquea el daño!");
        } else {
            salud -= danio;
            if (salud <= 0) {
                System.out.println(nombre + " ha caído en combate.");
            }
        }
    }

    @Override
    public void luchar(SerVivo oponente) {
        int danio = calcularDanioAgresivo();
        oponente.recibirDanio(danio);
    }

    public int calcularDanioAgresivo() {
        return 1 + (int)(Math.random() * 3) + (Math.random() < 0.3 ? (int)(Math.random() * 5 + 1) : 0); // Habilidad oscura aleatoria
    }
}
