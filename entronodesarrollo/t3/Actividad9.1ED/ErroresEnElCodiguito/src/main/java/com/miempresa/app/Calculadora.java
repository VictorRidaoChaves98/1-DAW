package com.miempresa.app;

public class Calculadora {

    public int dividir(int a, int b) {
        return a / b; // ❌ Posible división por cero
    }

    public int sumaArray(int[] numeros) {
        int suma = 0;
        for (int i = 0; i <= numeros.length; i++) { // ❌ Error: índice fuera de rango
            suma += numeros[i];
        }
        return suma;
    }
}