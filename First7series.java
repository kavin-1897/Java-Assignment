import java.util.Scanner;
public class First7series {
    public static void main(String args[]) {
   int series=0;
   
    Scanner kv= new Scanner(System.in);
    int n=kv.nextInt();
    for(int i=1;i<=n;i++)
    {
        series=(i)*(6*i);
        
        System.out.println(series);
    }

      
    }
}