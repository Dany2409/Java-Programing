package stringsProgram;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateFromString 
{
	public String RemoveDuplicate(String line) 
	{
		String outPut = "";
//		LinkedHashSet<Character> Set  = new LinkedHashSet<Character>();
//		for(int i= 0; i<=line.length()-1;i++) 
//		{
//			 Set.add(line.charAt(i));
//		}
//		
//		for(char c:Set) 
//		{
//			outPut +=c;
//		}
//		
//		return outPut;
		
		
		
		
		List<Character> ch= new LinkedList<Character>();
		for(int i=0;i<=line.length()-1;i++) 
		{
			if(!ch.contains(line.charAt(i))) 
			{
				ch.add(line.charAt(i));
			}
			
		}
		for(char c: ch) 
		{
			outPut+=c;
		}
		
		return outPut;

	}
}
