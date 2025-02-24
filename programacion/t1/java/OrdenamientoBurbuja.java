
public class OrdenamientoBurbuja
{
    public static void main(String[] args)
    {
        int[] numeros = {5,3,8,4,2}; //USANDO BUBBLE SORT

        //Salida = Así deben salir los números {2,3,4,5,8}.

        //*ESTE SERÍA UN MÉTODO PERO NO VÁLIDO PARA ESTE EJERCICIO PORQUE TE LO HACE AUTOMÁTICO
        /*System.out.println("Array original: " + Arrays.toString(numeros));
        /*Arrays.sort(numeros);
        /*DE MENOR A MAYOR
        /*System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(numeros));
        /*DE MAYOR A MENOR
        /*Arrays.sort(numeros, Collections.reverseOrder());
        /*System.out.println("Array ordenado de mayor a menor: " + Arrays.toString(numeros));
        //* */

        for (int i = 0; i < numeros.length - 1; i++)
        {
            for (int i = 0; j < numeros.length - 1; j++)
            {
                if (numeros[j] > numeros[j+1])
                {
                    int temporal = numeros[j];

                    numeros[j] = numeros[j + 1];
                    //{3, 3, ...}
                }
            }
            
        }  

    }   
}
