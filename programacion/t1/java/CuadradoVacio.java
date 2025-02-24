//
//
//* * * * * *
//*         *
//*         *
//*         *
//*         *
//* * * * * *
//
public class CuadradoVacio
{
    public static void main(String[] args)
    {
        final int N = Integer.parseInt(args[0]);
        
        for (int fila = 0; fila < N; fila++)
        {
            for (int columna = 0; columna < N; columna++)
            {
                if(fila == 0 || fila == N - 1 || columna == 0 || columna == N - 1)
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
    
}
