package Day0807;


public class ReverseAString 
{  
	
	public static String  ReverseString(String str) 
	{
		String Revline="";
		
		for(int i= str.length()-1;i>=0;i--) 
		{
			 Revline= Revline+str.charAt(i);
		}
		return Revline;
		
		
	
	}

}
