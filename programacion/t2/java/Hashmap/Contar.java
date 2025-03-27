import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contar{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();

        Map<Character, Integer> contador = new HashMap<Character, Integer>();

        for (int i = 0; i < palabra.length(); i++){

            char letra = palabra.charAt(i);

            if (contador.containsKey(letra)){

                contador.put(letra, contador.get(letra) + 1);
            }
            else{
                contador.put(letra, 1);
            }
        }

        System.out.println("Contador de letras");

        for (Map.Entry<Character, Integer> entry : contador.entrySet()){

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}