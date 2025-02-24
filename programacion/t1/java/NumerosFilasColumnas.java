public class NumerosFilasColumnas
{
    public static void main(String[] args)
  {
    int option = Integer.parseInt(args[0]);
    int size = Integer.parseInt(args[1]);

    if(option == 1)
    {

        //EJERCICIO 1 PONER NUMEROS EN VERTICAL
      for(int i = 1; i <= size; i++)
      {
        System.out.println(i);
      }
    }

    if(option == 2)
    {

        //EJERCICIO 2 PONER NUMEROS EN COLUMNAS
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= size; i++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
    }

    if(option == 3)
    {

        //EJERCICIO 3 PONER NUMEROS EN FILAS

      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= size; i++)
        {
          System.out.print(j);
        }
        System.out.println();
      }
    }

    if(option == 4)
    {

        //EJERCICIO 4 PONER NUMEROS SEGUN SU VALOR

      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= j; i++)
        {
          System.out.print(j);
        }
        System.out.println();

      }
    }else if (option == 5)
    {
        //EJERCICIO 5 PONER NUMEROS EN ESCALERAS

        for(int j = 1; j <= size; j++)
        {
            for(int i = 1; i <= j; i++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }else if (option == 6)
    {
        //EJERCICIO 6 PONER NUMEROS EN ESCALERAS INVERSAS

        for(int j = 1; j <= size; j++)
        {
            for(int i = 1; i <= (size+1)-j; i++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }else if (option == 7)
    {
        //EJERCICIO 7

        for(int j = 1; j <= size; j++)
        {
            for(int i = 1; i <= (size+1)-j; i++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }else if (option == 8)
    {
        //EJERCICIO 8

        final int N = Integer.parseInt(args[0]);

        for(int f = 1; f <= N; f++)
        {
            for(int azul = 0; azul < N - f; azul++)
            {
                System.out.print(' ');
            }
            for(int verde = 0; verde < f-1; verde++)
            {
                System.out.print('*');
            }
            for(int rojo = 0; rojo < f; rojo++)
            {
                System.out.print('*');
            }
            System.out.println();
    }

    }else if (option == 9)
    {
      //EJERCICIO 9


    }
    
    }
}
