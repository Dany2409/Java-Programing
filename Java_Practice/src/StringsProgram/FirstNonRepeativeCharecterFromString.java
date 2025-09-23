package stringsProgram;

public class FirstNonRepeativeCharecterFromString 
{

	public Character  NonRepeatingChar(String line) 
	{ 
		for (int i=0;i<line.length();i++) 
		{
			char c= line.charAt(i);
			int count = 0;
			for (int j=0;j<line.length();j++) 
			{
				if(line.charAt(j)==c)
					{count++;}
			}
			if(count==1)
			{
				return c;
			}
		
		}
		return null;
		
	}
}




