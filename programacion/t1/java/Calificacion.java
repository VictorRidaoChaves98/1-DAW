/**
 * CALIFICACION: Introducir una calificacion de 0-10 y decir si es:
 * 0 < 5 => INSUFICIENTE
 * 5 => SUFICIENTE
 * 6 => BIEN
 * 7 - 8 => NOTABLE
 * 9 - 10 => SOBRESALIENTE

**/
import java.util.Scanner;

public class Calificacion
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nota del alumno");

        int nota = sc.nextInt();
        {
            if(nota < 5)
            {
                System.out.println("insuficiente");
            }
            else
            {
               if(nota == 5)
               {
                System.out.println("suficiente");
               } 
               else
               {
                if(nota == 6)
                {
                 System.out.println("bien");
                }
                else
                {
                    if(nota == 7)
                    {
                        System.out.println("notable");
                    }
                    else
                    {
                        if(nota == 8)
                        {
                            System.out.println("notable");
                        }
                        else
                        {
                            if(nota == 9)
                            {
                                System.out.println("sobresaliente");
                            }
                            else
                            {
                                if(nota == 10)
                                {
                                    System.out.println("sobresaliente");
                                }
                            }
                        }
                    }
                }
               }
            }
        }
    }
}