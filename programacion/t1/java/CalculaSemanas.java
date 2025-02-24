import java.util.Scanner;

public class CalculaSemanas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Horas totales: ");
		int horasTotal = teclado.nextInt();
		
		int semanas = horasTotal / 168;
		int dias = horasTotal % 168 / 24;
		int horas = (horasTotal % 168) % 24;
		
		System.out.println("\n" + horasTotal + " horas equivalen a");
		System.out.println("- Semanas: " + semanas);
		System.out.println("- Dias: " + dias);
		System.out.println("- Horas: " + horas);
		
		teclado.close();
	}

}