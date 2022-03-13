import java.util.Scanner;
public class Exceptionhandling1
{
    public static void main(String kv[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      
    
        try
          {
              System.out.println(a/b);
    
          }
          catch(ArithmeticException k)
          {
             
             System.out.println(k.getMessage());
             System.out.print(k.toString());
          }
    }
}