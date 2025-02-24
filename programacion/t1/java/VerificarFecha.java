import java.util.Scanner;
public class VerificarFecha
{
    /**
     * DIA
     * MES
     * AÑO
     * EJEMPLO:
     * 01
     * 02
     * 2024
     * ------
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;

        System.out.println("Dime una dia");
        dia = sc.nextInt();

        System.out.println("Dime un mes");
        mes = sc.nextInt();

        System.out.println("Dime un año");
        anio = sc.nextInt();

        boolean validarDias = true;

        if(dia <= 0 || dia > 31 || anio < 1900 || mes < 1 || mes > 12)
        {
            validarDias = false;
        }
        
        // COMPROBACION SI LA FECHA ES O NO CORRECTA
           
        if (validarDias)
        {
            switch (mes)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    validarDias = dia >= 1 && dia <= 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:

                    validarDias = dia >= 1 && dia <=30;
                    break;

                case 2:

                    boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

                    if (esBisiesto){
                        validarDias = dia >= 1 && dia <= 29;
                    }
                    else 
                    {
                        validarDias = dia >= 1 && dia <= 28;
                    }
                    break;
                default:
                    validarDias = false;
                break;
            
            }
        }

        if (validarDias)
        {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es una fecha valida");
        }
        else
        {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es una fecha valida");
        }

        sc.close();

       

        
    }
}