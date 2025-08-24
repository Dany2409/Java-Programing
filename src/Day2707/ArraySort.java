package Day2707;

public class ArraySort 
{

	public static void main(String[] args) 

	{
		int num[]= {43,63,78,22,9,6,54,64,99,68,0,1};
		int n= num.length;
		for(int i=0; i<=n-1;i++)
		{
			for(int j=0 ; j<=n-2-i;j++) 
			{ 
				if(num[j]>num[j+1]) 
				{
					int temp= num[j];
					num[j]=num[j+1];
					num[j+1]= temp;		
				}
				
			}
		}
		System.out.println("Sorted Array");
		for(int k:num )
			{System.out.println(k);}
		}
}
