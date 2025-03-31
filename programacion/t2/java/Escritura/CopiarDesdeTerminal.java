import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopiarDesdeTerminal {
    public static void main(String[] args) {
        String archivoSalida = "./textoMayusculas.txt";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter escritor = new FileWriter(archivoSalida)) {
            String linea;

            System.out.println("Por favor, escribe una palabra o texto, para salir escribe 'fin':");

            while (true) {
                linea = scanner.nextLine();

                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }

                escritor.write(linea.toUpperCase() + "\n");
            }

            System.out.println("Texto guardado en mayúsculas en " + archivoSalida);

        } catch (IOException e) {

            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
            
        } finally {
            scanner.close();
        }
    }
}
