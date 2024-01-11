package Assignment11;

public class Assignment11c
{
	public static void main (String[] args)
	{
		System.out.println(pigLatin("chair"));
		System.out.println(pigLatin("mean"));
		System.out.println(pigLatin("able"));
		System.out.println(pigLatin("oolong"));


	}
	
	public static String pigLatin (String word)
	{
		String convertWord = word;
		boolean firstVowel = word.substring(0, 1).equals("a") || word.substring(0, 1).equals("e") 
								|| word.substring(0, 1).equals("i") || word.substring(0, 1).equals("o") 
								|| word.substring(0, 1).equals("u");
		boolean secondVowel = word.substring(1, 2).equals("a") || word.substring(1,2).equals("e") 
								|| word.substring(1,2).equals("i") || word.substring(1,2).equals("o") 
								|| word.substring(1,2).equals("u");
		

		if (firstVowel && secondVowel)
		{
			convertWord = word + "way";
		}
		else if (!firstVowel && !secondVowel)
		{
			convertWord = word.substring(1) + word.substring(0,1) + "ay";
		}
		
		else if (firstVowel || secondVowel)
		{
			convertWord = word.substring(1) + word.substring(0,1) + "ay";
		}
		
		return convertWord;
	}

}
