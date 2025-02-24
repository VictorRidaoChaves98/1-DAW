public class NumeroEnFilas
{
    public static void main(String[] args)
    {
        int size = Integer.parseInt(args[0]);

        for(int j = 1; j <= size; j++)
        {
            for(int i = 1; i <= size; i++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
