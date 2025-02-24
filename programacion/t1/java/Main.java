public class Main {
    public static void main(String[] args) {
        String palabra = "ANAKIN";
        StringBuilder resultado = new StringBuilder();
        
        // Recorremos la palabra en saltos de 2 caracteres
        for (int i = 0; i < palabra.length(); i += 2) {
            // Comprobamos si hay suficiente longitud para formar un par
            if (i + 1 < palabra.length()) {
                // Intercambiamos los dos caracteres
                resultado.append(palabra.charAt(i + 1));  // Añadimos primero el segundo carácter del par
                resultado.append(palabra.charAt(i));      // Luego el primero
            } else {
                // Si solo hay un carácter (en caso de longitud impar), lo añadimos tal cual
                resultado.append(palabra.charAt(i));
            }
        }

        // Imprimimos el resultado final
        System.out.println(resultado.toString());
    }
}
