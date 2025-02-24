import java.util.Scanner;

public class IMC {
    public static void main(String[] args)
    {
        double peso, altura;

        // IMC = Indice de Masa Corporal ( peso / ( altura * altura))
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca se peso");
        peso = sc.nextDouble();
    
        System.out.println("Introduzca su altura");
        altura = sc.nextDouble();
    
        double IMC = peso / Math.pow(altura, 2);

        String mensaje = "TU IMC midiendo " + altura + "metros y pesando " + peso + "Kg es de" + IMC;

        System.out.println(mensaje);

        

    }
}