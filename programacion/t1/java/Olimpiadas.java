public class olimpiadas {

    public static void menu(){
        System.out.println("Bienvenido al programa, selecione una oppción");
        System.out.println("\t1) Registrar atleta");
        System.out.println("\t2) Ver máximo de atleta");
        System.out.println("\t3) Ver ganadores");
        System.out.print("Opción elegida");
    }

    public static String[][] registrarAtleta(String[][] atletas, String[] nuevoAtleta){
        //TODO Añadir atleta al array

        System.out.println("registrarAtleta");
        return atletas;
    }

    public static double calcularMaxAtleta(String[] atleta){
        //TODO Calcular reto máximo del atleta

        System.out.println("calcularMaxAtleta");
        return 0;

    }

    public static String[] calcularGanadores(String[][] atletas){
        String[] ganadores = new String[3];
        //TODO Devolver en orden los 3 ganadores

        System.out.println("calcularGanadores");
        return ganadores;
    }
}

