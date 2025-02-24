
public class ContarFrecuencia
{   
    /*
     * Contar las veces que aparece un número en específico en un ARRAY.
     */
    public static void main(String[] args)
    {
        int[] numeros = {1,2,3,4,1,2,1,5};
        
        int numeroBuscar = 1;
        int contador = 0;

        //FOR EXTENDIDO

        for (int numero : numeros)
        {
            if(numero == numeroBuscar)
            {
                contador++;
            }
        }

        // FOR CLÁSICO
        
        // for(int indice = 0; indice < numeros.length; indice++)
        //{
        //  if (numeros[indice] == numeroBuscar)
        //  {
        //      contador++;
        //  }
        //}

        System.out.println("El número " + numeroBuscar + " aparece " + contador + " veces");
    }   
}
