public class Main
{
    public static void main(String[] args)
    {
        Lavadora lavadora1 = new Lavadora("Samsung", 1000, 1.5, true);
        Lavadora lavadora2 = new Lavadora("LG", 1.2);

        System.out.println(lavadora1);
        System.out.println("Consumo en 5 horas: " + lavadora1.getConsumo(5) + " kW");
        System.out.println("Coste de consumo en 5 horas (0.15€/kW): " + lavadora1.getCosteConsumo(5, 0.15) + "€");
        
        System.out.println();
        System.out.println(lavadora2);
        System.out.println("Consumo en 5 horas: " + lavadora2.getConsumo(5) + " kW");
        System.out.println("Coste de consumo en 5 horas (0.15€/kW): " + lavadora2.getCosteConsumo(5, 0.15) + "€");
    }
}