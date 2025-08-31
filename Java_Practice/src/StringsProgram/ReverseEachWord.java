package StringsProgram;

public class ReverseEachWord 
{
	public String ReverseWord(String line) 
	{
		String outPut="";
		
//		for(String word:words)
//		{
//			for(int i=word.length()-1;i>=0;i--) 
//			{
//				outPut = outPut+ word.charAt(i);
//			}
//			outPut = outPut + " ";
//		}
//		return outPut.trim();
		for(int i=line.length()-1;i>=0;i--) 
		{
			outPut= outPut+ line.charAt(i);
		}

		String[] Reversedwords= outPut.split(" ");
		String res="";
		
		for(int j=Reversedwords.length-1;j>=0;j--)
		{
			res = res+ Reversedwords[j]+" ";
		}
		
		return res.trim();
		
	}

}
