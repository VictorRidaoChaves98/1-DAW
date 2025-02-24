public class ArgumentosBuenos{
    public static void main(String[] args){
        /**
         * - 1 Arg: Lo imprima 3 veces en una misma linea
         * - 2 Arg: Duplicar su valor
         * - 3 y 4 Args: Se impriman separados por un guion
         * - 5 Arg: Elevar al cubo
         * - 6 Arg: Imprimir el primer caracter del argumento
         * - 7 Arg: Imprimir una linea vacia, luego un tabulador y luego el argumento
         */
        //ARGUMENTO 1
        String argumento1 = args[0];
        System.out.println(args[0] + " " args[0] + " " args[0] + " ");

        //ARGUMENTO 2
        System.out.println(Float.parseFloat(args[1]) * 2);

        //ARGUMENTO 3

        System.out.println(args[2] + "-" + args[3]);

        //ARGUMENTO 4

        int cubo = Integer.parseInt(args[4]);
        System.out.println(cubo * cubo * cubo );

        //ARGUMENTO 5

        System.out.println()
        
        

    }

}