package Day1407;

public class NumberReverseWithReturnType {

	
	
	public void reverseNUmber(int num) 
	{int rev = 0;
		while(num!=0) 
		{
			int temp= num%10;
			rev= rev*10 +temp;
			num= num/10;
		}
		System.out.println(rev);
		
	}
	
	public  boolean reverseNumberWithreturnType(int num) 
	{
		boolean isPanlidrome =false;
		int rev = 0;
		int orgNumber = num;
	
		while(num!=0) 
		{
			int temp= num%10;
			rev= rev*10 +temp;
			num= num/10;
			
		}
		
		if(rev==orgNumber) 
		{
			
			isPanlidrome= true;
		}
		else 
		{
			
			isPanlidrome= false;
		}
		
		
		return isPanlidrome;
	}
}
