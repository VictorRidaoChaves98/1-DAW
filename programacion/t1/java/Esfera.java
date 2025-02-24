import java.util.Scanner;

public class Esfera{

    // PERIMETRO = 2 * PI * R
    // AREA = 4 * PI * RADIO * RADIO
    // VOLUMEN = 4/3 * PI * RADIO * RADIO * RADIO
    public static void main(String[] args)
    {

        //Dar el radio: Perimetro, area y volumen

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el radio: ");
        
        double radio = sc.nextDouble();

        double perimetro = 2 * Math.PI * radio;
        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);

        System.out.printf("El perimetro es: %.2f m \n", perimetro); // Precision flotante con 2 decimales %.2f m2 \n
        System.out.printf("El area es: %.2f m2 \n", area); // \n es para hacer un salto de linea y que no salga todo pegado
        System.out.printf("El volumen es: %.2f m3 \n", volumen);

       


    }
}