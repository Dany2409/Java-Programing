package StringsProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString 
{
	public String RemoveDuplicate(String line) 
	{
		String outPut = "";
		LinkedHashSet<Character> Set  = new LinkedHashSet<Character>();
		for(int i= 0; i<=line.length()-1;i++) 
		{
			 Set.add(line.charAt(i));
		}
		
		for(char c:Set) 
		{
			outPut +=c;
		}
		
		return outPut;
	}
}
