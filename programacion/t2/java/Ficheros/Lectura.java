import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura{
    public static void main(String[] args) {
        
        File file = new File("Lectura.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
