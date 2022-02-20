import java.util.Scanner;
public class Bmi {
    public static void main(String args[]) {
      float Weight,Height,BMI;
      Scanner sc=new Scanner(System.in);
      System.out.println("Your Height");
      Height=sc.nextFloat();
      System.out.println("Your Weight");
      Weight=sc.nextFloat();
      BMI=Weight/(Height*1.5f);
      

      System.out.println(BMI);
    }
}