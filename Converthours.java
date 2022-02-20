import java.util.Scanner;
public class Converthours
{
    public static void main(String kv[])
    {
        int hours;
        float days;
        float year;
        Scanner sc=new Scanner(System.in);
        hours=sc.nextInt();
        days=hours*0.0416667f;
        year=hours*0.000114155f;
        System.out.println(hours+"hours"+"="+days+"days");
        System.out.print(hours+"hours"+"="+year+"years");
        
    }
}