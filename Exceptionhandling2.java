import java.util.Scanner;
public class Exceptionhandling2
{
    public static void main(String kv[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      
    
        try
          {
              {
              
          if(b==0)
             throw new ArithmeticException("ArithmeticException");
              }
    
          }
          catch(ArithmeticException k)
          {
             
             System.out.println(k.getMessage());
             System.out.print(k.toString());
          }
    }
}