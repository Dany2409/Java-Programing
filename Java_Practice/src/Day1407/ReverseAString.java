package Day1407;

import java.util.Scanner;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a line to reverse-");
			
			String text= sc.nextLine();
			String revtext="";
		System.out.println("You have entered:- "+ text);
		
		for(int i= text.length()-1;i>=0;i--)
		{
			revtext= revtext + text.charAt(i);	
			//ystem.out.println("Reverse String is in progress :- "+ revtext );
		}
		
		System.out.println("<----------------------------------------------------->");
		System.out.println("Your Final Reverse text is:- "+ revtext);
		sc.close();
	}

}
