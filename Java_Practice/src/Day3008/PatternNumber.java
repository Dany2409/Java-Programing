package Day3008;

public class PatternNumber 
{
	public void printPattrn(int n) 
	{
		for(int i=1; i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=n-1; i>0;i--) 
		{
			for(int j=i;j>0;j--) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
