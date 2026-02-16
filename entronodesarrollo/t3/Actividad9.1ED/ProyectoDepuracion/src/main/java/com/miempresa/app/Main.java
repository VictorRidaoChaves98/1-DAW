package com.miempresa.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Calculadora calc = new Calculadora();
        System.out.println("División: " + calc.dividir(10, 5)); // Error solucionado

        int[] numeros = {1, 2, 3};
        System.out.println("Suma del array: " + calc.sumaArray(numeros)); // Error solucionado

        System.out.println(Utils.mayusculas("Me gustan las oreo del lidl")); // Error solucionado

        Utils.bucleFinito(); // Error solucionado
    }
}