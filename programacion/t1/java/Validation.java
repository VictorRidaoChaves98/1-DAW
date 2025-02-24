public class Validation{
    public static void main(String[]args){
        if(args.length > 0){
            String arg1 = args[0];

            System.out.println("Se ha introducido: " +arg1);
        }
        else{
            System.out.println("No se ha introducido argumento");
        }
    }
}