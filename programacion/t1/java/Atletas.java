import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Atletas {
    public static void main(String[] args) {
        // Define una lista de atletas con sus respectivos saltos
        List<Atleta> atletas = new ArrayList<>();
        atletas.add(new Atleta("Atleta 1", new double[] {10.2, 10.5, 10.8}));
        atletas.add(new Atleta("Atleta 2", new double[] {9.8, 10.1, 10.3}));
        atletas.add(new Atleta("Atleta 3", new double[] {10.9, 11.1, 11.2}));
        // Agrega más atletas aquí...

        // Calcula la media de los saltos para cada atleta
        for (Atleta atleta : atletas) {
            double mediaSaltos = calcularMediaSaltos(atleta);
            System.out.println(atleta.getNombre() + ": " + String.format("%.2f", mediaSaltos));
        }

        // Determina a los ganadores (los atletas con la media de saltos más alta)
        Collections.sort(atletas, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta a1, Atleta a2) {
                return Double.compare(calcularMediaSaltos(a2), calcularMediaSaltos(a1));
            }
        });
        System.out.println("\nGanadores:");
        for (int i = 0; i < 3; i++) {  // Muestra los 3 primeros lugares
            Atleta atleta = atletas.get(i);
            System.out.println((i + 1) + ". " + atleta.getNombre() + " - Media de saltos: " + String.format("%.2f", calcularMediaSaltos(atleta)));
        }
    }

    // Método para calcular la media de los saltos de un atleta
    public static double calcularMediaSaltos(Atleta atleta) {
        double suma = 0;
        for (double salto : atleta.getSaltos()) {
            suma += salto;
        }
        return suma / atleta.getSaltos().length;
    }
}

class Atleta {
    private String nombre;
    private double[] saltos;

    public Atleta(String nombre, double[] saltos) {
        this.nombre = nombre;
        this.saltos = saltos;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getSaltos() {
        return saltos;
    }
}

/*
 * Este código define una lista de atletas con sus respectivos saltos, calcula
 * la media de los saltos para cada atleta y determina a los ganadores
 * (los atletas con la media de saltos más alta).
 * Puedes agregar más atletas a la lista y personalizar el código según tus necesidades.
 */