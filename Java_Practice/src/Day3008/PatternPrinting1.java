package Day3008;

public class PatternPrinting1 
{

	public void printPattern(int n) 
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				for(int k=1;k<=j;k++) 
				{
					
						System.out.print(j);
				}
			}

			System.out.println();
		}
		
	}
}
