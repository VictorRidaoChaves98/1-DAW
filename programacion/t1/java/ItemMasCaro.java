import java.util.Scanner;

public class ItemMasCaro
{
    public static void main(String[] args)
    {
        String[] items = {"Espada", "Escudo", "Poción", "Arco"};
        int[] valores = {100, 220, 50, 120};

        String itemValioso = encontrarItemMasValioso(items, valores);
        System.out.println("Item más valioso: " + itemValioso);

    }
    
    public static String encontrarItemMasValioso(String[] items, int[] valores)
    {
        int indiceMaximo = 0;

        for(int i = 1; i < valores.length; i++)
        {
            if(valores[i] > valores[indiceMaximo])
            {
                indiceMaximo = i;
            }
        }

        return items[indiceMaximo];
    }
}
