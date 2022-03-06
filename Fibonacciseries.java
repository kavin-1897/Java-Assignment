import java.util.Scanner;
public class Fibonacciseries
{
    public static int Fibonacci(int n)
    {
        int firstterm=0;
        int secondterm=1;
        int nterm=0;
        int count=0;
        
        System.out.print(firstterm+" ");
        System.out.print(secondterm+" ");
        for(int i=1;i<=n-2;i++)
        {
            nterm=firstterm+secondterm;
          firstterm=secondterm;
          secondterm=nterm;
          count++;
          System.out.print(nterm+" ");
         
        }return nterm;
    }
    public static void main(String[] kv)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nterm=Fibonacci(n);
       
    }
}