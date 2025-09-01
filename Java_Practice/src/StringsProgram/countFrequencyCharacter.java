package stringsProgram;

import java.util.LinkedList;
import java.util.List;

public class countFrequencyCharacter 
{
	public void countFrequency(String line) 
	{
		//char[] ch = line.toCharArray();

		List<Character> counted = new LinkedList<Character>();
		for(int i = 0; i < line.length(); i++)
		{
			char c = line.charAt(i);

			if (!counted.contains(c)) 
				{
					int count = 0;
					for (int j = 0; j < line.length(); j++) 
					{
					if (line.charAt(j) == c) 
						{
							count++;
						}
					}
					System.out.println(c + " -> " + count);
					counted.add(c); // mark this character as counted
				}
		}
	}
}
