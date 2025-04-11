// Clase Jedi
public class Jedi extends SerVivo implements Luchador {
    private int nivelFuerza;

    public Jedi(String nombre, int defensa, int nivelFuerza) {
        super(nombre, defensa);
        this.nivelFuerza = nivelFuerza;
    }
    
    
    public int getNivelFuerza() {
        return nivelFuerza;
    }
    
    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }
    
    @Override
    public void recibirDanio(int danio) {
        if (Math.random() < 0.2) { // 20% probabilidad de bloquear daño
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
        int danio = calcularDanioDefensivo();
        oponente.recibirDanio(danio);
    }
    
    public int calcularDanioDefensivo() {
        return nivelFuerza + (Math.random() < 0.3 ? (int)(Math.random() * 5 + 1) : 0); // Superataque aleatorio
    }
}
