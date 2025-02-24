
public class Main {

    public static void main(String[] args) {
        
        System.out.println("-------Baraja de Póker--------");

        Baraja poker = new BarajaPoker();
        poker.barajar();
        poker.mostrarBaraja();

        System.out.println("\n--------Baraja Española--------");

        Baraja española = new BarajaEspañola(false);
        española.barajar();
        española.mostrarBaraja();
    }
}
