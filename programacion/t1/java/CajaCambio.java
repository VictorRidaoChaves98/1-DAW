import java.util.Scanner;

public class CajaCambio 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Importe a pagar: ");
        double importePago = sc.nextDouble();

        System.out.println("Importe pagado: ");
        double importePago = sc.nextDouble();

        // Cantidad a devolver

        if (importePago >= importePagado) 
        {
            double cantidadADevolver = importePagado - importePago;

            System.out.printf("Cantidad a Devolver: %.2f\n", cantidadADevolver);

            // Separar la parte entera y decimal
            int billetes = (int) cantidadADevolver;
            int monedas = (int) Math.round((cantidadADevolver - billetes) * 100);

            // Desglosar
            System.out.println("Dinero a devolver: ");

            // BILLETES de 500
            if (billetes >= 500) 
            {
                int billetes500 = billetes / 500;
                billetes %= 500;

                System.out.println(billetes500 + " billete(s) de 500 euros");
            }

            // BILLETES de 200
            if (billetes >= 200) 
            {
                int billetes200 = billetes / 200;
                billetes %= 200;

                System.out.println(billetes200 + " billete(s) de 200 euros");
            }

            // BILLETES de 100
            if (billetes >= 100) 
            {
                int billetes100 = billetes / 100;
                billetes %= 100;

                System.out.println(billetes100 + " billete(s) de 100 euros");
            }

            // BILLETES de 50
            if (billetes >= 50) 
            {
                int billetes50 = billetes / 50;
                billetes %= 50;

                System.out.println(billetes50 + " billete(s) de 50 euros");
            }

            // BILLETES de 20
            if (billetes >= 20) 
            {
                int billetes20 = billetes / 20;
                billetes %= 20;

                System.out.println(billetes20 + " billete(s) de 20 euros");
            }

            // BILLETES de 10
            if (billetes >= 10) 
            {
                int billetes10 = billetes / 10;
                billetes %= 10;

                System.out.println(billetes10 + " billete(s) de 10 euros");
            }

            // BILLETES de 5
            if (billetes >= 5) 
            {
                int billetes5 = billetes / 5;
                billetes %= 5;

                System.out.println(billetes5 + " billete(s) de 5 euros");
            }

            System.out.println("Monedas a devolver: ");

            if (billetes >= 2) 
            {
                int moneda2 = billetes / 2;
                billetes %= 2;

                System.out.println(moneda2 + " moneda(s) de 2 euros");
            }

            if (billetes >= 1) 
            {
                int moneda1 = billetes / 1;
                billetes %= 1;

                System.out.println(moneda1 + " moneda(s) de 1 euros");
            }

            if (monedas >= 50) 
            {
                int moneda50 = monedas / 50;
                monedas %= 50;

                System.out.println(moneda50 + " moneda(s) de 0.50 euros");
            }

            if (monedas >= 20) 
            {
                int moneda20 = monedas / 20;
                monedas %= 20;

                System.out.println(moneda20 + " moneda(s) de 0.20 euros");
            }

            if (monedas >= 10) 
            {
                int moneda10 = monedas / 10;
                monedas %= 10;

                System.out.println(moneda10 + " moneda(s) de 0.10 euros");
            }

            if (monedas >= 5) 
            {
                int moneda5 = monedas / 5;
                monedas %= 5;

                System.out.println(moneda5 + " moneda(s) de 0.05 euros");
            }

            if (monedas >= 2) 
            {
                int moneda2 = monedas / 2;
                monedas %= 2;

                System.out.println(moneda2 + " moneda(s) de 0.02 euros");
            }

            if (monedas >= 1) 
            {
                System.out.println("1 moneda de 0.01 euros");
            }
        } else 
        {
            System.out.println("HOY NO SE FIA, MAÑANA");
        }

        sc.close();
    }
}