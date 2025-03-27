import java.io.FileWriter;
import java.io.IOException;

public class Escritura{

    public static void main(String[] args) {

        int repeticiones = 100;
        try {
            FileWriter escritor = new FileWriter("./newFile.txt");

            for (int i = 0; i < repeticiones; i++) {
                escritor.write("Hola Mundo!\n");
            }

            escritor.flush();
            escritor.write("Adios Mundo!\n");
            escritor.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("ya estaría");
    }
}