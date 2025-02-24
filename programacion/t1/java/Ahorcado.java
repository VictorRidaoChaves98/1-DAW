import java.util.Scanner;
public class Ahorcado
{
    public static void main(String[] args)
    {
        // J A V A

        // _ _ _ _

        // H

        // _ _ _ _

        // J
        // J _ _ _


        // P

        // J _ _ _

        // A

        // J A _ A
            
                String[] palabras = {"programacion", "java", "desarrollo", "computadora", "tecnologia"};
                String palabraElegida = palabras[(int) (Math.random() * palabras.length)];
                StringBuilder palabraOculta = new StringBuilder("_".repeat(palabraElegida.length()));
                int intentosRestantes = 6;
                boolean[] letrasAdivinadas = new boolean[palabraElegida.length()];
        
                Scanner scanner = new Scanner(System.in);
        
                System.out.println("¡Bienvenido al juego del ahorcado!");
                
                while (intentosRestantes > 0 && palabraOculta.toString().contains("_")) {
                    System.out.println("Palabra: " + palabraOculta);
                    System.out.println("Intentos restantes: " + intentosRestantes);
                    System.out.print("Introduce una letra: ");
                    char letra = scanner.nextLine().charAt(0);
                    boolean letraEncontrada = false;
        
                    for (int i = 0; i < palabraElegida.length(); i++) {
                        if (palabraElegida.charAt(i) == letra && !letrasAdivinadas[i]) {
                            letrasAdivinadas[i] = true;
                            palabraOculta.setCharAt(i, letra);
                            letraEncontrada = true;
                        }
                    }
        
                    if (!letraEncontrada) {
                        intentosRestantes--;
                        System.out.println("Letra incorrecta. ¡Intenta de nuevo!");
                    }
                }
        
                if (palabraOculta.toString().equals(palabraElegida)) {
                    System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraElegida);
                } else {
                    System.out.println("¡Se te acabaron los intentos! La palabra era: " + palabraElegida);
                }
        
                scanner.close();
                }
            
}
