package Coche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("2468 ABC", "Opel", "Corsa");
        System.out.println(c);

        coche.hacerKm(750);
        System.out.println(c);

        coche.llenarDeposito();
        System.out.println(c);

        coche.hacerKm(500);
        System.out.println(c);

        coche.hacerKm(500);
        System.out.println(c);

        coche.hacerKm(1);
        System.out.println(c);

    }
}
