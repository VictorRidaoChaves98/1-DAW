public class TrianguloAbecedario
{
    public static void main(String[] args)
    {
       for(int i = 0; i <= 'Z'-'A'; i++)
       {
              for(char c = (char)('Z'-i); c >= 'A'; c--)
              {
                     System.out.print(c);
              }
              System.out.println();
       }
    }
}