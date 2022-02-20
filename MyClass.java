import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    float inches;
    float meter;
        Scanner sc=new Scanner(System.in);
         inches=sc.nextFloat();
        meter=inches*0.0254f;
    System.out.print(inches+" inches"+"="+meter+" meters");
    }
}