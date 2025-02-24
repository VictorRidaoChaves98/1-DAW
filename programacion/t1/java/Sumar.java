public class Sumar
{
    public static void main(String[] args) 
    {
        int[] numeros = new int[5];
        numeros[1] = 10;
        numeros[2] = 20;     
        numeros[3] = 40;   
        numeros[4] = 60;

        int suma = 0;

        for(int i = 0; i < numeros.length; i++)
        {
            suma += numeros[i];
        }

        System.out.println("La suma es: " + suma);

    }
    
}
