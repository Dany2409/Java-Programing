package Day0407;
import java.util.Scanner;

import Day0807.ReverseAString;
public class Runner
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		HR abc= new HR();
//		boolean status= abc.isAllowed(7, null, false);
//		System.out.println(status);
		 
		System.out.println("Enter a line to reverse");
		String line= sc.nextLine();	
		
		String REV= ReverseAString.ReverseString(line);
		System.out.println(REV);
		sc.close();
	}
	
}
