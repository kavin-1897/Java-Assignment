import java.util.Scanner;
public class sumAscii {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    char x=sc.next().charAt(0);
    char y=sc.next().charAt(0);
    char z=sc.next().charAt(0);
    int sumascii=(int)(x+y+z);

      System.out.println(sumascii);
    }
}