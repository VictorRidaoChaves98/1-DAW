import java.util.Random;
import java.util.Scanner;

public class adivinanumero2 {
    public static void main(String[] args) {

        System.out.println("Bienvenido a adivina el número");
        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroMaquina = random.nextInt(100) + 1;
        int numeroIntentos = 0;
        int numeroUsuario = sc.nextInt();
        while (numeroMaquina != numeroUsuario && numeroIntentos < 10) {
            if (numeroMaquina > numeroUsuario) {                
                System.out.println("Muy bajo");
            } else {
                System.out.println("Muy alto");
            }
            numeroIntentos++;
            System.out.println("Llevas " + numeroIntentos + " intentos.");
            numeroUsuario = sc.nextInt();
        }
        if (numeroMaquina == numeroUsuario) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }
        sc.close();
    }
}