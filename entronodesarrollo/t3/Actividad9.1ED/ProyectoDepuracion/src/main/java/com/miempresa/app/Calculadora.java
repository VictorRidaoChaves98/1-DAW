package com.miempresa.app;

public class Calculadora {

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; // Evita la excepción
        }
        return a / b;
    }

    public int sumaArray(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) { // Corregido: "<" en lugar de "<="
            suma += numeros[i];
        }
        return suma;
    }
}