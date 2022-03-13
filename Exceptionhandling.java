import java.util.Scanner;
public class Exceptionhandling
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
          finally
          {
             System.out.print("don't divide by zero");
          }
    }
}