package Day1407;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number that you want to reverse");
		//int Number = sc.nextInt();
		int Number2= sc.nextInt();
		
		NumberReverseWithReturnType revnum= new NumberReverseWithReturnType();
		//revnum.reverseNUmber(Number);
		boolean status =revnum.reverseNumberWithreturnType(Number2);
		if(status) 
		{
			System.out.println("your number is a isPanlidrome number");
		}
		else 
		{
			System.out.println("your number is not a isPanlidrome number");
		}
		sc.close();
	}

	
}
