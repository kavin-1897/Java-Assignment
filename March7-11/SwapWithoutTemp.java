import java.util.Scanner;
public class SwapWithoutTemp {  
    public static void main(String args[]) {  
       Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String b =sc.nextLine();  
        System.out.println("Before :" +a+ " "+b); 
        a = a + b;  
        b = a.substring(0, a.length() -b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  
   