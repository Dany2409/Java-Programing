package stringsProgram;

import java.util.Scanner;

public class RunnerClassStringPrograms 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the line");
		String line = sc.nextLine();
//		Stringprogram1 sp= new Stringprogram1();
//		String FinalResult =sp.StringCap(line);
//		System.out.println(FinalResult);
//		Extract1stLaterFromString elfs= new Extract1stLaterFromString();
//		System.out.println(elfs.ExtractFirstChar(line));
		
//		ReverseEachWord rew= new ReverseEachWord();
//		System.out.println(rew.ReverseWord(line));
		
//		CountOfvowelsaAndConsonants covac= new CountOfvowelsaAndConsonants();
//		int[] count = covac.CountOfVowelsAndConsonants(line);
//		System.out.println("vowels is :- "+ count[0]);
//		System.out.println("consonants is :- "+ count[1]);
//		System.out.println("specialCharacters is :- "+ count[2]);
//		
//		for(int c:count ) 
//		{
//			System.out.println(c);
//		}
		
//		PalindromStringCheck psc= new PalindromStringCheck();
//		boolean result =psc.IspanlindromeCheck(line);
//		if (result) 
//		{
//			System.out.println(line + " is panlidrome String");
//		}
//		else 
//		{
//			System.out.println(line + " is not a panlidrome String");
//		}
//		
//		RemoveDuplicateFromString rdfs= new RemoveDuplicateFromString();
//		System.out.println(rdfs.RemoveDuplicate(line));
		
//		LargestWordInString lwis= new LargestWordInString();
//		System.out.println(lwis.findLargestWord(line));
		
//		SwapFirstAndLastCharfromWord sfalcfw=new SwapFirstAndLastCharfromWord();
//		String result= sfalcfw.ReversedCharFromWord(line);
//		System.out.println(result);
		
		
//		countFrequencyCharacter cfc = new countFrequencyCharacter();
//		cfc.countFrequency(line);

		reverseAllStringWordByWord raswbw= new reverseAllStringWordByWord();
		String Result =raswbw.ReversedString(line);
		System.out.println(Result);
		
		
		
		
		
		
		
		sc.close();
	}
}
