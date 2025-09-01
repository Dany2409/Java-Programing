package stringsProgram;

public class SwapFirstAndLastCharfromWord 
{
	public String ReversedCharFromWord(String line)
	{
		String outPut="";
		String[] words= line.split(" ");
		for(String s: words) 
		{
			if(s.length()>1)
			{
			String swapped= s.charAt(s.length()- 1) + s.substring(1, s.length()- 1) + s.charAt(0);
			outPut += swapped + " ";
			}
		}
		return outPut;
	}
}
