package stringsProgram;

public class WordCount
{
	
	public int CountOfWordInString(String line)
	{
		String[] Words= line.split(" ");
		int count = 0;
		
		for (String str: Words)
		{
			count++;
		}
		
	return count;
	}
	
}
