import java.util.Scanner;

public class RotarArray2
{
    public static void main(String[] args)
    {
        String[] array = {"uno", "dos", "tres", "cuatro", "cinco"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el número de veces que quieres que rote hacia la izquierda");
        int rotaciones = sc.nextInt();

        System.out.println(arrays.toString(array));
        System.out.println();

        // Rotamos tantas veces como rotaciones haya introducido el usuario

        for(int i = 0; i < rotaciones; i++)
        {
            String temporal = array[0];

            for(int j = 0; j < array.length - 1; j++)
            {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = temporal;
        }

        System.out.println("Array después de " + rotaciones + " rotaciones hacia la izquierda");

        System.out.println(Array.toString(array));
    }   
}
