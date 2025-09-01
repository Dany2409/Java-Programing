package stringsProgram;

public class Stringprogram1 
{
	public String StringCap(String Line) 
	{
		String[] words = Line.split(" ");
		String outPut= "";
		int count=0;
		
		for(String word: words)
		{
			count++;
			if(count<=4) 
			{
				outPut= outPut+" "+ word.charAt(0) ;
			}
			else 
			{
				outPut =outPut+" "+word;
			}
			
		}
		return outPut.trim();
	}
}
