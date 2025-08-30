package Day0407;

public class Pattarn_printing 
{

	public static void main(String[] args) 
	{
		/*int rows = 5;

		for (int i = 1; i <= rows; i++) 
		{ // outer loop for rows
			for (int j = 1; j <= i; j++)
			{ // inner loop for columns
				System.out.print("* ");
			}
			System.out.println(); // move to next line after each row
		}*/
		{
			int rows = 5;

			for (int i= 1;i<=rows;i++) 
			{
				for (int j=1;j<=i;j++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for (int i= 5;i>=1;i--) 
			{
				for (int j=1;j<=i;j++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			
		}
	}

}



