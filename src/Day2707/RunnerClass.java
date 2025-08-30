package Day2707;

import java.util.Scanner;

public class RunnerClass extends OddEvenNumber
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number that u want to check ");
		int checknumber =sc.nextInt();
		RunnerClass rc= new RunnerClass();
		boolean OddEven = rc.findOddOrEven(checknumber);
		if(OddEven) 
		{
			System.out.println(checknumber+ " is a Even Number ");
		}
		else
		{
			System.out.println(checknumber+ " is a odd Number ");
		}
		sc.close();
		
	}

	
}
