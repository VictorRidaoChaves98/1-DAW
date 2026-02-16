package com.miempresa.app;

public class Utils {

    public static String mayusculas(String texto) {
        return texto.toUpperCase(); // ❌ Error si texto es null
    }

    public static void bucleInfinito() {
        int i = 0;
        while (i >= 0) { // ❌ Bucle infinito
            System.out.println("Iteración: " + i);
            i--; // Nunca se detiene porque sigue siendo negativo
        }
    }
}