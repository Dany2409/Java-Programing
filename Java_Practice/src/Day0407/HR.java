package Day0407;

public class HR 
{	
	public boolean isAllowed(int workingDays,String Clothes, boolean isIdPrestent)
	{
		boolean temp = false;
		if(workingDays <= 5) 
		{
			System.out.println("Working days");
			temp = true;
			if(Clothes.equals("Formal"))
			{
				System.out.println("Employee IN FORMAL LOOK	");
				 temp = true;
			}else
			{
		
			}
			
			
		}else 
		{
			temp= false;
		}
		if(temp) 
		{
			System.out.println("You are allowed");
		}
		else 
		{
			System.out.println("You are not allowed");
		}
		
		return temp;
	}

}
