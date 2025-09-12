package stringsProgram;

public class LengthOfLongestWordInString 
{


	public int longestWord(String line )
	{
		String[] words=line.split(" ");

		int Longlength=0;
		String PreviousWord="";

		for(int i= 0; i<=words.length-1;i++)
		{
			int temp = words[i].length();
			if(temp>Longlength)
			{
				Longlength=temp;
				if(Longlength==words[i].length()) 
				{
					PreviousWord = words[i];
				}
			}
		}
		System.out.println(PreviousWord);
		return Longlength;
	}
}
