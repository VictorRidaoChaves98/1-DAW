public class LetrasMayusculasLuegoMinusculas
{
    public static void main (String[] args)
    {
        for(char letra = 'A'; letra <= 'Z'; letra++)
        {
            System.out.println(letra);
            System.out.println((char)(letra+('a' - 'A')));
        }
    }
    
}
