import java.util.Scanner;
public class Lowertriangle {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int m=sc.nextInt();
     int n=sc.nextInt();
     int arr[][]=new int[m][n];
     int val=0;
     {
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 val=sc.nextInt();
                 arr[i][j]=val;
                
                
             }
            
         }
        
     }
       
        for(int i=0;i<m;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 
                 System.out.print(arr[i][j]+" ");
                
             }
             System.out.println();
         }
     
      

      
    }
}