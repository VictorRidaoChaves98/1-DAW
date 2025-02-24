/*
 * Carácteres especiales (emojis)
 */

 import java.nio.charset.StandardCharsets;

 public class EmojiTest {
     public static void main(String[] args) {
         // Configurar salida estándar para UTF-8
         System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
         
         // Imprimir emojis
         System.out.println("Hola Mundo 🌍 🚀 🎉");
     }
 }
 