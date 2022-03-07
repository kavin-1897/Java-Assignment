import java.util.Scanner;
public class SearchString {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String name= sc.nextLine();
		int intIndex = name.indexOf("kavin");
		if(intIndex == - 1) {
			System.out.println("kavin not found");
		} else {
			System.out.println("Found kavin at index "+ intIndex);
		}
	}
}