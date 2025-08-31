package StringsProgram;

public class Extract1stLaterFromString 
{
	public String ExtractFirstChar(String line) 
	{
		String output = "";
		String[] words=line.split(" ");
		int C= 0;
		
		
		for(String word: words)
		{ 
			C++;
			if(C<=words.length) 
			{
				output += word.charAt(0) + " ";
			}
		}
		return output.trim();
	}
}
