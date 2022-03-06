import java.util.Scanner;
public class addmethod {
    public static int add(int a,int b) {
   int sum=a+b;
     
     return sum;
     
     
    }

public static void main(String kv[])
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
   int sum=add(a, b);
   System.out.println(sum);
}
}