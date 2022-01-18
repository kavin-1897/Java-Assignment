 
import java.util.*; 
public class FindperfectSquare{ 
public static void main(String[] args){ 
int num,count =0; 
     Scanner sc=new Scanner(System.in);
      num=sc.nextInt(); 
     System.out.print(""); 
      for(int i=1;i<=num;i++)
      { 
       if(num%i==0)
       { 
    count=count+1; 
} 
}     
    if(count%2==0)
    { 
    System.out.println(num+" is not perfect square");
     
} else
{ 
     System.out.println(num+" is perfect square"); 
} 
} 
}
 