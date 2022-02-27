import java.util.Scanner;
public class First3terms {
    public static void main(String args[]) {
      int terms=0;
      int count=0;
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;count<=n-1;i++)
    {
        terms=(4*i)+9;
        
        if(terms%3==0)
        {
            count++;
            System.out.println(terms);
        }
        
    }

    
    }
}