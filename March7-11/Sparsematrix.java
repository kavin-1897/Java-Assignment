import java.util.Scanner;
public class Sparsematrix
{
    public static void main(String[] kv)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[m][n];
        m=arr.length;
         n=arr[0].length;
        int size=m*n;
        int count=0;
      
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 int value=sc.nextInt();
                arr[i][j]=value;
                if(arr[i][j]==0)
                {
                    count++;
                }
            }
        }
        if(count>(size/2))
        {
            System.out.print("It is a sparse matrix");
        }else{
            System.out.print("Not a sparse matrix");
        }
    }
}