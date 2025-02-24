public class Operadores{
    public static void main(String[] args){

        //ARITMETICOS

        int suma = 3 + 4; // 7
        int resta = 3 - 4; // -1
        int multiplicacion = 3 * 4; // 12
        int division = 3 / 4; // 0
        int modulo = 3 % 4; // 3

        // ASIGNACION

        int directo = 123;
        int acumulador = 0;
        int cuenta = 15;
        acumulador = acumulador + 1; // 1 ESTE ES MAS PRIMITIVO
        acumulador++; // 2 FORMA REDUCIDA  PRIMERO USO LUEGO SUMO (SOLO PARA UNO, EVITAR ERRORES)
        ++acumulador; // 3 PRIMERO SUMO LUEGO USO
        acumulador += 2; // 5 FORMA REDUCIDA (MEJOR)

        int numero = 0;
        System.out.println(++numero);
        System.out.println(acumulador);
    }
}