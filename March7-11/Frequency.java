import java.util.Scanner;
public class Frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      
        int n=sc.nextInt();
   
        int m=sc.nextInt();
      
        
      int arr[][]=new int[n][m];
      m=arr[0].length;
         n=arr.length ;    
     
      
    int counteven=0;
    int countodd=0;
     for(int i=0;i<n;i++)
     {
         for (int j=0;j<m;j++)
         {
             int value=sc.nextInt();
      
             arr[i][j]=value;
             {
             if((arr[i][j])%2==0)
             {
                 counteven++;
             }else
                {
                countodd++;
                }
             }
             
         }

      
    }
    System.out.println("The frequency of even "+counteven);
     System.out.println("The frequency of odd "+countodd);
   }
}