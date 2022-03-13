import java.util.Scanner;
public class repition {
 public static void main(String argu[]) {
Scanner sc=new Scanner(System.in);
  String str = sc.nextLine();
  int count = 0;
  char[] rep = str.toCharArray();
  
  for (int i = 0; i < str.length(); i++) 
  {
   for (int j = i + 1; j < str.length(); j++) 
   {
    if (rep[i] == rep[j]) 
    {
     System.out.println(rep[j]);
     count++;
     break;
    }
   }
  }
 }
}