import java.util.Scanner;
public class FtoC
{
    public static void main(String kv[])
    {
        float C,F;
        Scanner sc=new Scanner(System.in);
        C=sc.nextFloat();
        F =((C*9)/5)+32;  
        System.out.print(C+"=" +"your Fahrenheit value : "+F);
    }
}