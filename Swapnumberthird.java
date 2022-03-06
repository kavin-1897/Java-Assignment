import java.util.Scanner;
public class Swapnumberthird
{
    public static void main(String kv[])
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int temp;
       a=a+b;
       b=a-b;
       a=a-b;
       
       System.out.println(a+" "+b);
     
    }
}