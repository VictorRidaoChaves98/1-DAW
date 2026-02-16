package com.miempresa.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Calculadora calc = new Calculadora();
        System.out.println("División: " + calc.dividir(10, 0)); // ❌ Provoca error

        int[] numeros = {1, 2, 3};
        System.out.println("Suma del array: " + calc.sumaArray(numeros)); // ❌ Índice fuera de rango

        System.out.println(Utils.mayusculas(null)); // ❌ NullPointerException

        Utils.bucleInfinito(); // ❌ Bucle infinito
    }
}