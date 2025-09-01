package stringsProgram;

public class PalindromStringCheck
{

	public boolean IspanlindromeCheck(String line) 
	{
		boolean Ispanlindrome= false;
		//line= line.toLowerCase();
		String rev= "";
		for(int i=line.length()-1;i>=0;i--) 
		{
			rev += line.charAt(i);
		}
		if(rev.equals(rev)) 
		{
			Ispanlindrome= true;
		}
		else 
		{
			Ispanlindrome= false;
		}
		return Ispanlindrome;
	}
}
