import java.util.Scanner;

public class AhorcadoSimplificado {
    public static void main(String[] args) {
        String palabra = "java", oculta = "_".repeat(palabra.length());
        int intentos = 7;
        Scanner scanner = new Scanner(System.in);

        while (intentos > 0 && oculta.contains("_")) {
            System.out.println("Palabra: " + oculta + " | Intentos: " + intentos);
            char letra = scanner.nextLine().charAt(0);

            if (palabra.indexOf(letra) >= 0) {
                for (int i = 0; i < palabra.length(); i++) 
                    if (palabra.charAt(i) == letra) oculta = oculta.substring(0, i) + letra + oculta.substring(i + 1);
            } else {
                intentos--;
                System.out.println("Incorrecto. Intentos: " + intentos);
            }
        }

        System.out.println(intentos > 0 ? "¡Felicidades! La palabra era: " + palabra : "Perdiste. La palabra era: " + palabra);
        scanner.close();
    }
}
