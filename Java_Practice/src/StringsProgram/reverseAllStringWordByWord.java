package stringsProgram;

public class reverseAllStringWordByWord 
{
	public String ReversedString(String line) 
	{
		String outPut="";
		String[] words=line.split(" ");
		for(int i=words.length-1; i>=0;i--) 
		{
			outPut +=words[i] +" ";
		}
		return outPut;
	}
}
