
public class Vowels 
{
	public static void main (String[] args)
	{
		System.out.println(findVowels("JOYCE"));
	}
	//a second method that counts the number of vowels in a sentence
	//returns the number of vowels
	public static int findVowels (String str)
	{
		int numberVowels = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.substring(i, i + 1).equalsIgnoreCase("a") || str.substring(i, i + 1).equalsIgnoreCase("e")
				|| str.substring(i, i + 1).equalsIgnoreCase("i") || str.substring(i, i + 1).equalsIgnoreCase("o")
				|| str.substring(i, i + 1).equalsIgnoreCase("u"))
				
			{
				numberVowels++;
			}
		}
		
		return numberVowels;
	}
}
