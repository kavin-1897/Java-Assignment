import java.util.Scanner;
public class Firstnseries {
    public static void main(String args[]) {
   int series=0;
   
    Scanner kv= new Scanner(System.in);
    int n=kv.nextInt();
    for(int i=1;i<=n;i++)
    {
        series=(4*i)+9;
        
        System.out.println(series);
    }

      
    }
}