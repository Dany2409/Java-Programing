package Day3008;

import java.util.LinkedList;
import java.util.List;


public class removeDuplicatefromString 
{
	public String removeStringDuplicate(String line) 
	{
		List<Character> WithoutDuplicate = new LinkedList<Character>();

		for (int i= 0; i<=line.length()-1;i++) 
		{
			if (!WithoutDuplicate.contains(line.charAt(i))) 
			{
				WithoutDuplicate.add(line.charAt(i));
				//WithoutDuplicate.remove(i);
			}
			//			else 
			//			{
			//				
			//			}
		}

		String result = "";
		for (char c: WithoutDuplicate ) 
		{
			result=  result+c;
		}
		return result;
	}

	

}
