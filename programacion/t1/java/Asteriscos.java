public class Asteriscos
{
    public static void main(String[] args)
    {
        final int N = Integer.parseInt(args[0]);
        
        // for(int i = 0; i < N; i++) =========> ESTA ES UNA FORMA DE HACERLO PERO ES MÁS LARGA
        // {
        //    if(i % 2 == 0)
        //    {
        //        System.out.println(" *****"); // 0
        //    }else
        //    {
        //        System.out.pritnln("*****"); // 1
        //    }
        // }

        for(int i = 0; i < N; i++)
        {
            String espace = i % 2 == 0 ? " " : "";
            System.out.println(espace + "*****"); // PON EN LA CONSOLA EL NUMERO EJEMPLO: java Asteriscos 60
        }


    }
}
