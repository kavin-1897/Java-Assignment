import java.util.Scanner;
public class checkdivisibility {
    public static void main(String args[]) {
     Scanner kv= new Scanner(System.in);
    int n=kv.nextInt();
    if((n%2==0||n%8==0)&&(n%12!=0))
     {
           System.out.print("True-The number passed above condition");
     }
     else
        {
            System.out.print("False-The number is not passed above condition");
        }
    }
}