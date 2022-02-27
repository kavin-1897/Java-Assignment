import java.util.Scanner;
public class Branchyear
{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    String Branch=sc.next();
    switch(year)
    {
      
        case 1:System.out.print("common subject");
        break;
        case 2:System.out.println("2nd year");
        
             switch(Branch)
            {
                case "Civil":System.out.println("RCC");
                 break;
                 case "Cse":System.out.println("Dss");
                 break;
                 case "It":System.out.println("EG");
                 break;
                 case "Mech":System.out.println("EM");
                 break;
                 default:System.out.println("not valid branch");
                  break;
            }break;
        case 3:System.out.println("3rd year");
        
            switch(Branch)
            {
                case "Civil":System.out.println("Sm");
                 break;
                 case "Cse":System.out.println("Cc");
                 break;
                 case "It":System.out.println("DSA");
                 break;
                 case "Mech":System.out.println("KF");
                 break;
                 default:System.out.println("not valid branch");
                  break;
            }break;
        case 4:System.out.println("your final year");
        
        
            switch(Branch)
            {
                case "Civil":System.out.println("MSWM");
                 break;
                 case "Cse":System.out.println("DA");
                 break;
                 case "It":System.out.println("CS");
                 break;
                 case "Mech":System.out.println("FM");
                 break;
                 default:System.out.println("not valid branch");
                 break;
            }break;
             default:System.out.println(" not valid year");
            break;
        
    } 
            
    
    
    
  }
  
    
}
