package com.miempresa.app;

public class Utils {

    public static String mayusculas(String texto) {
        if (texto == null) {
            return "Error: Texto nulo"; // Evita la NullPointerException
        }
        return texto.toUpperCase();
    }

    public static void bucleFinito() { // Cambio de nombre para evitar confusión
        int i = 0;
        while (i < 5) { // Ahora el bucle se ejecuta solo 5 veces
            System.out.println("Iteración: " + i);
            i++;
        }
    }
}