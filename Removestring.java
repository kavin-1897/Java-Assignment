import java.util.Scanner;
public class Removestring{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String name =sc.nextLine();
     
      
      name=name.replace("I am","");
      
      

      System.out.println(name);
    }
}
