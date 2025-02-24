public class If{
    public static void main(String[]args){
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        if(a>b){
            System.out.println("A es mayor que B");
        }

        if(a<b){
            System.out.println("A es menor que B");
        }

        if(a==b){
            System.out.println("A y B son iguales");
        }

        System.out.println("##Se imprime siempre");
    }
}


       