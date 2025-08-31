package StringsProgram;

public class LargestWordInString
{
	public String findLargestWord(String line) 
	{
		String largestWord= "";
		String[] words= line.split(" ");
		int highestLenght = 0;
		int temp=0;
		for(String w: words)
		{
			temp= w.length();
			if(temp>highestLenght) 
			{
				highestLenght=temp;
				largestWord= w;
			}else
			{
				temp=highestLenght;
			}
		}
		
		return largestWord;
	}
}
