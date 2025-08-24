package Day2707;

public class OddEvenNumber 
{
	boolean isEven=false ;
	boolean findOddOrEven(int num) 
	{
		if (num%2==0) 
		{
			isEven=true;
		}
//		else 
//		{
//			return isoOddd;
//		}
		System.out.println(isEven);
		return isEven;
	}

}
