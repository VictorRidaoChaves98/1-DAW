/**
 * Introducir un total de horas y te dice las semanas/dias/horas equivalentes
 */

import java.util.Scanner;
public class TotalHoras
{
    public static void main(String[]args )
    {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Dame las horas: ");
        int totalHoras = teclado.nextInt();

        int semanas = totalHoras / 168;
        //Cada dia tiene 24 horas
        int dias = totalHoras % 168 / 24;
        //El resto son las horas
        int horas = (totalHoras % 168) % 24;

        System.out.println("\n" + totalHoras + " horas equivalen a");
        System.out.println("- semanas: " + semanas);
        System.out.println("- dias: " + horas);
        System.out.println(horas + "horas");

        sc.close();

    }
}