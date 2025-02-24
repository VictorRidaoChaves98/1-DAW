/*
 * Implemente una función que sirva para cifrar un texto con el conocido método de César.
 * El criptosistema consiste en el desplazamiento de 3 caracteres en la posición  del carácter 
 * a cifrar, es decir, la A se sustituye por la D, la B por la E, ..., la X por la A, la Y por la B,
 * y la Z por la C. Por simplicidad, supondremos que el texto a cifrar solo contiene caracteres alfabéticos.
 * Implementar la siguiente función:
 */
public class CifradoCesar 
{
    final static String diccionario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ_";

    public static void main(String[] args) 
    {
        String cadenaACifrar = "HOLA_MUNDO";

        String cadenaCifrada = cifrar(cadenaACifrar);

        System.out.println(cadenaCifrada);

        String cadenaDescifrada = descifrar(cadenaCifrada);

        System.out.println(cadenaDescifrada);
    }

    public static String cifrar(String[] cadenaACifrar)
    {
        int numeroDeLetras = 23;

        for(int i = 0; i < letras.length; i++)
        {
            
        }
    }
}