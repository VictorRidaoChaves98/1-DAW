import java.util.*;

public class IntercalarArray
{   
    public static void main(String[] args)
    {
        
    
        Scanner console = new Scanner(System.in);

        int[] numeros1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numeros2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] numeros3 = new int[numeros1.length + numeros2.length];

        //Debe quedar: [1,2,3, 10,20,30, 4,5,6, 40,50,60, 7,8,9, 70,80,90]

        for(int i = 0; i < numeros1.length; i++)
        {
        numeros3[i] = numeros1[i];
        numeros3[i] = numeros2[i];
         }
    }

}
