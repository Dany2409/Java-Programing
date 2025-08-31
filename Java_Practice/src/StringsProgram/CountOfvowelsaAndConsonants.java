package StringsProgram;

public class CountOfvowelsaAndConsonants
{
	public int[] CountOfVowelsAndConsonants(String line)
	{
		int vowels=0;
		int consonants= 0;
		int specialCharacters = 0;
		line = line.toLowerCase();
		for(int i= 0;i<=line.length()-1;i++)
		{
			char ch= line.charAt(i);
			if(ch>='a' && ch <='z')
				{
					if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u') 
					{
						vowels++;
					}
					else
					{
						consonants++;
					}
				}
			else 
				{
					specialCharacters++;
				}
		}

		return new int[] {vowels, consonants,specialCharacters};
	}


}
